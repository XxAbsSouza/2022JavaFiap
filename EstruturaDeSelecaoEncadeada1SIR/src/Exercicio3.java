import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String nome, genero;
		double altura, peso;
		
		System.out.print("Qual seu nome? ");
		nome = teclado.nextLine();
		System.out.print("G�nero (masculino ou feminino)? ");
		genero = teclado.next();
		System.out.print("Qual sua altura em metros? ");
		altura = teclado.nextDouble();
		
		if(!genero.equalsIgnoreCase("feminino") && !genero.equalsIgnoreCase("masculino")) {
			System.out.println("G�nero inv�lido para essa aplica��o");
		} else {
			if(genero.equalsIgnoreCase("feminino")) {
				peso = 62.1 * altura - 44.7;
			} else {
				peso = 72.7 * altura - 58;
			}
			System.out.println("Seu peso ideal �: " + peso);
		}
		

	}
}
