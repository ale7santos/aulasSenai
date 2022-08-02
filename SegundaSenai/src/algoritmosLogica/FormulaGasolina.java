package algoritmosLogica;

import java.util.Scanner;

public class FormulaGasolina {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double alcool = 0;
		double gasolina = 0;

		System.out.println("Informe o valor da gasolina: ");
		gasolina = sc.nextDouble();
		System.out.println("Infome o valor do alcool: ");
		alcool = sc.nextDouble();
		
		CalculeGas(alcool,gasolina);

		sc.close();

	}

	public static void CalculeGas(double gasolina, double alcool) {
		if (alcool / gasolina >= 0.70) {
			System.out.println("Compensa colocar gasolina!");
		}else {
			System.out.println("Compensa colocar alcool!");
		}
	}

}
