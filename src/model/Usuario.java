package model;

public class Usuario {
	
	public int codusuario;
    public String nome;
    public String senha;
    public String loginUs;
    public String email;
    public String cargo;
    public String usuarioLogado;
     
     
     
    public int getCodusuario() {
		return codusuario;
	}
	public void setCodusuario(int codusuario) {
		this.codusuario = codusuario;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getLoginUs() {
		return loginUs;
	}
	public void setLoginUs(String loginUs) {
		this.loginUs = loginUs;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getUsuarioLogado() {
		return usuarioLogado;
	}
	public void setUsuarioLogado(String usuarioLogado) {
		this.usuarioLogado = usuarioLogado;
	}

	public void Usuario() {}
	
	 public Usuario(int cod, String nome, String senha,
			String loginUs, String email, String cargo) {
		if (cod <= 0) this.setCodusuario(cod);
		else this.setCodusuario(-1);
		this.setNome(nome);
		this.setSenha(senha);
		this.setLoginUs(loginUs);
		this.setEmail(email);
		this.setCargo(cargo);
	 }
	
	 public String toString() {
		return getCodusuario()+";"+getNome()+";"+getLoginUs()+";"+
				";"+getEmail()+";"+getCargo();
	 }
}
