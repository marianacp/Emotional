package br.com.emotional.entidade;

import java.io.FileInputStream;
import java.util.Date;

public class Usuario {
	private int us_id; 
	private String nome; 
	private String email; 
	private String senha; 
	private FileInputStream imagem; 
	
	private int emo_id; 
	private Date data_nasc; 
	private boolean isPremium;
	private boolean ativo;
	public int getUs_id() {
		return us_id;
	}
	public void setUs_id(int us_id) {
		this.us_id = us_id;
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
	public FileInputStream getImagem() {
		return imagem;
	}
	public void setImagem(FileInputStream imagem) {
		this.imagem = imagem;
	}
	public int getEmo_id() {
		return emo_id;
	}
	public void setEmo_id(int emo_id) {
		this.emo_id = emo_id;
	}
	public Date getData_nasc() {
		return data_nasc;
	}
	public void setData_nasc(Date data_nasc) {
		this.data_nasc = data_nasc;
	}
	public boolean isPremium() {
		return isPremium;
	}
	public void setPremium(boolean isPremium) {
		this.isPremium = isPremium;
	}
	public boolean isAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	
}
