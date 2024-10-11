import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    public static void main(String[] args) {
        imprimirSelecionados();

        String [] candidatos = {"Felipe", "Marcia", "julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", "Daniela", "Jorge"};
        for (String candidato: candidatos){
            entrandoEmContato(candidato);
        }
    }
        static void entrandoEmContato(String candidato){
            int tentativasRealizadas = 1;
            boolean continuarTentando = true;
            boolean atendeu = false;
            do {
                atendeu = atender();
                continuarTentando = !atendeu;
                if (continuarTentando) tentativasRealizadas++;
                    else System.out.println("Contato realizado com sucesso");


            } while (continuarTentando && tentativasRealizadas < 3);

            if (atendeu)System.out.println("Conseguimos contato com " + candidato + " na " + tentativasRealizadas + " tentativa realizada");
                
            else System.out.println("Nao conseguimos contato com " + candidato + ", numero maximo de tentativas " + tentativasRealizadas);
                
            

        }
        // metodo auxiliar
        static boolean atender () {
            return new Random().nextInt(3)==1;
        }
        
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
        static double  valorPretendido(){
            return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
        }

        static void analisarCandidato(double salarioPretendido) {
            double salarioBase = 2000.0;
            if(salarioBase > salarioPretendido) {
                System.out.println("Ligar para o candidato");
            } else if(salarioBase == salarioPretendido){
                System.out.println("Ligar para o candidato com contra proposta");
            } else {
                System.out.println("Aguardandoo resultado dos demais candidatos");
            }
        }


}