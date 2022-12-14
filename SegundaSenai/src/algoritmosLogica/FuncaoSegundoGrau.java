package algoritmosLogica;

import java.util.Scanner;

public class FuncaoSegundoGrau {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a = 0;
		double b = 0;
		double c = 0;

		System.out.println("Entre com o valor de A: ");
		a = sc.nextDouble();

		System.out.println("Entre com o valor de B: ");
		b = sc.nextDouble();

		System.out.println("Entre com o valor de C: ");
		c = sc.nextDouble();

		FSegundoGrau(a, b, c);

		sc.close();

	}

	public static void FSegundoGrau(double a, double b, double c) {
		double delta = (Math.pow(b, 2)) - (4 * (a * c));
		double x1 = 0;
		double x2 = 0;
		if(delta < 0) {
			System.out.println("Delta não tem raiz");
		}else {
			x1 =  (-b + Math.sqrt(delta)) / (2 * a);
			x2 = (-b - Math.sqrt(delta)) / (2 * a);
		}
		System.out.printf("Delta é: %.2f ", delta);
		System.out.printf("x1 é: %.2f ", x1);
		System.out.printf("x2 é: %.2f ", x2);
	}

}
