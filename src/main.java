import java.util.Scanner;

public class main {

    private final static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("\n======= BEM-VINDO A TRILHA JAVA BÁSICO DA DIO! =======");
        System.out.println("\nAbaixo estão listados os desafios que foram implementados para concluir a trilha. Sinta-se à vontade para explorar cada um deles e praticar seus conhecimentos em Java.");
        System.out.println("\n1. Desafio: Controle de Sintaxe");
        System.out.println("2. Desafio: Controle de Fluxo");
        System.out.println("3. Sair");

        System.out.print("\nDigite o número do desafio que deseja explorar: ");
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> desafios.sintaxe.ContaTerminal.receberInputs(args);
            case 2 -> desafios.controle_fluxo.Contador.receberInputs(args);
            case 3 -> System.out.println("\nObrigado por explorar os desafios da trilha Java Básico! Até a próxima!");
            default -> System.out.println("\nOpção inválida. Por favor, tente novamente.");
        }
    }
}
