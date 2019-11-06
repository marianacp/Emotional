package br.com.emotional.entidade;

public class MusicaDirector {
	protected MusicaBuilder mus; 
	
	public MusicaDirector(MusicaBuilder mus) {
		this.mus = mus; 		
	}
	
	public void construirCarro() {
		mus.buildArquivoMusica();
		mus.buildidArtista();
		mus.buildidEmocao();
		mus.buildidEstiloMusical();
		mus.buildidMusica();
		mus.buildTituloMusica();		
	}
	
	public Musica getMusica() {
		return mus.getMusica(); 
	}
	
}
