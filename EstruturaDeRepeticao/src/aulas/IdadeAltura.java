package aulas;

import java.util.Locale;
import java.util.Scanner;

public class IdadeAltura {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		int[] idade = new int[5];
		double[] altura = new double[5];

		for (int i = 0; i < idade.length; i++) {
			System.out.println("Digite a sua idade: ");
			idade[i] = sc.nextInt();

			System.out.println("Digite a sua altura: ");
			altura[i] = sc.nextDouble();

		}
		for (int i = 0; i < idade.length; i++) {
			System.out.println("a idade é: " + idade[i]);
			System.out.println("a altura é: " + altura[i]);
		}
		sc.close();

	}

}
