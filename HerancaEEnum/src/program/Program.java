package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Cliente;
import entities.Conta;
import entities.ContaCorrente;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		
	//	Cliente cliente = new Cliente();
		Conta contaContaCorrente = new ContaCorrente();
		Conta conta = new Conta();
		
		conta.Depositar(100);
		contaContaCorrente.Depositar(200);
		
		conta.Sacar(50);
		contaContaCorrente.Sacar(50);
		
		System.out.println("Saldo da conta: " + conta.getSaldo());
		System.out.println("Saldo da conta corrente: " + contaContaCorrente.getSaldo());
		

	/*	System.out.println("Entre com o nome do titular: ");
		cliente.setNome(sc.nextLine());

		System.out.println("Entre com o cpf do titular: ");
		cliente.setCpf(sc.nextLine());

		contaContaCorrente.setTitular(cliente);
		System.out.println("Entre com o número da agência: ");
		contaContaCorrente.setAgencia(sc.nextInt());

		System.out.println("Entre com o número da conta: ");
		contaContaCorrente.setNumeroConta(sc.nextInt());

		System.out.println("Digite o valor para deposito: ");
		contaContaCorrente.Depositar(sc.nextDouble());

		System.out.println("Conta criada! ");

		System.out.println(contaContaCorrente);
		
		System.out.println("\nEntre com o valor do saque: ");
		contaContaCorrente.Sacar(sc.nextDouble());
		
		System.out.println("Saldo atualizado: ");
		System.out.println(contaContaCorrente); */

		sc.close();

	}

}
