package cursojava.classes;

import java.io.Serializable;

public class Usuario implements Serializable {

	private String login;
	private String senha;
	private String cpf;
	private String nome;
	
	
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	@Override
	public String toString() {
		return "Usuario [login=" + login + ", senha=" + senha + ", cpf=" + cpf + ", nome=" + nome + "]";
	}
	
	
	
}
