import java.util.Scanner;

public class verificacaoServico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do serviço a ser verificado
        String servico = scanner.nextLine().trim();

        // Entrada do nome do cliente e os serviços contratados
        String entradaCliente = scanner.nextLine().trim();

        // Separando o nome do cliente e os serviços contratados
        String[] partes = entradaCliente.split(",");
        boolean contratado = false;

        // Verifica se o serviço está na lista de serviços contratados
        for (int i = 1; i < partes.length; i++) {
            if (partes[i].equalsIgnoreCase(servico)) {
                contratado = true;
                break;
            }
        }

        // Imprime o resultado
        System.out.println(contratado ? "Sim" : "Nao");

        scanner.close();
    }
}