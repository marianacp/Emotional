package br.com.emotional.Pattern;

import br.com.emotional.entidade.Musica;

public class OrdenadorPorNome extends OrdernadorTemplate{
	 @Override
	    public boolean isPrimeiro(Musica musica1, Musica musica2) {
	        if (musica1.getTituloMusica().compareToIgnoreCase(musica2.getTituloMusica()) <= 0) {
	            return true;
	        }
	        return false;
	    }
}
