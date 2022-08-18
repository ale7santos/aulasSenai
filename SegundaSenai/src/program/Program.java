package program;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Carro;
import entities.Moto;
import entities.Veiculo;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);

		Veiculo carro = new Carro();
		Veiculo moto = new Moto();

		ArrayList<Veiculo> carros = new ArrayList<>();
		ArrayList<Moto> motos = new ArrayList<>();

		char opcao;

		System.out.println("Você deseja cadastrar um veículo ? (s/n)");
		opcao = sc.next().charAt(0);

		while (Character.toLowerCase(opcao) == 's') {

			System.out.println("Tipo de veículo: (c/m)");
			opcao = sc.next().charAt(0);

			switch (Character.toLowerCase(opcao)) {
			case 'c':

				sc.nextLine();
				System.out.println("Entre com o tipo do veículo: ");
				carro.setTipo(sc.nextLine());

				System.out.println("Entre com o tipo de combustivel:");
				carro.setTipoCombustivel(sc.nextLine());

				System.out.println("Entre com a potencia do motor");
				;
				carro.setPotencia(sc.nextLine());

				System.out.println("Entre com o modelo: ");
				carro.setModelo(sc.nextLine());

				System.out.println("Entre com a quantidade de passageiros: ");
				carro.setQtdPassageiros(sc.nextInt());

				System.out.println("Entre com a quantidade de pneus: ");
				carro.setQtdPneus(sc.nextInt());

				carros.add(carro);

				break;

			default:
				System.out.println("Tipo incompatível!");
				break;
			}
			for (Veiculo listaCarros : carros) {
				System.out.println(listaCarros);

			}
		}

		sc.close();
	}

}
