import java.util.Scanner;

public class Exercicio4 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int valor;
		int cont = 1;
		double fatorial = 1;
		
		do {
			System.out.print("Digite um número inteiro e positivo: ");
			valor = teclado.nextInt();
			if(valor < 0) {
				System.out.println("Informe outro valor");
			}
		} while(valor < 0);
		
		
		while(cont <= valor) {
			fatorial = fatorial * cont;
			cont++;
		}
		
		System.out.println(fatorial);
		
	}
}
