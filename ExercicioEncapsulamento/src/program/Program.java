package program;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Carro;
import entities.Cliente;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		Carro carro = new Carro();
		Cliente cliente = new Cliente();
		
		ArrayList <Carro> carros = new ArrayList<>();
		char opt;
		
		System.out.println("Deseja cadastrar um veículo ?(s/n) ");
		opt = sc.next().charAt(0);
		while(Character.toLowerCase(opt) == 's') {
			
		}
			
		
		
		try {
			sc.nextLine();
			System.out.println("Entre com o nome do cliente: ");
			cliente.setNome(sc.nextLine());

			System.out.println("Entre com o nome do cliente: ");
			cliente.setTelefone(sc.nextLine());

			System.out.println("Entre com o nome do cliente: ");
			cliente.setEndereco(sc.nextLine());

			System.out.println("Entre com o nome do cliente: ");
			cliente.setCpf(sc.nextLine());

			carro.setCliente(cliente);

			System.out.println("\n***** Veículo *****\n");
			
			sc.nextLine();

			System.out.println("Entre com o modelo do veículo: ");
			cliente.setModelo(sc.nextLine());

			System.out.println("Entre com o ano do veículo: ");
			cliente.setAno(sc.nextInt());

			sc.nextLine();

			System.out.println("Entre com a cor do veículo: ");
			carro.setCor(sc.nextLine());

			System.out.println("Entre com o tipo do veículo(hatch/sedan/camin: ");
			carro.setTipo(sc.nextLine());

			System.out.println("Veículo novo ou usado: ");
			carro.setEstaoConservacao(sc.nextLine());

			System.out.println("Entre com o tipo do cambio(m/a): ");
			carro.setCambio(sc.next().charAt(0));

			System.out.println("Entre com o tipo de combustível: ");
			carro.getTipoCombustivel(sc.nextLine());

			System.out.println("Entre com o tipo do cambio(m/a): ");
			carro.ValorCompra(sc.nextDouble());

			System.out.println("Dados do carro cadastrado com o valor de venda: \n");
			System.out.println(carro);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
System.out.println("ok");
		sc.close();

	}
}

