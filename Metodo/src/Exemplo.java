import java.util.Random;

public class Exemplo {
	public static void main(String[] args) {
		
		int[] x = new int[10];
		int maior;
		
		preencher(x);
		imprimir(x);
		maior = acharMaior(x);
		System.out.println("maior = " + maior);

	}
	
	public static int acharMaior(int[] x) {
		int aux = x[0];
		for(int i = 0; i < x.length; i++) {
			if(x[i] > aux) {
				aux = x[i];
			}
		}
		return aux;
	}
	
	public static void preencher(int[] x) {
		Random gerador = new Random();
		for(int i = 0; i < x.length; i++) {
			x[i] = gerador.nextInt(10);
		}
	}
	
	public static void imprimir(int[] x) {
		for(int i = 0; i < x.length; i++) {
			System.out.print(x[i] + " ");
		}
	}
}
