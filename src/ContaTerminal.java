import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String nome;
        int conta;
        String agencia;
        double saldo = 1000.50;

        System.out.println("Por favor digite o seu nome: ");
        nome = scanner.nextLine();

        System.out.println("Digite sua agência: ");
        agencia = scanner.nextLine();

        System.out.println("Digite sua conta: ");
        conta = scanner.nextInt();
        
        scanner.nextLine();

        System.out.println("Obrigado pelas informações.");
        System.out.printf("Olá %s, obrigado por ser nosso cliente. Sua agência é %s, conta %d e seu saldo é de R$ %.2f%n", nome, agencia, conta, saldo);

        scanner.close();
    }
}
