package br.com.emotional.entidade;

/*
 * Classe responsável por criar instância de classifica
 */

public class Classifica {
	private int id_class; 
	private int id_usu; 
	private int id_musica; 
	private int id_emocao;
	public int getId_class() {
		return id_class;
	}
	public void setId_class(int id_class) {
		this.id_class = id_class;
	}
	public int getId_usu() {
		return id_usu;
	}
	public void setId_usu(int id_usu) {
		this.id_usu = id_usu;
	}
	public int getId_musica() {
		return id_musica;
	}
	public void setId_musica(int id_musica) {
		this.id_musica = id_musica;
	}
	public int getId_emocao() {
		return id_emocao;
	}
	public void setId_emocao(int id_emocao) {
		this.id_emocao = id_emocao;
	} 
}
