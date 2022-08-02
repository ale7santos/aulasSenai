package aulaTerca;

import java.util.Scanner;

public class validacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String nome;
		int idade = 0;
		double salario = 0.0;
		char sexo;
		char estadoCivil;

		System.out.println("Entre com o nome: ");
		nome = sc.nextLine();
		
		while (nome.length() < 3) {
			System.out.println("Nome não pode conter menos que 3 caracteres");
			System.out.println("Entre com o nome: ");
			nome = sc.nextLine();
		}

		System.out.println("Entre com a idade: ");
		idade = sc.nextInt();
		
		while(idade < 0 || idade > 150 ) {
			System.out.println("idade inválida, entre com a idade novamente!");
			System.out.println("Entre com a idade: ");
			idade = sc.nextInt();
		}
	

		System.out.println("Entre com o salário: ");
		salario = sc.nextDouble();
		
		while(salario < 0 ) {
			System.out.println("Inválido");
			System.out.println("Entre com o salário: ");
			salario = sc.nextDouble();
		}

		System.out.println("Entre com o sexo: ");
		sexo = sc.next().charAt(0);
	
		while(Character.toUpperCase(sexo) !='M' && (Character.toUpperCase(sexo) != 'F')){
				System.out.println("Entre com o sexo válido");
		System.out.println("Entre com o sexo: ");
		sexo = sc.next().charAt(0);
		
		}

		System.out.println("Entre com o estdado civil");
		estadoCivil = sc.next().charAt(0);
		
		while(Character.toUpperCase(estadoCivil) != 'S'
				&& (Character.toUpperCase(estadoCivil) != 'C' 
				&& (Character.toUpperCase(estadoCivil) != 'V'
				&& (Character.toUpperCase(estadoCivil) != 'D')))){
					
					System.out.println("Inválido");
					
					System.out.println("Entre com o estado civil:");
					estadoCivil = sc.next().charAt(0);
				}

		sc.close();

	}

}
