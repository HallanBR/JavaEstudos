package Estudos.Questoes.Udemy.Basico.Outros;
import java.util.Scanner;

public class Lote{

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            
            

            double largura = sc.nextDouble();
            double comprimento = sc.nextDouble();
            double metroQuadrado = sc.nextDouble();

            double area = largura * comprimento;
            double preco = area * metroQuadrado;

            System.out.println("a area e " + area);
            System.out.println("o valor do lote e " + preco);

            sc.close();
}
}