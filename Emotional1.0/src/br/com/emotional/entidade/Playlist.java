package br.com.emotional.entidade;

/*
 * Classe responsável por criar instância de playlist
 */
public class Playlist {
	int id_playlist; 
	String nome_playlist; 
	double tempo_playlist; 
	int id_usu;
	public int getId_playlist() {
		return id_playlist;
	}
	public void setId_playlist(int id_playlist) {
		this.id_playlist = id_playlist;
	}
	public String getNome_playlist() {
		return nome_playlist;
	}
	public void setNome_playlist(String nome_playlist) {
		this.nome_playlist = nome_playlist;
	}
	public double getTempo_playlist() {
		return tempo_playlist;
	}
	public void setTempo_playlist(double tempo_playlist) {
		this.tempo_playlist = tempo_playlist;
	}
	public int getId_usu() {
		return id_usu;
	}
	public void setId_usu(int id_usu) {
		this.id_usu = id_usu;
	} 
	
}
