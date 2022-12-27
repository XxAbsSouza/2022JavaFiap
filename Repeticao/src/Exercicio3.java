import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor, cont = 0, resultado;
		int resposta;
		
		do {
			System.out.print("valor --> ");
			valor = teclado.nextInt();
			cont = 0;
			while(cont <= 10) {
				resultado = valor * cont;
				System.out.println(valor + " * " + cont + " = " + resultado);
				cont++;
			}
			
			System.out.print("\nDigite 1 para nova tabuada ou 0 para finalizar ");
			resposta = teclado.nextInt();
			System.out.println();
		} while(resposta == 1);
	}
}
