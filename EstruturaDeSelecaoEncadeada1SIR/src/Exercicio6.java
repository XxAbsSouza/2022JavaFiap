import java.util.Scanner;

public class Exercicio6 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int x, y, z, aux;
		
		System.out.print("1o valor -> ");
		x = teclado.nextInt();
		System.out.print("2o valor -> ");
		y = teclado.nextInt();
		System.out.print("3o valor -> ");
		z = teclado.nextInt();
		
		if(x > y) {
			aux = x;
			x = y;
			y = aux;
		}

		if(x > z) {
			aux = x;
			x = z;
			z = aux;
		}
		
		if(y > z) {
			aux = y;
			y = z;
			z = aux;
		}
		
		System.out.println(x + " " + y + " " + z);
	}
}
