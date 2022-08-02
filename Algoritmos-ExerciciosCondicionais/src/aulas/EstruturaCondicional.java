package aulas;

import java.util.Scanner;

public class EstruturaCondicional {

	public static void main(String[] args) {
		Scanner leia = new Scanner (System.in);
			
		/*	int n1 = 0;
			int n2 = 0;
			int n3 = 0;
			
		/*	System.out.print ("Insira o primeiro número: ");
			n1 = leia.nextInt();
			
			System.out.print ("Insira o segundo número: ");
			n2 = leia.nextInt();
			
			
			
			if(n1 > n2) {
				System.out.printf ("Número %d é o maior: ", n1);
			}else {
				System.out.printf ("Número %d é o maior: ", n2); */
				
		/*	System.out.print ("Insira o primeiro número: ");
			n1 = leia.nextInt();
			
			System.out.print ("Insira o segundo número: ");
			n2 = leia.nextInt();
			
			System.out.print ("Insira o terceiro número: ");
			n3 = leia.nextInt();
			
			if (n1 > n2 && n1 > n3) {
				System.out.println("O maior número é: " + n1);
			}else if(n2 > n3){
				System.out.println("O maior número é: " + n2);
			}else {
				System.out.println("O maior número é: " + n3); */
			
			System.out.print ("Insira o primeiro número: ");
			int numero = leia.nextInt();
			
			switch (numero) {
			case 1:
				System.out.println("Você digitou o número 1");
				break;
				
			case 2:
				System.out.println("Você digitou o número 2");
				break;
				
				default:
					System.out.println("Você digitou um número maior que 2 ou vc digitou uma letra!");
				break;
				
			}
			System.out.println("Saiu do switch case!");
			leia.close();
		}
	}
