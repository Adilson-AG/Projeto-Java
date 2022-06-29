package model;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import service.BD;

public class FornecedorDAO {
	
	private String sql,men;
	private BD bd;
	
	public FornecedorDAO() {
		bd = new BD();
	}
	/**
	 * Realiza  o cadastro de fornecedor
	 * @param f - Objeto do tipo funcionario
	 * @return - Mensagem com o resultado da opera��o
	 */
	public String incluir(Fornecedor f) {
		sql = "insert into fornecedor (nome,cnpj,telefone,email) values (?, ?, ?, ?)";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setString(1, f.getNome());
			bd.st.setString(2, f.getCnpj());
			bd.st.setString(3, f.getTelefone());
			bd.st.setString(4, f.getEmail());
			bd.st.executeUpdate();
			men = "Fornecedor cadastrado com sucesso!";
		}
		catch(SQLException erro) {
			
				men = "Erro no cadastro do fornecedor" +erro;
			}
		finally {
			bd.close();
		}
		return men;
	}
	/**
	 * Realiza  a atualiza��o de fornecedor
	 * @param f - Objeto do tipo funcionario
	 * @return - Mensagem com o resultado da opera��o
	 */
		public String atualizar(Fornecedor f) {
			
		sql = "update fornecedor set telefone=?, email=? where codfornecedor = ?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(3,f.getCodfornecedor());
			bd.st.setString(1,f.getTelefone());
			bd.st.setString(2,f.getEmail());
			bd.st.executeUpdate();
			men = "Fornecedor atualizado com sucesso"; 
		}
		catch(SQLException e) {
			men = "N�o foi possivel atualizar o fornecedor!"+e; 
		}
	
	finally {
		bd.close();
	}
	return men;
}
	/**
	 * Realiza a exclus�o de um fornecedor
	 * @param codigo - Paramentro utilizado para identificar o fornecedor a ser excluido
	 * @return - Mensagem com o resultado da opera��o
	 */
	public String excluir(int codfornecedor) {
		sql = "delete fornecedor where codfornecedor = ?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1,codfornecedor);
			if(bd.st.executeUpdate()==1)
				men = "Fornecedor exclu�do com sucesso!";
			else
				men = "Fornecedor n�o foi encontrado!";
		}
		catch(SQLException erro) {
			men = "Falha na exclus�o "+erro; 
		}
		finally {
			bd.close();
		}
		return men;
	}
	/**
	 * Gera a listagem de fornecedores para ser consultado
	 * @param sql - Parametro utilizado para gerar uma listagem de fornecedor
	 * @return - Mensagem com o resultado da opera��o
	 */
	public List<Fornecedor> get(String sql){
		List<Fornecedor> lista = new ArrayList<Fornecedor>();
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.rs = bd.st.executeQuery();
			while(bd.rs.next()) {
				
				
				lista.add(new Fornecedor(
						bd.rs.getInt(1),
						bd.rs.getString(2), 
						bd.rs.getString(3),
						bd.rs.getString(4),
						bd.rs.getString(5))
					);
			}
		}
		catch(SQLException erro) {
			lista = null;
			System.out.println(erro);
		}
		finally {
			bd.close();
		}
		return lista;
	}
}
