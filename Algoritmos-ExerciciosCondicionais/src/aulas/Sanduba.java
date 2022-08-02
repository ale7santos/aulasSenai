package aulas;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Sanduba {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		System.out.println("Escolha o número do seu pedido: ");
		int pedido = leia.nextInt();

		switch (pedido) {

		case 1:
			System.out.println("Você escolheu o natureba!");
			break;

		case 2:
			System.out.println("Você escolheu a Bomba!");
			break;

		case 3:
			System.out.println("Você escolheu a coxinha de Jaca!");
			break;

		case 4:
			System.out.println("Você escolheu a feijoada vegetariana!");
			break;
			
		default:
			System.out.println("Número inválido!!! Digite um número de 1 a 4!");
		break;

		}
		leia.close();
	}
}