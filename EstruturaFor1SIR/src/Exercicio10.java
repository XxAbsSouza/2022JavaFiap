import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor;
		
		// entrada de dados
		do {
			System.out.print("Informe um valor inteiro e positivo --> ");
			valor = teclado.nextInt();
			if(valor <= 0) {
				System.out.println("Valor inválido! Tente outro" );
			}
		} while(valor <= 0);

		// imprime os divisores do número
		for(int cont = -valor; cont <= valor; cont++) {
			if(cont != 0 && valor % cont == 0) {
				System.out.print(cont + "\t");
			}
		}
		
		teclado.close();
	}
}
