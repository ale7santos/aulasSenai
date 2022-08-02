package loiane;

import java.util.Scanner;

public class exercicio6 {
	
	public static void main(String[] args) {
		
	Scanner scan = new Scanner(System.in);	
	System.out.println("Escreva o valor do raio");
	
	double raio = scan.nextDouble() ;
	
	double area = Math.PI * Math.pow(raio, 2);
	
	System.out.println("A área do círculo é: " + area);

		}
}