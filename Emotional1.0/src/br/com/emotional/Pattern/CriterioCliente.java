package br.com.emotional.Pattern;

import java.util.ArrayList;
import java.util.List;

import br.com.emotional.entidade.Usuario;

public class CriterioCliente implements Criterio {
	// Ir� retornar uma lista de usu�rios que s�o ouvintes
	@Override 
	public List<Usuario> criterio(List<Usuario> listaUsuario) {
		List<Usuario> listaCliente = new ArrayList<Usuario>(); 
		
		for(Usuario usu : listaCliente) {
			if(usu.getTipoUsuario().equalsIgnoreCase("O")) {
				listaCliente.add(usu); 
			}
		}
		return listaCliente; 
	}
} 
