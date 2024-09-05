import java.util.Scanner;

class Exercicio2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o raio");
        Double raio = sc.nextDouble();

        Double area = Math.PI * raio * raio;
        System.out.println("A area e de " + area);


        sc.close();
    }
}