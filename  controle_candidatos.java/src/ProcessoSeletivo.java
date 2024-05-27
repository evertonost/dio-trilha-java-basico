import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        selecaoCandidatos(); 
        imprimirSelecionados(); 

        String[] candidatos = {"felipe", "marcia", "Julia", "Paulo", "Augusto"};
        for(String candidato : candidatos) {
            entrandoEmContato(candidato);
        }
    }

    static void entrandoEmContato(String Candidato) {
        int tentativasRealizadas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        do {
            atendeu = atender();
            continuarTentando = !atendeu;
            if (continuarTentando) {
                tentativasRealizadas++;
            } else {
                System.out.println("Contato realizado com sucesso");
            }
        } while (continuarTentando && tentativasRealizadas < 3);

        if (atendeu) {
            System.out.println("Conseguimos contato com " + Candidato + " na " + tentativasRealizadas + "ª tentativa");
        } else {
            System.out.println("Não conseguimos contato com " + Candidato + ". Número máximo de tentativas: " + tentativasRealizadas);
        }
    }

    static boolean atender() {
        return new Random().nextInt(3) == 1;
    }

    static void imprimirSelecionados() {
        String[] candidatos = {"felipe", "marcia", "Julia", "Paulo", "Augusto"};
        System.out.println("Imprimindo a lista de candidatos informando o índice do elemento:");
        for (int indice = 0; indice < candidatos.length; indice++) {
            System.out.println("O candidato de número " + indice + " é " + candidatos[indice]);
        }
    }

    static void selecaoCandidatos() {
        String[] candidatos = {
            "felipe", "marcia", "Julia", "Paulo", "Augusto", "Monica", "Fabricio", "Mirela", 
            "Daniela", "Jorge", "Everton", "Bruna"
        };
        int candidatosSelecionados = 0;
        double salarioBase = 2000.0;

        for (String candidato : candidatos) {
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou um salário de " + salarioPretendido);
            if (salarioBase >= salarioPretendido) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }

            if (candidatosSelecionados >= 5) {
                break; // Sai do loop quando 5 candidatos são selecionados
            }
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;
        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para o candidato com contra proposta");
        } else {
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }
}
