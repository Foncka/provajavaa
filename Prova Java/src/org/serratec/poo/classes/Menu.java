package org.serratec.poo.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Menu {

	protected static List<Artista> artistas = new ArrayList<>();
	protected static List<Palco> palcos = new ArrayList<>();
	static Scanner scanner = new Scanner(System.in);
	static String banda;
	static String palco;
	static double cache;
	static int capacidade;
	
	
	

	public static void cadastroBanda(){
	System.out.println("Digite uma Banda:");
	banda = scanner.next();
	System.out.println("Digite o cache:");
	cache = scanner.nextDouble();
	Artista artista1 = new Artista(banda, cache);
	artistas.add(artista1);
	}
	
	
	

	public static void cadastroPalco(){
	System.out.println("Digite o Nome do Local:");
	palco = scanner.next();
	System.out.println("Digite a capacidade:");
	capacidade = scanner.nextInt();
	Palco palco1 = new Palco(palco, capacidade);
	palcos.add(palco1);
	}




	






	
}
