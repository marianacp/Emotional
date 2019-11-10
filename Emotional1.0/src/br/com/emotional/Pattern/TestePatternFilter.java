package br.com.emotional.Pattern;

import java.util.ArrayList;
import java.util.List;

import br.com.emotional.entidade.Usuario;

public class TestePatternFilter {

	public static void main(String[] args) {
		List<Usuario> listaUsuario = new ArrayList<Usuario>(); 
		Usuario us1 = new Usuario(); 
		us1.setTipoUsuario("M");
		us1.setNome("Vinicius");
		
		Usuario us2 = new Usuario(); 
		us2.setTipoUsuario("O");
		us2.setNome("Anderson");
		
		Usuario us3 = new Usuario(); 
		us3.setTipoUsuario("O");
		us3.setNome("Carlos");
		
		Usuario us4 = new Usuario(); 
		us4.setTipoUsuario("M");
		us4.setNome("Mariana");
		
		listaUsuario.add(us1);
		listaUsuario.add(us2);
		listaUsuario.add(us3);
		listaUsuario.add(us4);
		
		Criterio cliente = new CriterioCliente(); 
		Criterio artista = new CriterioArtista(); 
		
		System.out.println("Artistas: ");
		imprimeLista(artista.criterio(listaUsuario)); 
		
		System.out.println("Clientes: ");
		imprimeLista(cliente.criterio(listaUsuario)); 
		

	}
	
	public static void imprimeLista(List<Usuario> listaUsuario) {
		for (Usuario us : listaUsuario) {
			
			System.out.println("Nome: " + us.getNome());
		}
		
	}

}
