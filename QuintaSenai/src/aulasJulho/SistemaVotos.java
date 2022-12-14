package aulasJulho;

import java.util.Scanner;

public class SistemaVotos {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------------URNA-------------");
		System.out.println("Digite (1) para votar em Molusco: ");
		System.out.println("Digite (2) para votar em Nelson: ");
		System.out.println("Digite (3) para votar em Gomes: ");
		System.out.println("Digite (4) para votar em Bolim: ");
		System.out.println("-------------URNA-------------");

		int voto = sc.nextInt();
		int votosMolusco = 0;
		int votosNelson = 0;
		int votosGomes = 0;
		int votosBolim = 0;
		int votoTotal = 0;

		while (voto > 0) {

			if (voto == 1) {
				votosMolusco++;
				System.out.println("Voto em Molusco computado!");
			} else if (voto == 2) {
				votosNelson++;
				System.out.println("Voto em Nelson computado!");
			} else if (voto == 3) {
				votosGomes++;
				System.out.println("Voto em Gomes computado!");
			} else if (voto == 4) {
				votosBolim++;
				System.out.println("Voto em Bolim computado!");
			} else {
				System.out.println("Voto inválido, vote novamente!");
			}
			if (voto == 1 || voto == 2 || voto == 3 || voto == 4) {
				votoTotal++;
			}
			System.out.println("Vote novamente: ");
			System.out.println("(-1) para Sair");
			voto = sc.nextInt();
		}

		System.out.println("----------RESULTADO--------");
		System.out.println("Total de votos = " + votoTotal +  " = 100%");

		double porcMolusco = (100 * votosMolusco) / votoTotal;
		System.out.println("Molusco = " + porcMolusco + "%");

		double porcNelson = (100 * votosNelson) / votoTotal;
		System.out.println("Nelson = " + porcNelson + "%");

		double porcGomes = (100 * votosGomes) / votoTotal;
		System.out.println("Gomes = " + porcGomes + "%");

		double porcBolim = (100 * votosBolim) / votoTotal;
		System.out.println("Bolim = " + porcBolim + "%");
		
		System.out.println("----------RESULTADO--------");

		sc.close();
	}
}
