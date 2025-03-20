package conta_banco.sistemavalidacaoprocessoseletivo;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivoAvancado {
    public static void main(String[] args) {
        selecaoCandidatos();
        imprimirSelecionados();
    }
    static void imprimirSelecionados(){
         String [] candidatos = {"Eduardo", "Anna", "Julia", "Marcela", "Paula"};
         System.out.println(("imprimindo a lista de candidatos informando o indice do elemento"));
         for(String condidato: candidatos){
            System.out.println("o candidato selecionado foi " + condidato );
         }
    }

    static void selecaoCandidatos(){
        String [] candidatos = {"Eduardo", "Anna", "Julia", "Marcela", "Paula", "Mayumi", "Eliza", "Jessica", "Roberta", "Elizangela"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
       
        while(candidatosSelecionados < 5  && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salarioPretendido = valorPretendido();
            
            System.out.println("O candidato " + candidato + " Solicitou este valor de salario " + salarioPretendido);
           if (salarioBase >= salarioPretendido) {
            System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
            candidatosSelecionados++;
           }
           candidatosAtual++;
        }
    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardando o resultado dos demais candidatos");
        }
    }



}
