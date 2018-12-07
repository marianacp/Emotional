package br.com.emotional.entidade;

/*
 * Classe responsável por criar instância de playlist
 */
public class Musica_Playlist {
	int id_musica_playlist; 
	int id_musica; 
	int id_usu;
	public int getId_musica_playlist() {
		return id_musica_playlist;
	}
	public void setId_musica_playlist(int id_musica_playlist) {
		this.id_musica_playlist = id_musica_playlist;
	}
	public int getId_musica() {
		return id_musica;
	}
	public void setId_musica(int id_musica) {
		this.id_musica = id_musica;
	}
	public int getId_usu() {
		return id_usu;
	}
	public void setId_usu(int id_usu) {
		this.id_usu = id_usu;
	} 
}
