import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos();
        }

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
                    candidatosSelecionados++;
                    System.out.println("o candidato " + candidato + ", foi selecionado para a vaga");
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