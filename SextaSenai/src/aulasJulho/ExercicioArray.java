package aulasJulho;

import java.util.Scanner;

public class ExercicioArray {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int [] [] numerosArray = new int [4][4];
		int contador = 9;
		
		for ( int i = 0; i < numerosArray.length; i++) {
			
			for (int j = 0; j < numerosArray.length; j++) {
				
				numerosArray[i][j] = contador;
				System.out.print(numerosArray[i][j] + "\t");
				contador ++;
								
			}
			System.out.println("\n");
		}
		sc.close();

	}

}
