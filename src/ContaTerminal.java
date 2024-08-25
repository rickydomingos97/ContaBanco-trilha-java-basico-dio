import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência ( 4 digitos )");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta( 3 digitos)");
        String conta = scanner.nextLine();
        System.out.println("Digite o Digito da conta: ");
        String digitoConta = scanner.nextLine();

        System.out.println("Por favor, digite o seu nome !");
        String nome = scanner.nextLine();

        System.out.println("Por favor, digite o Saldo Inicial ( Formato: 000.00)!");
        double saldoInicial = scanner.nextDouble();

        System.out.println("Olá " + nome + "\nobrigado por criar uma conta em nosso banco, " +
                "\nSua agência é " +  agencia + ", conta: " + conta + "-" + digitoConta +
                "\n e seu saldo " + saldoInicial + " já está disponível para saque");

    }
}
