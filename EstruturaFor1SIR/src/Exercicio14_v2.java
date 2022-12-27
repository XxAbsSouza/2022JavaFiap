import java.util.Scanner;

public class Exercicio14_v2 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double y = 0;
		int n;
		int sinal = 1;
		
		System.out.println("Informe o valor de n inteiro e positivo: ");
		n = teclado.nextInt();
		
		for(int cont = 1; cont <= n; cont++) {
			y = y + 1.0 / cont * sinal;
			sinal = sinal * -1;
		}
		
		System.out.println("y = " + y);
	}
}