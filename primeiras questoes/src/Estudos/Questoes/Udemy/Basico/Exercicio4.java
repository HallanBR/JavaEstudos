package Estudos.Questoes.Udemy.Basico;
import java.util.Scanner;
class Exercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome do funcionario");
        String nomeFuncionario = sc.next();
        System.out.println("Digite o numero de horas trabalhadas");
        Integer horasTrabalhadas = sc.nextInt();
        System.out.println("Digite o valor das horas trabalhadas do funcionario");
        Integer valorHoras = sc.nextInt();
        System.out.println("Digite a quantidade de dias trabalhados");
        Integer diasTrabalhados = sc.nextInt();
        Integer valorDiario = horasTrabalhadas * valorHoras;
        Integer salarioMensal = valorDiario * diasTrabalhados;
        System.out.println("O valor do salario do funcionario " + nomeFuncionario + " em dias e de " + valorDiario);
        System.out.println("O salario mensal do funcionario " + nomeFuncionario + " e de " + salarioMensal);
        sc.close();
    }
}

