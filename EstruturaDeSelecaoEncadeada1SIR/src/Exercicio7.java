import java.util.Scanner;

public class Exercicio7 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		String cargo;
		double salarioAtual, salarioNovo, diferenca;
		double porcentagem;
		int tempo;
		
		System.out.print("Cargo: ");
		cargo = teclado.next();
		System.out.print("Tempo de serviço: ");
		tempo = teclado.nextInt();
		System.out.print("Salário atual R$ ");
		salarioAtual = teclado.nextDouble();
		
		cargo = cargo.toLowerCase();
		
		if(!cargo.equals("gerente") && !cargo.equals("engenheiro") && !cargo.equals("técnico")) {
			System.out.println("Cargo inválido");
		} else {
			if(cargo.equals("gerente")) {
				if(tempo >= 5) {
					porcentagem = 10;
				} else if(tempo >= 3) {
					porcentagem = 9;
				} else {
					porcentagem = 11;
				}
			} else if(cargo.equals("engenheiro")) {
				if(tempo >= 5) {
					porcentagem = 11;
				} else if(tempo >= 3) {
					porcentagem = 10;
				} else {
					porcentagem = 9;
				}
			} else {
				if(tempo >= 5) {
					porcentagem = 12;
				} else if(tempo >= 3) {
					porcentagem = 11;
				} else {
					porcentagem = 10;
				}
			}
			salarioNovo = salarioAtual * (1 + porcentagem / 100);
			diferenca = salarioNovo - salarioAtual;
			System.out.println("Novo salário R$ " + String.format("%.2f", salarioNovo));
			System.out.println("Valor de aumento R$ " + String.format("%.2f", diferenca));
		}
		
		

	}
	}
