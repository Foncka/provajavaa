package org.serratec.poo.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrganizaEvento extends Menu {
	static Scanner scan = new Scanner(System.in);
	static String respostaArtista;
	static String respostaPalco;
	static String hora;
	static String datashow;
	static List<Evento> eventoconfirmado= new ArrayList<>();
	
	public static void agendarShow() {
		System.out.println("Escolha um cantor ou Banda(Digite o Nome referente)");
		System.out.println(artistas);
		respostaArtista = scan.next();
		System.out.println("Escolha um local(Digite o Nome referente)");
		System.out.println(palcos);
		respostaPalco = scan.next();
		System.out.println("Digite a data:");
		datashow = scan.next();
		System.out.println("Digite a hora:");
		hora = scan.next();
		
		Evento evento1 = new Evento(respostaArtista, respostaPalco, datashow, hora);
		System.out.println(evento1);
		eventoconfirmado.add(evento1);
	}
	
	
	
	public static void listar() {
		System.out.println(eventoconfirmado);
		System.out.println(palcos);
		System.out.println(artistas);
	}
	
	
}
