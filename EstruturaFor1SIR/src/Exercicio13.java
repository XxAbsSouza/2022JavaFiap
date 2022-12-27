import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double y = 0;
		int n;
		
		System.out.println("Informe o valor de n inteiro e positivo: ");
		n = teclado.nextInt();
		
		for(int cont = 1; cont <= n; cont++) {
			y = y + (double)cont / (n - cont + 1);
		}
		
		System.out.println("y = " + y);
	}
}