package aulaTerca;

import java.util.Scanner;

public class Strings {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner (System.in);
		
		String frase = "Aula Java professor Luan dia vinte e seis";
		char caractere = 's';
		
		System.out.println(frase.length()); // conta qtd tudo
		System.out.println(frase.charAt(2)); // localiza caractere na posição indicada
		System.out.println(frase.lastIndexOf("Z"));// localiza a última ocorrencia do char passado como parametro
		System.out.println(frase.concat("   Foi concatenado"));//Concatena Strings
		System.out.println(frase.contentEquals("Aula"));
		
		
		double x = 1254.36598;
		System.out.println(String.format("%.2f", x));
		
		System.out.println(Character.toUpperCase(caractere));
		System.out.println(Character.toLowerCase(caractere));
		
		sc.close();

	}

}
