package br.com.emotional.entidade;

import java.util.Calendar;


/*
 * Classe responsável por criar instância de usuario
 */
public class Usuario {
	private int idUsu; 
	private String nome;
	private String login; 
	private String email; 
	private String senha; 
	private String imagem; 
	private String cpf; 
	private int idEmocao; 
	private Calendar dataNascimento; 
	private boolean premium;
	private boolean ativo;
	private String tipoUsuario; 
	
	public int getidUsu() {
		return idUsu;
	}
	public void setidUsu(int idUsu) {
		this.idUsu = idUsu;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public int getidEmocao() {
		return idEmocao;
	}
	public void setidEmocao(int idEmocao) {
		this.idEmocao = idEmocao;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Calendar getDataNascimento () {
		return dataNascimento ;
	}
	public void setDataNascimento(Calendar dataNascimento ) {
		this.dataNascimento  = dataNascimento;
	}
	public boolean premium() {
		return premium;
	}
	public void setPremium(boolean premium) {
		this.premium = premium;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	
	@Override
	public String toString() {
		String saida = idUsu + " " + nome; 
		return saida;
	}
	
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
}
