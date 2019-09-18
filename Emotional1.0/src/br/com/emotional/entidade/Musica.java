package br.com.emotional.entidade;

/*
 * Classe responsável por criar instância de musica
 */
public class Musica {

	private int idMusica; 
	private String tituloMusica; 
	private int idEmocao; 
	private int idArtista; 
	private String arquivoMusica;
	private int idEstiloMusical;
	
	public int getIdMusica() {
		return idMusica;
	}
	public void setIdMusica(int idMusica) {
		this.idMusica = idMusica;
	}
	public String getTituloMusica() {
		return tituloMusica;
	}
	public void setTituloMusica(String tituloMusica) {
		this.tituloMusica = tituloMusica;
	}
	public int getIdEmocao() {
		return idEmocao;
	}
	public void setIdEmocao(int idEmocao) {
		this.idEmocao = idEmocao;
	}
	public int getIdArtista() {
		return idArtista;
	}
	public void setIdArtista(int idArtista) {
		this.idArtista = idArtista;
	}
	public String getArquivoMusica() {
		return arquivoMusica;
	}
	public void setArquivoMusica(String arquivoMusica) {
		this.arquivoMusica = arquivoMusica;
	}
	public int getId_estiloMusical() {
		return idEstiloMusical;
	}
	public void setId_estiloMusical(int idEstiloMusical) {
		this.idEstiloMusical = idEstiloMusical;
	} 
}
