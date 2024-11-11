import java.util.Scanner;

public class vQC {

    // Função para verificar queda de conexão
    public static String verificarQuedaConexao(String[] velocidades) {
        // Verifica se há algum registro igual a 0
        for (String velocidade : velocidades) {
            if (Integer.parseInt(velocidade.trim()) == 0) {
                return "Queda de Conexao"; // Retorna se houver queda
            }
        }
        return "Sem Quedas"; // Retorna se não houver quedas
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitando ao usuário a lista de velocidades de conexão registradas a cada hora
        String input = scanner.nextLine();

        // Convertendo a entrada em uma lista de strings
        String[] velocidades = input.split(",");

        // Verificando se houve queda de conexão
        String resultado = verificarQuedaConexao(velocidades);

        // Exibindo o resultado da verificação
        System.out.println(resultado);

        scanner.close();
    }
}
