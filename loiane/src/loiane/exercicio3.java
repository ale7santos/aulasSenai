package loiane;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite um numero: ");
		int numero = scanner.nextInt();
		System.out.println("Digite outro numero: ");
		int numero2 = scanner.nextInt();
		int resultado = numero + numero2;
		
		System.out.println("A soma dos números que você digitou é de: " + resultado);

	}

}
