import java.util.Scanner;

public class Exercicio9 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		final double salarioMinimo = 1212.00;
		int cont, totalDeContribuintes;
		String cpf;
		int totalDeDependentes;
		double renda, ir, desconto;
				
		System.out.print("Total de contribuintes --> ");
		totalDeContribuintes = teclado.nextInt();
		
		cont = 1;
		while(cont <= totalDeContribuintes) {
			System.out.println("Contribuinte " + cont);
			System.out.print("CPF: ");
			cpf = teclado.next();
			System.out.print("Total de dependentes: ");
			totalDeDependentes = teclado.nextInt();
			System.out.print("Renda mensal: R$ ");
			renda = teclado.nextDouble();
			
			desconto = salarioMinimo * 5 / 100 * totalDeDependentes;
			renda = renda - desconto;
			
			if(renda < 2*salarioMinimo) {
				ir = 0;
			} else if(renda < 3*salarioMinimo) {
				ir = renda * 5 / 100;
			} else if(renda < 5*salarioMinimo) {
				ir = renda * 10 / 100;
			} else if(renda < 7*salarioMinimo) {
				ir = renda * 15 / 100;
			} else {
				ir = renda * 20 / 100;
			}
			
			System.out.println("Valor do IR R$ " + String.format("%.2f", ir));
			
			cont++;
			System.out.println();
		}

	}
}
