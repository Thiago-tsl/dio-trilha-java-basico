import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("************************");
        System.out.print("Digite o número da conta: ");
        numeroConta = scanner.nextInt();

        System.out.println("************************");
        System.out.print("Digite a agência: ");
        agencia = scanner.next();

        System.out.println("************************");
        System.out.print("Digite seu nome: ");
        nomeCliente = scanner.next();

        System.out.println("************************");
        System.out.print("Digite o saldo: ");
        saldo = scanner.nextDouble();

        System.out.println();
        System.out.println();
        System.out.println("************************");
        System.out.println("Dados da conta:");
        
        System.out.println("************************");
        System.out.println("Número da conta: " + numeroConta);
        
        System.out.println("************************");
        System.out.println("Agência: " + agencia);
        
        System.out.println("************************");
        System.out.println("Nome do cliente: " + nomeCliente);
        
        System.out.println("************************");
        System.out.println("Saldo: R$" + saldo);
        
        System.out.println("************************");
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque. ");
    }
}
