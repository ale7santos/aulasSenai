package aulas;

import java.util.Scanner;

public class DiasSemana {

	public static void main() {

		Scanner sc = new Scanner(System.in);

		int diaSemana = 0;

		System.out.println("Entre com o número para sabero dia da semana: ");

		diaSemana = sc.nextInt();

		switch (diaSemana) {
		case 1:
			System.out.println("Domingo!");
			break;

		case 2:
			System.out.println("Segunda!");
			break;

		case 3:
			System.out.println("Terça!");
			break;

		case 4:
			System.out.println("Quarta!");
			break;

		case 5:
			System.out.println("Quinta!");
			break;

		case 6:
			System.out.println("Sexta!");
			break;	
			
		case 7:
				System.out.println("Sexta!");
				break;

		default:
			System.out.println("opção inválida!");
			break;
		}
		sc.close();
	}
}