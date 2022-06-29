package control;

import model.Fornecedor;

public class FornecedorControle {
	/** Realiza cadastro de fornecedor que permite salvar um fornecedor apartir da camada view.
	 * 
	 * @param nome - recebe nome do fornecedor em string.
	 * @param cnpj - recebe o cnpj do fornecedor em string.
	 * @param telefone - recebe o telefone do fornecedor em string.
	 * @param email - recebe o email do fornecedor em string.
	 * @return - retorna verdadeiro caso salvo com  sucesso ou falso caso nao sucesso.
	 */
	public boolean cadastrarFornecedor(String nome, String cnpj,String telefone, String email) {
		
		boolean ret = false;
		
		if( nome != null && nome.length() >0 
				&& cnpj != null && cnpj.length() >0 && telefone!= null && telefone.length() >0 
				&& email != null && email.length() >0 ) {
			
			Fornecedor fornecedor = new Fornecedor( nome, cnpj, telefone, email);
			fornecedor.cadastrarFornecedor(fornecedor);
			 ret = true;
		      
		}
		
		return ret;
		
	}

}
