import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double totalDasCompras, totalFinal, valorEconomizado;
		
		System.out.println("Total das compras R$ ");
		totalDasCompras = teclado.nextDouble();
		
		if(totalDasCompras > 1000) {
			valorEconomizado = totalDasCompras * 15 / 100;			
		} else {
			valorEconomizado = totalDasCompras * 8 / 100;
		}

		totalFinal = totalDasCompras - valorEconomizado;
		System.out.println("Total a pagar R$ " + totalFinal);
		System.out.println("Valor economizado R$ " + valorEconomizado);
	}
}
