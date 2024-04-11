package org.serratec.poo.principal;
import java.util.Scanner;
import org.serratec.poo.classes.Menu;
import org.serratec.poo.classes.OrganizaEvento;

public class Festival {


@SuppressWarnings("resource")
public static void main(String[] args) {
	int resposta;
	
	Scanner scan = new Scanner(System.in);
		
	do{System.out.println("""
				
				O que deseja fazer ?
				1 - Cadastrar Banda e palco para evento.
				2 - Cadastrar Palco 
				3 - Agendar Show
				4 - Listar Eventos
				0 - Sair""");
		
		resposta=scan.nextInt();
		
		switch(resposta){
		case 1:
			Menu.cadastroBanda();
			break;
		case 2:
			Menu.cadastroPalco();
			break;
		case 3:
			OrganizaEvento.agendarShow();
			break;
		case 4:
			OrganizaEvento.listar();
			break;	
		case 0:
			break;
		}
		
			}while(resposta!=0);
	}
	


}
	

