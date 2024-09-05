import java.util.Scanner;

class Exercicio3{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o valor do primeiro produto");
        Integer A = sc.nextInt();

        System.out.println("Digite o valor do segundo produto");
        Integer B = sc.nextInt();

        System.out.println("Digite o valor do terceiro produto");
        Integer C = sc.nextInt();

        System.out.println("digite o valor do quarto produto");
        Integer D = sc.nextInt();

        Integer Diferenca = A * B - C * D;
        System.out.println("A diferenca e " + Diferenca);

        sc.close();
    }
}
