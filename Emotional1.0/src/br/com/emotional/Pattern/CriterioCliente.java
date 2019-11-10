package br.com.emotional.Pattern;

import java.util.ArrayList;
import java.util.List;

import br.com.emotional.entidade.Usuario;

public class CriterioCliente implements Criterio {
	// Irá retornar uma lista de usuários que são ouvintes
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
