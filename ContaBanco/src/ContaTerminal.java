import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da sua conta: ");
        int numero = scanner.nextInt();

        System.out.print("Digite o número da Agência: ");
        String agencia = scanner.next();

        System.out.print("Informe o seu nome: ");
        String nome = scanner.next();

        System.out.print("Informe o seu saldo atual: ");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
