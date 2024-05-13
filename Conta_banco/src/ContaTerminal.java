import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        // Criando um objeto Scanner para entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Exibindo mensagem para o usuário
        System.out.println("Bem-vindo! ");

        // Solicitando e lendo informações do usuário
        System.out.print("Digite o seu nome completo: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o número da Agência: ");
        String numeroAgencia = scanner.nextLine(); 

        System.out.print("Digite seu saldo Inicial: ");
        double saldoInicial = scanner.nextDouble(); 

        // Exibindo mensagem de conta criada
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco. Sua agência é " + numeroAgencia + " e seu saldo " + saldoInicial + " já está disponível para saque!");

       
        scanner.close();
    }
}
