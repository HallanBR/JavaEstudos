package Estudos.Aprendizado;

public class TiposDados {
    public static void main(String[] args) {
        // Definindo variáveis de diferentes tipos de dados
        
        byte idade = 24; // Representa a idade de uma pessoa
        short anoAtual = 2024; // Representa o ano atual
        
        // Código Postal (CEP) deve ser tratado como String para manter zeros à esquerda
        String cep = "30242000"; 
        
        // CPF deve ser tratado como long, finalizando com 'L'
        long cpf = 14858977750L; 
        
        // Pi é uma constante do tipo float
        final float PI = 3.14F; 
        
        // Salário representado como um valor decimal (double)
        double salario = 2024.50; 

        // Exibindo os valores
        System.out.println("Idade: " + idade);
        System.out.println("Ano Atual: " + anoAtual);
        System.out.println("CEP: " + cep);
        System.out.println("CPF: " + cpf);
        System.out.println("Valor de PI: " + PI);
        System.out.println("Salário: " + salario);
    }
}
