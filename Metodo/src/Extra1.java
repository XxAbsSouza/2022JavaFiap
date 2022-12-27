import java.util.Random;

/* Programa em java para preencher um vetor de 10 posições com valores
 * aletórios (o preenchimento deve ser feito em um método). Em seguida, 
 * os dados do vetor deverão ser impresso (a impressão deve ser feita por 
 * um método). Por último codificar um método que receba como parâmetro o vetor
 * e retorne a quantidade de números pares e ímpares armazenados no vetor.
 */

public class Extra1 {	
	public static void main(String[] args) {
		
		int[] x = new int[10];
		int[] total;
		
		preencher(x);
		imprimir(x);
		total = calcularParImpar(x);
		System.out.println("\nTotal de pares = " + total[0]);
		System.out.println("\nTotal de ímpares = " + total[1]);

	}
	
	public static int[] calcularParImpar(int[] x) {
		int[] total = new int[2];
		for (int i : x) {
			if(i % 2 == 0) {
				total[0]++;
			} else {
				total[1]++;
			}
		}
		return total;
	}
	
	public static void preencher(int[] x) {
		Random gerador = new Random();
		for(int i = 0; i < x.length; i++) {
			x[i] = gerador.nextInt(1, 100);
		}
	}
	
	public static void imprimir(int[] x) {
		for (int i : x) {
			System.out.print(i + " "); // i --> x[i]
		}
	}
	
}
