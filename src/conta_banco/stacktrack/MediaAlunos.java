package conta_banco.stacktrack;

import java.util.Scanner;

public class MediaAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] alunos = {"Eduardo", "Paula", "Roberta", "Amanda"};
        
        double media = calculaMediaDaTurma(alunos, scanner);

        System.out.println(media);

    }

    public static double calculaMediaDaTurma(String[] alunos, Scanner scanner){
        double soma = 0;
        for(String aluno: alunos){
            System.out.println("Nota do aluno " + aluno + ":");
            double nota = scanner.nextDouble();
            soma += nota;
        }

        return soma / alunos.length;
    }
}
