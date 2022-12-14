package algoritmosLogica;

import java.util.Scanner;

public class IntroducaoFuncao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double altura = 0;
		double peso = 0;
		int idade;
		char sexo;
		double imc = Math.pow(altura, altura) / peso;

		// IMC HOMEM < 18,5 ABAIXO| > 25 SOBREPESO | 18,5 E 25 OK
		// IMC MULHER

		System.out.println("Digite sua altura: ");
		altura = sc.nextDouble();

		System.out.println("Digite seu peso: ");
		peso = sc.nextDouble();

		System.out.println("Digite a sua idade: ");
		idade = sc.nextInt();

		System.out.println("Digite o seu sexo: ");
		sexo = sc.next().charAt(0);

		System.out.println(CalcularIMC(altura, peso, sexo));
		

		sc.close();
	}

	public static String CalcularIMC(double a, double p, char s) {
		double imc = (p / Math.pow(a, a));
		if (Character.toUpperCase(s) == 'M' && imc < 20.7) {
			return "abaixo do peso, imc: " + imc;
		} else if (Character.toUpperCase(s) == 'M' && imc >= 20.7 && imc < 26.4) {
			return "Peso normal, imc: " + imc;
		} else if (Character.toUpperCase(s) == 'M' && imc >= 26.4 && imc < 27.8) {
			return "Um pouco acima do peso, imc: " + imc;
		} else if (Character.toUpperCase(s) == 'M' && imc >= 27.8 && imc < 31.1) {
			return "Acima do peso ideal, imc: " + imc;
		} else {
			return "obeso, imc: " + imc;
			}
		}
		public static String CalcularIMC2(double a, double p, char s) {
			double imc = (p / Math.pow(a, a));
			if (Character.toUpperCase(s) == 'F' && imc < 20.7) {
				return "abaixo do peso, imc: " + imc;
			} else if (Character.toUpperCase(s) == 'F' && imc >= 20.7 && imc < 26.4) {
				return "Peso normal, imc: " + imc;
			} else if (Character.toUpperCase(s) == 'F' && imc >= 26.4 && imc < 27.8) {
				return "Um pouco acima do peso, imc: " + imc;
			} else if (Character.toUpperCase(s) == 'F' && imc >= 27.8 && imc < 31.1) {
				return "Acima do peso ideal, imc: " + imc;
			} else {
				return "obeso, imc: " + imc;
			}	

	}
}
