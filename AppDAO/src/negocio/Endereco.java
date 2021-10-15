package negocio;

public class Endereco {
	private int id;
	private int id_contato;
	private int numero;
	private String bairro;
	private String logradouro;
	private String complemento;
	

	public Endereco(int id, int id_contato,int numero, String bairro, String logradouro, String complemento) {
		this.id = id;
		this.id_contato = id_contato;
		this.numero = numero;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.complemento = complemento;
		
	}
	
	public Endereco() {}
	
	public Endereco(int id, int numero, String bairro, String logradouro, String complemento) {
		this.id = id;
		this.numero = numero;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.complemento = complemento;
	}
	
	public int getId_contato() {
		return this.id_contato;
		
	}
	public void setIdContato(int id) {
		this.id_contato = id;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLogradouro() {
		return this.logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getComplemento() {
		return complemento;
	}

	public void setComplemento(String complemento) {
		this.complemento = complemento;
	}
	
	
	
	

}
