package org.serratec.poo.classes;

public class Artista {

	private String nome;
	private double cache;
	
	public Artista(String nome, double cache) {
		this.nome = nome;
		this.cache = cache;
	}
	
	
	public enum generoEnum{
		Pop,
		Rock,
		Sertanejo,
		Funk,
		Eletronica,
		Gospel;
		}


	public String getNome() {
		return nome;
	}


	public double getCache() {
		return cache;
	}



	public String toString() {
		return "Artista [nome=" + nome + ", cache=" + cache + "]";
	}


	

	
	
	
	
}
