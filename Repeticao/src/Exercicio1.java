import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor1, valor2;
		
		System.out.print("primeiro valor --> ");
		valor1 = teclado.nextInt();
		System.out.print("segundo valor --> ");
		valor2 = teclado.nextInt();
		
		if(valor1 > 0 && valor2 > 0 && valor2 > valor1) {
			while(valor1 <= valor2) {
				System.out.print(valor1 + " ");
				valor1++; // valor1 = valor1 + 1;
			} 
		} else {
			System.out.println("valores inválidos");
			
		}

	}
}
