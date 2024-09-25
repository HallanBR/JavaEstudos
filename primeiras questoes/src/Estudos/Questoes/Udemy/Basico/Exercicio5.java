package Estudos.Questoes.Udemy.Basico;
import java.util.Scanner;

class Exercicio5{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o codigo da peca");
        double codigoPeca1 = sc.nextDouble();
        System.out.println("Digite o numero de pecas");
        double numeroDePecas = sc.nextDouble();
        System.out.println("Digite o valor unitario da peca");
        double valorPecas = sc.nextDouble();
        System.out.println("Digite o codigo da peca");
        double codigoPeca2 = sc.nextDouble();
        System.out.println("Digite o numero de pecas");
        double numeroDaPecas2 = sc.nextDouble();
        System.out.println("Digite o valor unitario da peca");
        double valorPecas2 = sc.nextDouble();
        double valor1 = numeroDePecas * valorPecas;
        System.out.println("O valor da peca 1 e de " + valor1);
        double valor2 = numeroDaPecas2 * valorPecas2;
        System.out.println("O valor da peca 2 e de " + valor2);
        sc.close();
    }
}