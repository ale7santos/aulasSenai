package aulas;

import java.util.Scanner;

public class CalculoHora {
	public static void main(String[]args) {
		
		Scanner leia = new Scanner(System.in);
		
		double valorHora = 0;
		int quantidadeHoras= 0;
		double salario = 0;
		
		System.out.println("Entre com o valor da hora trabalhada:");
		valorHora = leia.nextDouble();
		
		System.out.println("Entre com a quantidade de horas trabalhadas: ");
		quantidadeHoras = leia.nextInt();
		
		salario = valorHora * quantidadeHoras;
		System.out.println("O valor do salário é: "+ salario);
		
		leia.close();
	}

}
