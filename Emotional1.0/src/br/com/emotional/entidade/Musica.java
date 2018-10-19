package br.com.emotional.entidade;

import com.mysql.cj.jdbc.Blob;

public class Musica {

	private int mus_id; 
	private String titulo; 
	private int emo_id; 
	private String autor; 
	private Blob musica;
	public int getMus_id() {
		return mus_id;
	}
	public void setMus_id(int mus_id) {
		this.mus_id = mus_id;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public int getEmo_id() {
		return emo_id;
	}
	public void setEmo_id(int emo_id) {
		this.emo_id = emo_id;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public Blob getMusica() {
		return musica;
	}
	public void setMusica(Blob musica) {
		this.musica = musica;
	} 
}
