package br.com.emotional.Pattern;

import java.util.List;

import br.com.emotional.entidade.Usuario;
//M�todo Filter - Structural Pattern
public interface Criterio {
	public List<Usuario> criterio(List<Usuario> listaUsuario); 
}
