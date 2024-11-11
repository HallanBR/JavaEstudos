import java.util.Scanner;

public class ConsumoDeDados {
    
    public static void calcularConsumoDados(String entrada) {
        // Divide a string de entrada em valores separados por vírgula e os converte para inteiros
        String[] semanaStr = entrada.split(",");
        int[] semanas = new int[semanaStr.length];
        
        for (int i = 0; i < semanaStr.length; i++) {
            semanas[i] = Integer.parseInt(semanaStr[i]);
        }
        
        // 1. Consumo total de dados
        int totalConsumo = 0;
        for (int i = 0; i < semanas.length; i++) {
            totalConsumo += semanas[i];
        }
        
        // 2. Média semanal de consumo
        int mediaSemanal = totalConsumo / semanas.length;
        
        // 3. Semana de maior consumo
        int semanaMaiorConsumo = 0;
        int maiorConsumo = semanas[0];
        
        for (int i = 1; i < semanas.length; i++) {
            if (semanas[i] > maiorConsumo) {
                maiorConsumo = semanas[i];
                semanaMaiorConsumo = i;
            }
        }
        
        // Exibe os resultados
        System.out.println("Consumo total: " + totalConsumo + " MB");
        System.out.println("Media semanal: " + mediaSemanal + " MB");
        System.out.println("Maior consumo: Semana " + (semanaMaiorConsumo + 1));
    }
    
    public static void main(String[] args) {
        // Cria um scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("");
        String entrada = scanner.nextLine();
        
        // Chama a função para calcular os dados
        calcularConsumoDados(entrada);
        
        // Fecha o scanner
        scanner.close();
    }
}
