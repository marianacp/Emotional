package br.com.emotional.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.emotional.entidade.Classifica;
import br.com.emotional.entidade.Emocao;
import br.com.emotional.entidade.Usuario;
import br.com.emotional.persistencia.EmocaoDAO;
import br.com.emotional.persistencia.MusicaDAO;
import util.Erro;


@WebServlet({"/classificarMusica"})
/**
 * Classe para o controle da classificacao das musicas no sistema
 */
public class ControleClassificarMusica extends HttpServlet{
	protected void service(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {
		HttpServletResponse res = (HttpServletResponse) response;
        HttpServletRequest req = (HttpServletRequest) request;
        HttpSession session = req.getSession();
		Erro erros = new Erro();
		int id_musica = Integer.parseInt(request.getParameter("id_musica")); 
        Usuario u = (Usuario) session.getAttribute("usuarioLogado");
        String emocao = request.getParameter("emocao"); 
        
        Emocao emo = new Emocao(); 
		emo.setNome(emocao);
		EmocaoDAO ed = new EmocaoDAO(); 
		try {
			emo.setId_emocao(ed.getIdEmocaoByNome(emo));
		} catch (Exception e) {
			erros.add("Erro ao buscar identificador de emoção");
		}
		
		Classifica classi = new Classifica(); 
		classi.setId_emocao(emo.getId_emocao());
		classi.setId_musica(id_musica);
		classi.setId_usu(u.getid_usu());
		
		MusicaDAO md = new MusicaDAO(); 
		try {
			boolean classificado = md.classificarMusica(classi);
			if(classificado) {
				erros.add("Musica classificada com sucesso!");				
			}
			else {
				erros.add("Musica não pôde ser classificada");
			} 
		} catch (Exception e) {
			erros.add("Musica não pôde ser classificada");
		} 
request.setAttribute("mensagens", erros);
		
		String URL = "ClassificarMusica.jsp";
        RequestDispatcher rd = request.getRequestDispatcher(URL);
        rd.forward(request, response);
}
}