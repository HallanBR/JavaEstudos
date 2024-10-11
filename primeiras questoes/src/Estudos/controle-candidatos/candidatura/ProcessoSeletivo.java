import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        // Imprime a lista de candidatos com seus respectivos índices
        imprimirSelecionados();

        
        // Itera sobre a lista de candidatos, tentando entrar em contato com cada um
        String [] candidatos = {"Felipe", "Marcia", "julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};
        for (String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }
        // Simula o processo de entrar em contato com um candidato
        static void entrandoEmContato(String candidato){
            // Inicializa as variáveis para controlar o número de tentativas e o resultado
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false;

            // Continua tentando entrar em contato até o candidato atender ou atingir o limite de tentativas
            do {
                atendeu = atender();
                continuarTentando = !atendeu;// Inverte o valor de atendeu
                // Incrementa o número de tentativas e imprime uma mensagem se o contato foi realizado
                if (continuarTentando) tentativasRealizadas++;
                    else System.out.println("Contato realizado com sucesso");


            } while (continuarTentando && tentativasRealizadas < 3);

            // Imprime uma mensagem informando o resultado final
            if (atendeu)
                System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa realizada");
                
            else
                System.out.println("Nao conseguimos contato com " + candidato + ", numero maximo de tentativas " + tentativasRealizadas);
                
            

        }
        
    // Simula uma tentativa de contato com o candidato, retornando true se atender
        static boolean atender () {
            // Gera um número aleatório para simular se o candidato atendeu ou não
            return new Random().nextInt(3)==1;
        }
        
        // Imprime a lista de candidatos de duas formas diferentes
        static void imprimirSelecionados () {
            String [] candidatos= {"Felipe", "Marcia", "julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};
                System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");
            for(int indice=0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de numero " + (indice+1) + " e o " + candidatos[indice]);
            }

            System.out.println("forma abreviada de FOR EACH");
            for(String candidato: candidatos ) {
                System.out.println("o candidato selecionado foi "+ candidato );
            }
        };
        
        // Simula o processo de seleção de candidatos com base no salário pretendido
        static void selecaoCandidatos() {
            String [] candidatos = {"Felipe", "Marcia", "julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};

            int candidatosSelecionados = 0;
            int candidatoAtual = 0;
            double salarioBase = 2000.0;
            while(candidatosSelecionados < 5 &&  candidatoAtual <  candidatos.length) {
                String candidato = candidatos[candidatoAtual++];
                double salarioPretendido = valorPretendido();

                System.out.println("O cancidato " + candidato  + ", solicitou esse valor de salario " + salarioPretendido);
                if (salarioBase >= salarioPretendido){
                    System.out.println("o candidato " + candidato + ", foi selecionado para a vaga");
                candidatosSelecionados++;

                }
            }
                candidatoAtual++;
        }

        // Gera um valor aleatório para o salário pretendido pelo candidato
        static double  valorPretendido(){
            // Gera um número aleatório entre 1800 e 2200
            return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
        }

        // Analisa o salário pretendido do candidato e toma uma decisão
        static void analisarCandidato(double salarioPretendido) {
            double salarioBase = 2000.0;
            
            // Compara o salário pretendido com o salário base e toma uma decisão
            if(salarioBase > salarioPretendido) {
                System.out.println("Ligar para o candidato");
            } else if(salarioBase == salarioPretendido){
                System.out.println("Ligar para o candidato com contra proposta");
            } else {
                System.out.println("Aguardandoo resultado dos demais candidatos");
            }
        }


}
