import java.util.Scanner;
public class CalculoSalarial {
    public static void main(String[] args) {
        
        Scanner leitorDeEntrada = new Scanner(System.in);
        System.out.println("Digite o valor do seu salario");
        float valorSalarial = leitorDeEntrada.nextFloat();
        System.out.println("Digite o valor dos beneficios");
        float beneficios = leitorDeEntrada.nextFloat();

        float valorDeImposto = 0;
        if (valorSalarial >= 0 && valorSalarial <= 1100.00) {
            // Atribui a aliquota de 5% mediante o salario de ate 1100
            valorDeImposto = 0.05f * valorSalarial;}
            // Atribui a aliquota de 10% se o salario for entre 1100 e 2500
            else if (valorSalarial >= 1100.01 && valorSalarial <= 2500.00) {
            valorDeImposto = 0.10f * valorSalarial;}
            // Atribui a aliquota de 15% se o salario que ultrapassar 2500
                else {valorDeImposto = 0.15f * valorSalarial;}

        // Faz o calculo que sera impressso
        float saida = valorSalarial - valorDeImposto + beneficios;
        // Imprime o calculo realizado
        System.out.println("O valor do seu salario liguido e de " + saida);

    }
}
