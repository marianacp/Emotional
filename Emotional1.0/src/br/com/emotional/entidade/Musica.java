package br.com.emotional.entidade;

import com.mysql.cj.jdbc.Blob;

/*
 * Classe responsável por criar instância de musica
 */
public class Musica {

	private int id_musica; 
	private String titulo_musica; 
	private int id_emocao; 
	private int id_artista; 
	private String arquivo_musica;
	private int id_estilo_musical;
	public int getId_musica() {
		return id_musica;
	}
	public void setId_musica(int id_musica) {
		this.id_musica = id_musica;
	}
	public String getTitulo_musica() {
		return titulo_musica;
	}
	public void setTitulo_musica(String titulo_musica) {
		this.titulo_musica = titulo_musica;
	}
	public int getId_emocao() {
		return id_emocao;
	}
	public void setId_emocao(int id_emocao) {
		this.id_emocao = id_emocao;
	}
	public int getId_artista() {
		return id_artista;
	}
	public void setId_artista(int id_artista) {
		this.id_artista = id_artista;
	}
	public String getArquivo_musica() {
		return arquivo_musica;
	}
	public void setArquivo_musica(String arquivo_musica) {
		this.arquivo_musica = arquivo_musica;
	}
	public int getId_estilo_musical() {
		return id_estilo_musical;
	}
	public void setId_estilo_musical(int id_estilo_musical) {
		this.id_estilo_musical = id_estilo_musical;
	} 
}
