package br.com.emotional.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.emotional.entidade.Musica;
import br.com.emotional.persistencia.MusicaDAO;
import util.Erro;

@WebServlet({"/denunciarMusica"})
/**
 * Classe para o controle de denuncias de musicas no sistema
 */
public class ControleDenunciaMusica extends HttpServlet{
	protected void service(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException  {
		
		Erro erros = new Erro();
		int id_musica = Integer.parseInt(request.getParameter("id_musica")); 
		
		MusicaDAO md = new MusicaDAO(); 
		try {
			boolean denunciada = md.denunciarMusica(id_musica);
			if(denunciada) {
				erros.add("Denúncia realizada com sucesso!");
			}
			else {
				erros.add("Música não pôde ser denunciada");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			erros.add("Musica não pôde ser denunciada");
		} 
		
request.setAttribute("mensagens", erros);
		
		String URL = "DenunciarMusica.jsp";
        RequestDispatcher rd = request.getRequestDispatcher(URL);
        rd.forward(request, response);
}
}