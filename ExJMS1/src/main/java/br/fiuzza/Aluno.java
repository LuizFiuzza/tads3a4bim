package br.fiuzza;
import java.io.Serializable;


public class Aluno implements Serializable {

	private String nome;
	private int ra;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getRa() {
		return ra;
	}
	public void setRa(int ra) {
		this.ra = ra;
	}
	
	
	
}
