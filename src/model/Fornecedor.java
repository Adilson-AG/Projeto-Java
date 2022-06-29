package model;

public class Fornecedor {
	
	private int codfornecedor;
	private String nome;
	private String cnpj;
	private String telefone;
	private String email;
	
	public String toString() {
		return codfornecedor+"nome"+";"+"cnpj"+";"+"telefone"+";"+"email";
		
	}
			
	public Fornecedor( String nome, String cnpj, String telefone, String email) {
		
		this.nome = nome;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.email = email;
	}

	public Fornecedor(int codfornecedor, String nome, String cnpj, String telefone, String email) {
		
		this.codfornecedor = codfornecedor;
		this.nome = nome;
		this.cnpj = cnpj;
		this.telefone = telefone;
		this.email = email;
	}

	public int getCodfornecedor() {
		return codfornecedor;
	}

	public void setCodfornecedor(int codfornecedor) {
		this.codfornecedor = codfornecedor;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * Inseri um fornecedor no banco de dados
	 * @param fornecedor - recebe um objeto do tipo fornecedor. 
	 */
public void cadastrarFornecedor(Fornecedor fornecedor) {
		
	 FornecedorDAO f =new FornecedorDAO();
     f.incluir(fornecedor);
	      
	}

	
}
