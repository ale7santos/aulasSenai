package aulas;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double nota = 0;

		do {
			System.out.println("Digite uma nota entre 0 e 10: ");
			nota = sc.nextDouble();

			if (nota < 0 || nota > 10) {
				System.out.println("Nota inválida! ");

			} else
				System.out.println("Sua nota foi: " + nota);
			

			if (nota >= 7) {
				System.out.println("Parabéns, você está aprovado(a)!");
				break;
				
			} else
				System.out.println("Que pena, boa sorte na próxima!");
			nota = sc.nextDouble();

		} while (nota > 0 || nota < 10);

		sc.close();

	}
}
