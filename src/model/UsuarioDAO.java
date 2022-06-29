package model;

import java.util.ArrayList;
import java.util.List;

import service.BD;

public class UsuarioDAO {

	private String sql,retorno;
	private BD bd;
	
	public UsuarioDAO() {
		bd = new BD();
	}

    public String cadastrar(Usuario us) // grava no banco
    {
        try
        {
        	bd.getConnection();
        	sql = "insert into usuario(nome,senha,loginUS,email,cargo) values (?,?,?,?,?); ";
        	
        	bd.st = bd.con.prepareStatement(sql);
        	bd.st.setNString(1, us.nome);
        	bd.st.setNString(2, us.senha);
        	bd.st.setNString(3, us.loginUs);
        	bd.st.setNString(4, us.email);
        	bd.st.setNString(5, us.cargo);
        	bd.st.executeUpdate();
			retorno = "Usuario inserido com sucesso!";
			
			return retorno;
        }
        catch(Exception erro) {	retorno = "Falha no método cadastrar do usuarioDAO";	}		
		finally { bd.close(); }
		return retorno;
    }


    public List<Usuario> listar()
    {
    	sql = "Select codusuario, nome, senha, loginUS, email, cargo from usuario"; 
    	bd.getConnection();
    	List<Usuario> lista = new ArrayList<Usuario>();
    	
        try
        {
        	bd.st = bd.con.prepareStatement(sql);
        	bd.rs = bd.st.executeQuery();
        	
            while(bd.rs.next()) {
            	lista.add(new Usuario(
            			bd.rs.getInt(1),
            			bd.rs.getString(2),
            			bd.rs.getString(3),
            			bd.rs.getString(4),
            			bd.rs.getString(5),
            			bd.rs.getString(6))
            	);
            }            
        }
        catch(Exception erro) {	lista = null; System.out.println(erro);	}		
		finally { bd.close(); }
		return lista;
    }
    
    public String alterar(Usuario us)
    {
    	sql = "update usuario set nome=?, senha=?, loginUS=?, email=?, cargo=? where codusuario=?"; 
    	bd.getConnection();
    	
        try
        {
        	bd.st = bd.con.prepareStatement(sql);
        	bd.st.setNString(1, us.nome);
        	bd.st.setNString(2, us.senha);
        	bd.st.setNString(3, us.loginUs);
        	bd.st.setNString(4, us.email);
        	bd.st.setNString(5, us.cargo);
        	bd.st.setInt(6, us.codusuario);
        	
        	if(bd.st.executeUpdate()==1)
        		retorno = "Usuario atualizado com sucesso com sucesso";
			else
				retorno = "Falha ao atualizar o usuario";			
        }
        catch(Exception erro) {	retorno = "Falha no método alterar do usuarioDAO";	}
		finally { bd.close(); }
		return retorno;
    }
    
    public String remover(int codigo)
    {
    	sql = "delete usuario where codusuario = ?";
		bd.getConnection();
		try {
			bd.st = bd.con.prepareStatement(sql);
			bd.st.setInt(1,codigo);
			if(bd.st.executeUpdate()==1)
				retorno = "Usuario exclu�do com sucesso!";
			else
				retorno = "Usuario n�o foi encontrado!";
		}
		catch(Exception erro) {	retorno = "Falha no método remover do usuarioDAO";	}
		finally { bd.close(); }
		return retorno;    	
    }


    public List<Usuario> buscaNome(String n) // busca por um nome
    {    	
    	int cod = -1;
    	sql = "Select codusuario, nome, senha, loginUS, email, cargo from usuario where nome like '?'"; 
    	bd.getConnection();
    	List<Usuario> lista = new ArrayList<Usuario>();
    	
        try
        {
        	bd.st = bd.con.prepareStatement(sql);
        	bd.st.setNString(1, n);
        	bd.rs = bd.st.executeQuery();
        	
            while(bd.rs.next()) {
            	lista.add(new Usuario(
            			cod,
            			bd.rs.getString(1),
            			bd.rs.getString(2),
            			bd.rs.getString(3),
            			bd.rs.getString(4),
            			bd.rs.getString(5))
            	);
            }            
        }
        catch(Exception erro) {	lista = null; System.out.println(erro);	}		
		finally { bd.close(); }
		return lista;
	}
    
    public List<Usuario> fazerLogin(Usuario us)
    {    	
    	sql = "Select codusuario, nome, senha, loginUS, email, cargo from usuario "
    			+ "where nome = ? and senha = ?"; 
    	bd.getConnection();
    	List<Usuario> lista = new ArrayList<Usuario>();
    	
        try
        {
        	bd.st = bd.con.prepareStatement(sql);
        	bd.st.setNString(1, us.nome);
        	bd.st.setNString(2, us.senha);
        	bd.rs = bd.st.executeQuery();
        	
        	while(bd.rs.next()) {
            	lista.add(new Usuario(
            			bd.rs.getInt(1),
            			bd.rs.getString(2),
            			bd.rs.getString(3),
            			bd.rs.getString(4),
            			bd.rs.getString(5),
            			bd.rs.getString(6))
            	);
            }        	
        }
        catch(Exception erro) {	lista = null; System.out.println(erro);	}		
		finally { bd.close(); }
		return lista;
    }

	
}
