package conta_banco;


import java.util.Locale;
import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome: ");
        String nome = scanner.next();
        
        System.out.println("Por favor, digite o numero da Agencia: ");
        String numeroAgencia = scanner.next();

        System.out.println("Digite o numero da sua conta: ");
        int numeroConta = scanner.nextInt();

        double saldo = 2450.65;

        System.out.println("Ola " + nome+", bem-vindo novamente ao nosso banco, sua agência é " + numeroAgencia+", conta " + numeroConta + " e seu saldo " + saldo + " já está disponivel para saque.");
}
}