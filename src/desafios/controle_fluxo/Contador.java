package desafios.controle_fluxo;

import java.util.Scanner;

public class Contador {
    public static void receberInputs(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nDigite o primeiro parâmetro: ");
		int parametroUm = scanner.nextInt();
		System.out.print("\nDigite o segundo parâmetro: ");
		int parametroDois = scanner.nextInt();
		
		try {
			contar(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            throw new ParametrosInvalidosException("\nO segundo parâmetro deve ser maior que o primeiro.");
        }

		int contagem = parametroDois - parametroUm;
        for(int i = 1; i <= contagem; i++) {
            if (i == 1) {
                System.out.println("\nImprimindo o número: " + i);
            } else {
                System.out.println("Imprimindo o número: " + i);
            }
        }
	}
}
