import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int diaria;
		double conta, taxa;
		
		System.out.print("Informe o número de diárias --> ");
		diaria = teclado.nextInt();
		
		if(diaria > 15) {
			taxa = 15.5;
		} else {
			if(diaria == 15) {
				taxa = 36;
			} else {
				taxa = 58;
			}
		}
		conta = 250 * diaria + taxa * diaria;
		System.out.println("Valor da conta = R$ " + conta);
	}
}
