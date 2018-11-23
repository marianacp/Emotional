package br.com.emotional.controle;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.emotional.entidade.Musica;
import br.com.emotional.persistencia.MusicaDAO;
import util.Erro;

@WebServlet({"/buscarMusica"})
public class ControleBuscaMusica extends HttpServlet{
	protected void service(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {
		Erro erros = new Erro();
		List<Musica> musica = new ArrayList<Musica>(); 
		String busca = request.getParameter("search"); 
		
		MusicaDAO md = new MusicaDAO(); 
		try {
			 musica = md.getListaMusicasAprovadas(busca);
		} catch (Exception e) {
			erros.add("Erro ao buscar músicas");		
		} 
		
		request.setAttribute("mensagens", erros);
        request.setAttribute("musicas", musica);
        String URL = "PlayMusica.jsp";
        RequestDispatcher rd = request.getRequestDispatcher(URL);
        rd.forward(request, response);
}
}

