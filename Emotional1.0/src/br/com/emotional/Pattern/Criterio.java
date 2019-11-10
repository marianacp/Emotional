package br.com.emotional.Pattern;

import java.util.List;

import br.com.emotional.entidade.Usuario;
//Método Filter - Structural Pattern
public interface Criterio {
	public List<Usuario> criterio(List<Usuario> listaUsuario); 
}
