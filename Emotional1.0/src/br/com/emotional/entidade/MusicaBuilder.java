package br.com.emotional.entidade;

public abstract class MusicaBuilder {

	protected Musica musica;
	
	public MusicaBuilder() {
		musica = new Musica(); 
	}
	
	public abstract void buildidMusica(); 
	
	public abstract void buildTituloMusica(); 

	public abstract void buildidEmocao(); 

	public abstract void buildidArtista(); 

	public abstract void buildArquivoMusica(); 

	public abstract void buildidEstiloMusical(); 
	
	public Musica getMusica() {
		return musica; 
	}

}
