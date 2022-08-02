package aulas;

import java.util.Scanner;

public class switchCase {

	public static void main(String[] args) {
		
	/*	Faça um programa que peça o nome e a senha e faça a verificação de uma variável
		que obtenha a senha e o usuário (como se fosse cadastrado) e retorne erro caso a
		senha ou o usuário esteja errado. A mensagem a ser mostrada deve ser de acordo com o respectivo erro!

		 */
		
        Scanner in = new Scanner(System.in);
        // 1) Informe o seu login
        System.out.println("login> ");
        String login = in.nextLine();
        // 2) Informe a sua senha
        System.out.println("senha> ");
        String senha = in.nextLine();
        // 3) Armazenar em variaveis o login e a senha
        // 4) Verificar se o login e a senha estão corretos
        // login == "claudio"
        // Estamos comparando uma instância(objeto) com uma string
        if(login.equals("Alessandro") && senha.equals("1234")){
            System.out.printf("Usuário %s logado com sucesso.", login);
        }else{
            System.out.println("Login ou senha inválidos!");
        }
    }
}
