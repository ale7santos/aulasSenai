package cursojava.executavel;

import java.util.Scanner;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	public static void main(String[] args) {

		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno");
		String idade = JOptionPane.showInputDialog("Qual a sua idade? ");
		String nascimento = JOptionPane.showInputDialog("Qual a data de nascimento? ");
		String rg = JOptionPane.showInputDialog("Qual o rg: ");
		String nota1 = JOptionPane.showInputDialog("Qual a nota 1?" );
		// new Aluno = instancia ou seja, criação de um obj
		Aluno aluno1 = new Aluno();
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setNascimento(nascimento);
		aluno1.setRg(rg);
		aluno1.setCpf("036");
		aluno1.setMae("Francisca");
		aluno1.setPai("Ernandes");
		aluno1.setDataMatricula("21/02/2022");
		aluno1.setSerieMatriculado("9° Ano");
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(65);
		aluno1.setNota3(65.7);
		aluno1.setNota4(77);

		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Data de nascimento: " + aluno1.getNascimento());
		System.out.println("Registro Geral: " + aluno1.getRg());
		System.out.println("Cpf: " + aluno1.getCpf());
		System.out.println("Resultado: " + aluno1.getAlunoAprovado2());
		System.out.println("Resultado: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("----------------------------------------------------");
		/*
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Bia");
		aluno2.setIdade(22);
		aluno2.setNascimento("12/09/1997");
		aluno2.setRg("2025");
		aluno2.setCpf("033");
		aluno2.setMae("Maria");
		aluno2.setPai("Jhonny");
		aluno2.setDataMatricula("22/02/2022");
		aluno2.setNome("Mackenzie");
		aluno2.setSerieMatriculado("1° Ano");

		System.out.println("Nome: " + aluno2.getNome());
		System.out.println("Idade: " + aluno2.getIdade());
		System.out.println("Data de nascimento: " + aluno2.getNascimento());
		System.out.println("Registro Geral: " + aluno2.getRg());
		System.out.println("Cpf: " + aluno2.getCpf());

		Aluno aluno3 = new Aluno();
		aluno3.setNome("Alessandro");
		aluno3.setIdade(18);
		aluno3.setNascimento("12/09/1991");
		aluno3.setRg("2022");
		aluno3.setCpf("036");
		aluno3.setMae("Francisca");
		aluno3.setPai("Ernandes");
		aluno3.setDataMatricula("21/02/2022");
		aluno3.setNome("Ludovido");
		aluno3.setSerieMatriculado("9° Ano");

		System.out.println("Nome: " + aluno3.getNome());
		System.out.println("Idade: " + aluno3.getIdade());
		System.out.println("Data de nascimento: " + aluno3.getNascimento());
		System.out.println("Registro Geral: " + aluno3.getRg());
		System.out.println("Cpf: " + aluno3.getCpf());

		Aluno aluno4 = new Aluno();

		Aluno aluno5 = new Aluno();
*/
	}

}
