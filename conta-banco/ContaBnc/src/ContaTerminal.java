import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args){

        //criando o objeto scanner

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da sua conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite sua agência:");
        String agencia = scanner.next();

        System.out.println("Digite seu nome:");
        String nomeCliente = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Saldo: ");
        float saldo = scanner.nextFloat();
        
        

        //  String nome = args[0];
        // String sobrenome = args[1];
        // int numeroConta = Integer.valueOf(args[2]);
        // String nomeBanco = args[3];

        // System.out.println("Número da conta " + numeroConta);

        // System.out.println("Por favor digite o númedo da sua agência: " + agencia);

        // System.out.println("Nome do usuário " + nomeCliente);
        
        // System.out.println("Saldo da conta " + saldo);

        System.out.println("Olá, " + nomeCliente + " " + sobrenome + "! Obrigado por criar uma conta em nosso banco, sua agência é " + agencia + 
        ", conta " + numeroConta + " e seu saldo é " + saldo + " já está disponível para saque.");

    }
}
