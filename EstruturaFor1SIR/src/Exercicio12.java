import java.util.Scanner;

public class Exercicio12 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		int totalProduto;
		double totalCompra = 0, valorProduto;
		int resposta;
		
		System.out.print("Total de produtos --> ");
		totalProduto = teclado.nextInt();
		
		for(int cont = 1; cont <= totalProduto; cont++) {
			System.out.print("Valor do produto: ");
			valorProduto = teclado.nextDouble();
			totalCompra = totalCompra + valorProduto;
		}

		System.out.println("Total da compra R$ " + String.format("%.2f", totalCompra));
		
		System.out.println("1. Pagamento à vista\n2. Pagamento parcelado\n");
		resposta = teclado.nextInt();
		if(resposta == 1) {
			totalCompra *= 0.9;
			System.out.println("Total a pagar à vista R$ " + String.format("%.2f", totalCompra));
		} else {
			totalCompra *= 1.155;
			System.out.println("Total a pagar parcelado R$ " + String.format("%.2f", totalCompra));
			System.out.println("Em duas parcelas de R$ " + String.format("%.2f", totalCompra / 2));
		}
	}	
			
}
