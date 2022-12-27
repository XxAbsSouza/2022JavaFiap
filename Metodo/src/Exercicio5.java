import java.util.Random;

public class Exercicio5 {
	public static void main(String[] args) {
		
		int[] x = new int[10];
		
		preencherVetor(x);
		System.out.println("Impressão antes da inversão:");
		imprimirVetor(x);
		inverter(x);
		System.out.println("\nImpressão depois da inversão:");
		imprimirVetor(x);

	}

	// método para preencher um vetor de números inteiros
	public static void preencherVetor(int[] x) {
		Random gerador = new Random();
		for (int i = 0; i < x.length; i++) {
			x[i] = gerador.nextInt(x.length * 3);
		}
	}

	// método para imprimir um vetor de números inteiros
	public static void imprimirVetor(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "  ");
		}
		System.out.println();
	}
	
	// método para inverter os elementos de um vetor de números inteiros
	public static void inverter(int[] x) {
		int aux;
		for(int i = 0; i < x.length / 2; i++) {
			aux = x[i];
			x[i] = x[x.length - 1 - i];
			x[x.length - 1 - i] = aux;
		}
	}
}
