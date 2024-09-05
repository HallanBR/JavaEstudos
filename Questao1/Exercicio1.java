import java.util.Scanner;

class Exercicio1 {

    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            
            System.out.println("Digite o primeiro numero");
            Integer a = sc.nextInt();

            System.out.println("Digite o segundo numero");
            Integer b = sc.nextInt();

            Integer soma = a + b;

            System.out.println("a soma e " + soma);


            sc.close();
}
}