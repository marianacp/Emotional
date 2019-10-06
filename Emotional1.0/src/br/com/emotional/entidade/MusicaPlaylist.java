package br.com.emotional.entidade;

/*
 * Classe responsável por criar instância de playlist
 */
public class MusicaPlaylist {
	int idMusicaPlaylist; 
	int idMusica; 
	int idUsu;
	
	public int getIdMusicaPlaylist() {
		return idMusicaPlaylist;
	}
	public void setIdMusicaPlaylist(int idMusicaPlaylist) {
		this.idMusicaPlaylist = idMusicaPlaylist;
	}
	public int getId_musica() {
		return idMusica;
	}
	public void setIdMusica(int idMusica) {
		this.idMusica = idMusica;
	}
	public int getIdUsu() {
		return idUsu;
	}
	public void setIdUsu(int idUsu) {
		this.idUsu = idUsu;
	} 
}
