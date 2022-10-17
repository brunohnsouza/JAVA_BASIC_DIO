package arraysUnidimensionais;
import java.util.Random;

public class NumerosAleatorios {
	public static void main(String[] args) {
		
		Random randon = new Random();
		
		int[] numerosAleatorios = new int[20];
		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			int numero = randon.nextInt(100);
			numerosAleatorios[i] = numero;
		}
		
		System.out.print("\n" + "Array normal: " + "[ ");
		for (int numero : numerosAleatorios) {
			System.out.print(numero + " ");
		}
		System.out.print("]");
		
		System.out.print("\n" + "Array sucessores: " + "[ ");
		for (int numero : numerosAleatorios) {
			System.out.print((numero + 1) + " ");
		}
		System.out.print("]");
		
		
	}

}
