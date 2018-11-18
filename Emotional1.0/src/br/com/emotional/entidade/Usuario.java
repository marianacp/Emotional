package br.com.emotional.entidade;

import java.util.Calendar;
//import java.io.FileInputStream;
import java.util.Date;
import java.util.Objects;

public class Usuario {
	private int id_usu; 
	private String nome;
	private String login; 
	private String email; 
	private String senha; 
	private String imagem; 
	private String cpf; 
	private int id_emocao; 
	private Calendar data_nascimento; 
	private boolean Premium;
	private boolean ativo;
	private String tipoUsuario; 
	
	public int getid_usu() {
		return id_usu;
	}
	public void setid_usu(int id_usu) {
		this.id_usu = id_usu;
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
	public int getid_emocao() {
		return id_emocao;
	}
	public void setid_emocao(int id_emocao) {
		this.id_emocao = id_emocao;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Calendar getdata_nascimento () {
		return data_nascimento ;
	}
	public void setdata_nascimento(Calendar data_nascimento ) {
		this.data_nascimento  = data_nascimento;
	}
	public boolean Premium() {
		return Premium;
	}
	public void setPremium(boolean Premium) {
		this.Premium = Premium;
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
		String saida = id_usu + " " + nome; 
		return saida;
	}
	
	 @Override
	    public int hashCode() {
	        int hash = 7;
	        hash = 89 * hash + Objects.hashCode(this.id_usu);
	        return hash;
	    }
	public String getTipoUsuario() {
		return tipoUsuario;
	}
	public void setTipoUsuario(String tipoUsuario) {
		this.tipoUsuario = tipoUsuario;
	}
}
