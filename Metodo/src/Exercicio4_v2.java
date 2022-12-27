import java.util.Scanner;

public class Exercicio4_v2 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		double a, b, c, delta;
		double[] x;
		
		System.out.print("valor de a --> ");
		a = teclado.nextDouble();
		if(a == 0) {
			System.out.println("não é uma equação do 2o grau");
		} else {
			System.out.print("valor de b --> ");
			b = teclado.nextDouble();
			System.out.print("valor de c --> ");
			c = teclado.nextDouble();
			delta = calcularDelta(a, b, c);
			if(delta < 0) {
				System.out.println("A equação não tem raiz real");
			} else {
				x = calcular(a, b, delta);
				System.out.println("x1 = " + x[0]);
				System.out.println("x2 = " + x[1]);
			}			
		}
	}

	public static double[] calcular(double a, double b, double delta) {
		double[] x = new double[2];
		x[0] = (-b + Math.sqrt(delta)) / (2 * a);
		x[1] = (-b - Math.sqrt(delta)) / (2 * a);
		return x;
	}
	
	public static double calcularDelta(double a, double b, double c) {
		return (b * b - 4 * a * c);
	}
	
	public static double calcularx1(double a, double b, double delta) {
		double x;
		x = (-b + Math.sqrt(delta)) / (2 * a);
		return x;
	}
	
	public static double calcularx2(double a, double b, double delta) {
		double x;
		x = (-b - Math.sqrt(delta)) / (2 * a);
		return x;
	}
}
