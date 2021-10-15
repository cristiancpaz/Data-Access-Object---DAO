package apresentacao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import negocio.Contato;
import negocio.Endereco;
import persistencia.contatoDAO;
//import persistencia.ConexaoPostgreSQL;
import persistencia.enderecoDAO;

public class app {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Scanner scn = new Scanner(System.in);
		
		System.out.println("*********************************************");
		System.out.println("Cadastro de Contatos: ");
		System.out.print("Informe seu nome: ");
		String nomeContato = scn.next();
		
		System.out.print("Informe numero do Endereço: ");
		int numero = scn.nextInt();
		
		System.out.print("Informe bairro: ");
		String bairro = scn.next();
		
		System.out.print("Informe logradouro: ");
		String logradouro = scn.next();
		
		System.out.print("Informe complemento: ");
		String complemento = scn.next();
		
		scn.close();
		
		
		//conexao com banco
	//	ConexaoPostgreSQL  conexao = new ConexaoPostgreSQL();
	//	conexao.getConnection();
		
		
		//inserir contato
      new contatoDAO().inserir(new Contato(3, nomeContato));
   
		//excluir contato
		//new contatoDAO().excluir(3);
		//new contatoDAO().excluir(4);
		//new contatoDAO().excluir(5);
		//new contatoDAO().excluir(6);
		
		//atualizar contato
		//new contatoDAO().atualizar(new Contato(2222, nomeContato));
	
		//listar contatos
		ArrayList<Contato> contato = new contatoDAO().listar();
		for(int i=0;i<contato.size();i++) {
			Contato c = contato.get(i);
			System.out.print("\nContato: ");
			System.out.println("\nID: " + c.getId() + "," 
										+"\nNome: " + c.getNome());
		}
		
		//inserir endereco
	 	new enderecoDAO().inserir(new Endereco(1, 3, numero, bairro, logradouro, complemento));
	 	//new enderecoDAO().inserir(new Endereco(2, 3, numero, bairro, logradouro, complemento));
	 	//new enderecoDAO().inserir(new Endereco(3, 3, numero, bairro, logradouro, complemento));
	 	
		
		//excluir endereco
		//new enderecoDAO().excluir(4);
		//new enderecoDAO().excluir(5);
		//new enderecoDAO().excluir(6);
		
		//atualizar endereco
		//new enderecoDAO().atualizar(new Endereco(1, 4, 500, "centro", "rio grande", "casa"));
		
		
		//listar endereco
		ArrayList<Endereco> endereco = new enderecoDAO().listar();
		for(int j = 0 ; j < endereco.size(); j++) {
			Endereco e = endereco.get(j);
			System.out.println("*********************************************");	
			System.out.println("Endereco: " +"\nID: " +e.getId()+ ", "
											+"\nID_contato: "+ e.getId_contato()+ ", "
											+"\nNumero: "    + e.getNumero()    + ", "
											+"\nBairro: "    + e.getBairro()    + ", "
											+"\nLogradouro: "+ e.getLogradouro()+ ", "
											+"\nComplemento:"+ e.getComplemento());
		}
		
		    System.out.println("*********************************************");	
	}
}
