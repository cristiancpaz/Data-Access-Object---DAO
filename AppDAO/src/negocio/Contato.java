package negocio;

import java.util.ArrayList;

public class Contato {
	private int id;
	private String nome;
	
	ArrayList<Endereco> endereco = new ArrayList<>();
	
	public Contato() {}
	
	public Contato(int id, String nome) {
		this.id   = id;
		this.nome = nome;
	}

	public ArrayList<Endereco> getEndereco() {
		
		return this.endereco;
	}
	
	public void setEndereco(int posicao, Endereco e) {
		for(int i=0;i<endereco.size();i++) {
			this.endereco.add(posicao, e);
		}
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
