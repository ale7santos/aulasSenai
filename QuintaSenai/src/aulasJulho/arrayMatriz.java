package aulasJulho;

import java.util.Scanner;

public class arrayMatriz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
	/*	int [] numero = new int [5]; // declara quantidade de posições do array
		int [] numero2 = {1,25,10}; //inicializa o array
		
		System.out.println(numero2[1]); //obtem o valor do array
		System.out.println(numero.length);
		
		System.out.println("Entre com a quantidade");
		int qtd = sc.nextInt();
		int[] passadoTeclado = new int[qtd];
		
		System.out.println("Quantdade de posições " + passadoTeclado.length); */
		
		
		int [] numeros = {1,10,25,9,50};
		
		/*for (int i = 0; i < numeros.length; i++) {
			System.out.println("posição " + i + ", valor no array: " + numeros[i]);
		}
		*/
		for (int numero : numeros) {
			System.out.println(numero);
		}
		
		sc.close();
		

	}

}
