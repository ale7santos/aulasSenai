package aulas;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		/*
		 * Use array para esse exercício 1. Faça um Programa que leia 4 notas, mostre as
		 * notas e a média na tela. 2. Faça um Programa que peça a idade e a altura de 5
		 * pessoas, armazene cada informação no seu respectivo vetor. Imprima a idade e
		 * a altura na ordem
		 */
		Scanner sc = new Scanner (System.in);
		double[] nota  = new double [4];
		double media = 0.0;
		
		for (int i = 0; i < nota.length; i++) {
			System.out.println("Entre com a nota: ");
			nota[i] = sc.nextDouble();
			
		}
		media = (nota[0] + nota[1] + nota [2] + nota[3]) / 4;
			sc.close();
			System.out.println("A média é: " + media);
	}

}
