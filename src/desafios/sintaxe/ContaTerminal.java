package desafios.sintaxe;
import java.util.Scanner;

public class ContaTerminal {
    public static void receberInputs(String[] args) {

        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nOlá, seja bem-vindo ao Banco DIO!");
        System.out.println("-------------------------------");
        System.out.println("Abaixo segue as opções disponíveis para você:\n");
        System.out.println("1 - Criar conta");
        System.out.println("2 - Sair");

        System.out.print("\nEscolha uma opção: ");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            criarConta(scanner);
        } else if (opcao == 2) {
            System.out.println("\nEncerrando o programa... Obrigado por usar nossos serviços!");
        } else {
            System.out.println("\nOpção inválida. Por favor, tente novamente.");
        }
    }

    private static void criarConta(Scanner scanner) {

        System.out.println("\nVamos criar sua conta! Por favor, forneça as seguintes informações:");

        System.out.print("\nNúmero da agência: ");
        String agencia = scanner.next();

        System.out.print("Número da conta: ");
        int numeroConta = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Nome do cliente: ");
        String nomeCliente = scanner.nextLine();
        
        System.out.print("Saldo inicial separado por vírgula: R$ ");
        double saldo = scanner.nextDouble();

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo é de R$ %.2f.",
                nomeCliente, agencia, numeroConta, saldo);
    }
}
