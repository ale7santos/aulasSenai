package aulas;

import java.util.Scanner;

public class folhaPagamento {

	public static void main(String[] args) {
/*
		Peça para o usuário inserir o valor do seu salario bruto
		e faça o desconto de 5% do IRPF, e 11 % do INSS e mostre
		o salario liquido. Se o salario liquido for menor que 1200,00
		o profissional receberá 5% a mais de bônus, se o salario liquido
		ultrapassar 3500,00 o funcionario recebera 2% a mais de bônus */
		
		double salario = 0;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o valor bruto do seu salário: ");
		salario = leia.nextDouble();
		double descontoIrpf = (salario * 0.05);
		double descontoInss = (salario * 0.11);
		double valorIrfp = salario - descontoIrpf;
		double valorLiquido = valorIrfp - descontoInss;
		
		
		System.out.println("O salário com os descontos é de: " + valorLiquido);
		
		if(valorLiquido < 1200) {
			System.out.println("Você irá receber 5% a mais");
		}else if(valorLiquido > 3500) {
			System.out.print("Você irá receber 2% a mais");
		}
		
		
		leia.close();

	}

}
