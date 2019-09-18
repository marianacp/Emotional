package br.com.emotional.entidade;

/*
 * Classe responsável por criar instância de playlist
 */
public class Playlist {
	int idPlaylist; 
	String nomePlaylist; 
	double tempoPlaylist; 
	int idUsu;
	
	public int getIdPlaylist() {
		return idPlaylist;
	}
	public void setIdPlaylist(int idPlaylist) {
		this.idPlaylist = idPlaylist;
	}
	public String getNomePlaylist() {
		return nomePlaylist;
	}
	public void setNomePlaylist(String nomePlaylist) {
		this.nomePlaylist = nomePlaylist;
	}
	public double getTempoPlaylist() {
		return tempoPlaylist;
	}
	public void setTempoPlaylist(double tempoPlaylist) {
		this.tempoPlaylist = tempoPlaylist;
	}
	public int getIdUsu() {
		return idUsu;
	}
	public void setIdUsu(int idUsu) {
		this.idUsu = idUsu;
	} 
	
}
