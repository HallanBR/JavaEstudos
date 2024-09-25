package Estudos.Questoes.Udemy.Basico;
import java.util.Scanner;

class Exercicio6{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("O valor de base");
        Integer A = sc.nextInt();
        System.out.println("O valor de largura");
        Integer B = sc.nextInt();
        System.out.println("O valor de altura");
        double C = sc.nextDouble();
        double triangulo = A * C / 2;
        System.out.println("A area do triangulo e " + triangulo);
        double trapezio = (A + B) * C / 2;
        System.out.println("A area do trapezio e " + trapezio);
        double quadrado = B * B;
        System.out.println("A area do quadrado e " + quadrado);
        double retangulo = A * B;
        System.out.println("A area do retangulo e " + retangulo);

        sc.close();
    }
}