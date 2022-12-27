import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double y = 0;
		int n;
		int fat = 1;
		
		System.out.println("Informe o valor de n inteiro e positivo: ");
		n = teclado.nextInt();
		
		for(int cont = 1; cont <= n; cont++) {
			fat = fat * cont;
			y = y + (double) cont / fat;
		}
		
		System.out.println("y = " + y);
	}
}