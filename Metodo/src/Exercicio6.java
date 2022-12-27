import java.util.Random;

public class Exercicio6 {
	public static void main(String[] args) {
			
		int[][] x = new int[5][5];
		int[] maior;
		
		preencherMatriz(x);
		System.out.println("Matriz gerada:");
		imprimirMatriz(x);
		maior = maiorValor(x);
		System.out.println("Maior valor armazenado em cada linha");
		imprimirVetor(maior);
		
	}

	// método para preencher uma matriz de números inteiros
	public static void preencherMatriz(int[][] x) {
		Random gerador = new Random();
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				x[i][j] = gerador.nextInt(x.length * x.length);
			}
		}
	}

	// método para imprimir uma matriz de números inteiros
	public static void imprimirMatriz(int[][] x) {
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	/* método para retornar o maior valor armazenado em cada linha
	 * da matriz. O método retornará um vetor (cada posição do vetor
	 * armazenará o maior valor de cada linha da matriz
	 */
	public static int[] maiorValor(int[][] x) {
		int[] maior = new int[x.length];
				
		for(int i = 0; i < x.length; i++) {
			maior[i] = x[i][0];
			for(int j = 0; j < x[i].length; j++) {
				if(x[i][j] > maior[i]) {
					maior[i] = x[i][j];
				}
			}
		}
		return maior;
	}
	
	// método para imprimir o maior valor de cada linha da matriz
	public static void imprimirVetor(int[] x) {
		for(int i = 0; i < x.length; i++) {
			System.out.println("linha " + i + " = " + x[i]);
		}
	}
}
