import java.util.Scanner;

/* Programa para calcular e imprimir a m�dia de um
 * aluno que fez duas provas
 */

public class Exemplo1 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double nota1, nota2, media;
		
		System.out.print("nota 1 --> ");
		nota1 = teclado.nextDouble();
		System.out.print("nota 2 --> ");
		nota2 = teclado.nextDouble();
		
		media = (nota1 + nota2) / 2;
		
		System.out.println("m�dia = " + media);
		
		if(media >= 6) {
			System.out.println("Parab�ns! Aprovado!!");
		} else {
			System.out.println("Reprovado");
		}

		
	}
}
