package aulas;

import java.util.Scanner;

public class VerificacaoDeDados {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome;
		int idade = 0;
		double salario;
		char sexo;
		char estado;

		System.out.print("Entre com um nome: ");
		nome = sc.nextLine();

		while (nome.length() < 3) {
			System.out.println("Nome não pode conter menos que 3 caracteres! ");
			System.out.print("Entre com um nome: ");
			nome = sc.nextLine();

		}

		System.out.print("Digite sua idade: ");
		idade = sc.nextInt();

		while (idade < 0 || idade > 150) {
			System.out.println("Idade inválida! ");
			System.out.print("Digite sua idade: ");
			idade = sc.nextInt();

		}

		System.out.print("Digite o seu salário: ");
		salario = sc.nextDouble();

		while (salario <= 0) {
			System.out.println("Salário inválido!");
			System.out.print("Digite o seu salário: ");
			salario = sc.nextDouble();
		}

		System.out.print("Digite seu sexo: ");
		sexo = sc.next().charAt(0);

		while (Character.toUpperCase(sexo) != 'M' && Character.toUpperCase(sexo) != 'F') {
			System.out.println("Sexo inválido!");
			System.out.print("Digite seu sexo: ");
			sexo = sc.next().charAt(0);

		}

		System.out.print("Digite seu estado civil: ");
		estado = sc.next().charAt(0);
		
		while (Character.toUpperCase(estado) != 'S'
			&& Character.toUpperCase(estado) != 'C'
			&& Character.toUpperCase(estado) != 'D'
			&& Character.toUpperCase(estado) != 'V') {
			
		System.out.println("Estado civil inválido!");
		System.out.print("Digite seu estado civil: ");
		estado = sc.next().charAt(0);
	
	}
		System.out.println(nome + " tem " + idade + " anos de idade" + ", seu salário é " + salario + " reais, seu sexo é " + sexo + ", e seu estado civil é " + estado);
		sc.close();
	}

}
