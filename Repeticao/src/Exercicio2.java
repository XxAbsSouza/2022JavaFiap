import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor, maior = 0, cont = 1;
		
		while(cont <= 5) {
			System.out.print("Valor --> ");
			valor = teclado.nextInt();
			if(valor > maior || cont == 1) {
				maior = valor;
			}
			cont++;
		}
		System.out.println("maior valor = " + maior);
	}
}
