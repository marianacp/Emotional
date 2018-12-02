package br.com.emotional.controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.emotional.entidade.Musica;
import util.Erro;


@WebServlet({"/buscarUsuario"})
public class ControleBuscaMusicaNaoAprovadas extends HttpServlet {
	protected void service(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {
		
		Erro erros = new Erro();
		
		List<Musica> musica = new ArrayList<Musica>(); 
		String busca = request.getParameter("search");
	
}
}