import java.util.Random;

public class Exercicio7 {
	public static void main(String[] args) {

		int[] x = new int[10];
		double media, desvio;

		preencherVetor(x);
		System.out.println("Impressão do vetor:");
		imprimirVetor(x);
		System.out.println("Média dos elementos do vetor:");
		media = calcularMedia(x);
		System.out.println("média = " + String.format("%.2f", media));
		System.out.println("Desvio padrão dos elementos do vetor:");
		desvio = calcularDesvio(x, media);
		System.out.println("Desvio = " + String.format("%.2f", desvio));

	}

	// método para preencher um vetor de números inteiros
	public static void preencherVetor(int[] x) {
		Random gerador = new Random();
		for (int i = 0; i < x.length; i++) {
			x[i] = gerador.nextInt(100);
		}
	}

	// método para imprimir um vetor de números inteiros
	public static void imprimirVetor(int[] x) {
		for (int i = 0; i < x.length; i++) {
			System.out.print(x[i] + "  ");
		}
		System.out.println();
	}

	// método para calcular a média dos elementos do vetor
	public static double calcularMedia(int[] x) {
		double media = 0;
		for (int i = 0; i < x.length; i++) {
			media += x[i];
		}
		media = media / x.length;
		return media;
	}

	// método para calcular o desvio padrão dos elementos do vetor
	public static double calcularDesvio(int[] x, double media) {
		double desvio = 0;
		for (int i = 0; i < x.length; i++) {
			desvio += Math.pow(x[i] - media, 2);
		}
		desvio = Math.sqrt(desvio / (x.length - 1));
		return desvio;
	}
}
