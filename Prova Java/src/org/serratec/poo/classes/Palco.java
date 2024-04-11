package org.serratec.poo.classes;

public class Palco {

	private String nome;
	private int capacidade;
			
	public Palco(String nome, int capacidade) {
		
		this.nome = nome;
		this.capacidade = capacidade;
		}
	
	
	
	public String getNome() {
		return nome;
	}
	public int getCapacidade() {
		return capacidade;
	}

	public String toString() {
		return "Palco [nome=" + nome + ", capacidade=" + capacidade ;
	}
	
	
	
}
