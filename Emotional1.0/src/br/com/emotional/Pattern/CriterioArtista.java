package br.com.emotional.Pattern;

import java.util.ArrayList;
import java.util.List;

import br.com.emotional.entidade.Usuario;

public class CriterioArtista implements Criterio{
	// Ir� retornar uma lista de usu�rios que s�o musicos
		@Override 
		public List<Usuario> criterio(List<Usuario> listaUsuario) {
			List<Usuario> listaArtista = new ArrayList<Usuario>(); 
			
			for(Usuario usu : listaArtista) {
				if(usu.getTipoUsuario().equalsIgnoreCase("O")) {
					listaArtista.add(usu); 
				}
			}
			return listaArtista; 
		}
}
