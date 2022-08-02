package aulaTerca;

import java.util.Scanner;

public class segundaAtividade {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String usuario;
		String senha;

		System.out.print("Entre com o nome do usuário : ");
		usuario = sc.nextLine();

		System.out.println("Entre com a senha: ");
		senha = sc.nextLine();

		while (usuario.equals(senha)) {
			System.out.println("Usuário inválido! ");

			System.out.print("Entre com o nome do usuário : ");
			usuario = sc.nextLine();

			System.out.println("Entre com a senha: ");
			senha = sc.nextLine();

		}
		System.out.println("Cadastro realizado com sucesso! ");
		sc.close();
	}
}
