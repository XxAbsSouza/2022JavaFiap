import java.util.Scanner;

public class Exercicio11 {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		int valor, total = 0;

		// entrada de dados
		do {
			System.out.print("Informe um valor inteiro e positivo --> ");
			valor = teclado.nextInt();
			if (valor <= 0) {
				System.out.println("Valor inválido! Tente outro");
			}
		} while (valor <= 0);

		// contagem do número de divisores
		for(int cont = 1; cont <= valor; cont++) {
			if(valor % cont == 0) {
				total++;
			}
		}
		
		// verifica se o número é primo
		if(total == 2) {
			System.out.println(valor + " é primo");
		} else {
			System.out.println(valor + " não é primo");
		}		
	}
}
