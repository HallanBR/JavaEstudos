package Estudos.Aprendizado;

public class TiposDados {
    public static void main(String[] args) {
        // Definindo variáveis de diferentes tipos de dados

        byte idade = 24; // Representa a idade de uma pessoa
            System.out.println("Idade: " + idade);// Exibindo os valores


        short anoAtual = 2024; // Representa o ano atual
            System.out.println("Ano Atual: " + anoAtual);// Exibindo os valores
        
        
        String cep = "30242000"; // Código Postal (CEP) deve ser tratado como String para manter zeros à esquerda
            System.out.println("CEP: " + cep);// Exibindo os valores

        
        long cpf = 14858977750L; // CPF deve ser tratado como long, finalizando com 'L'
            System.out.println("CPF: " + cpf);// Exibindo os valores


        final float PI = 3.14F; // Pi é uma constante do tipo float
            System.out.println("Valor de PI: " + PI);// Exibindo os valores

        
        double salario = 2024.50; // Salário representado como um valor decimal (double)
            System.out.println("Salário: " + salario);// Exibindo os valores


    }
}
