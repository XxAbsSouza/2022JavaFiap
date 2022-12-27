import java.util.Scanner;

public class Exemplo {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int x;
		
		System.out.print("valor de x");
		x = teclado.nextInt();
		
		System.out.println((x % 2 == 0) ? "É par" : "É ímpar");

	}
}
