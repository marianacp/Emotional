package br.com.emotional.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.emotional.persistencia.MusicaDAO;
import util.Erro;

@WebServlet({"/excluirMusica"})
/**
 * Classe para o controle de musicas que podem ser excluidas do sistema
 */
public class ControleExcluirMusica extends HttpServlet{
	protected void service(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {

		Erro erros = new Erro();
		
		int idMusica = Integer.parseInt(request.getParameter("id_musica"));

		MusicaDAO md = new MusicaDAO(); 
		
		try {
			md.excluirMusica(idMusica);
			erros.add("Musica excluída com sucesso");

		} catch (Exception e) {
			erros.add("Musica nao pode ser excluída");
		}
		
		request.setAttribute("mensagens", erros);
        String url = "AprovacaoMusica.jsp";
        RequestDispatcher rd = request.getRequestDispatcher(url);
        rd.forward(request, response);
}
}