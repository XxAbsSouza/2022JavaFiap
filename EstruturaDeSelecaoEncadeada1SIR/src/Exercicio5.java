import java.util.Scanner;

public class Exercicio5 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor1, valor2, valor3;
		
		System.out.print("valor 1 --> ");
		valor1 = teclado.nextInt();
		System.out.print("valor 2 --> ");
		valor2 = teclado.nextInt();
		System.out.print("valor 3 --> ");
		valor3 = teclado.nextInt();
		
		if(valor1 != valor2 && valor1 != valor3 && valor2 != valor3) {
			if(valor1 < valor2 && valor1 < valor3) {
				System.out.println("menor = " + valor1);
			} else if(valor2 < valor3) {
				System.out.println("menor = " + valor2 );
			} else {
				System.out.println("menor = " + valor3);
			}
		} else {
			System.out.println("Os valores devem ser diferentes");
		}
	}
}
