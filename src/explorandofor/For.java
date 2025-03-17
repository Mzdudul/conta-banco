package explorandofor;

public class For {
    public static void main(String[] args) {
        // for(int carneirinhos = 1; carneirinhos <= 20; carneirinhos++){
        //     System.out.println("Contando carneirinhos " + carneirinhos);
        // }

        String alunos [] = {"Eduardo", "Jonas", "Julia", "Marcos" };

        // for(int x = 0; x < alunos.length; x++){
        //     System.out.println("O aluno no indice x = " + x + " é " + alunos[x]);
        // }

        for(String aluno : alunos){
            System.out.println("Nome do aluno é: " + aluno);
        }
    }
}
