package br.com.emotional.teste;
import org.mockito.Mock; 
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import br.com.emotional.entidade.Musica;
import br.com.emotional.persistencia.MusicaDAO;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert ;
import org.junit.Test;


public class testMock {
/*	
	@Test
	public void teste() throws Exception {
		MusicaDAO teste = Mockito.mock(MusicaDAO.class);		
		Musica musica1 = new Musica();
		
		musica1.setIdMusica(5);		
		musica1.setIdArtista(7);
		musica1.setIdEmocao(2);
		musica1.setArquivoMusica("musicalização");
		musica1.setId_estiloMusical(3);
		
		System.out.println(musica1.getArquivoMusica());
		
		List<Musica> musicas = new ArrayList<Musica>();
		List<Musica> musicas2 = new ArrayList<Musica>();
		
		Musica musica2 = new Musica();
		Musica musica3 = new Musica();
		Musica musica4 = new Musica();
		
		musicas.add(musica1);
		musicas.add(musica2);
		musicas.add(musica3);
		musicas.add(musica4);
		
		imprime(musicas);
		System.out.println("/n 1 /n");
		Mockito.doThrow(new Exception()).when(teste).open();
		Mockito.when(teste.denunciarMusica(anyInt())).thenReturn(true);
		Mockito.when(teste.getListaMusicasAprovadas("busca")).thenReturn(musicas);
		musicas2 = Mockito.doReturn(musicas).when(teste).getListaMusicasAprovadas("busca");
		imprime(teste.getListaMusicasAprovadas("busca"));
		System.out.println("uuuuuuuuuuu");
		imprime(musicas);
	}
	
	public void imprime (List<Musica> lista) {
		for (int i =0; i< lista.size(); i++) {
			System.out.println(lista.get(i).getArquivoMusica());
		}
	
	}*/
}
