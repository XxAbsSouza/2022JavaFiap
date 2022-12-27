import java.util.Scanner;

/* Extra 1: programa em java para ler o nome, a altura e o peso de n pessoas. 
 * Para cada pessoa imprimir o valor do IMC = peso / (altura * altura).
 */

public class Extra1 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int quantidade, cont = 1;
		String nome;
		double altura, peso, imc;
		
		System.out.print("Qual a quantidade de pacientes? ");
		quantidade = teclado.nextInt();
		
		while(cont <= quantidade) {
			teclado.nextLine();
			System.out.println("Paciente " + cont);
			System.out.print("Nome: ");
			nome = teclado.nextLine();
			System.out.print("Altura (em metros): ");
			altura = teclado.nextDouble();
			System.out.print("Peso (em quilos): ");
			peso = teclado.nextDouble();
			imc = peso / (altura * altura);
			System.out.println("imc = " + imc);
			System.out.println();
			cont++;
		}

	}
}
