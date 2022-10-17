package forExercicio;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int numeroEscolhido; 
		int resultadoMultiplicacao;

		System.out.print("De qual número será sua tabuada? ");
		numeroEscolhido = scanner.nextInt();
		
		for (int multiplicador = 1; multiplicador <= 10; multiplicador++) {
			resultadoMultiplicacao = numeroEscolhido * multiplicador;
			System.out.println(numeroEscolhido + " X " + multiplicador + " = " + resultadoMultiplicacao);
		}
	}

}
