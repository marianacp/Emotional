package br.com.emotional.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.emotional.entidade.Emocao;
import br.com.emotional.entidade.Usuario;
import br.com.emotional.persistencia.EmocaoDAO;
import br.com.emotional.persistencia.PlaylistDAO;
import util.Erro;

@WebServlet({"/enviarFeedback"})
public class controleEnviarFeedback extends HttpServlet {
	protected void service(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException{
		
Erro erros = new Erro();
 
		
		HttpServletResponse res = (HttpServletResponse) response;
        HttpServletRequest req = (HttpServletRequest) request;
        HttpSession session = req.getSession();
        
        Usuario u = (Usuario) session.getAttribute("usuarioLogado");
		String emocao = request.getParameter("emocao"); 
		String nome = request.getParameter("nome"); 

		
		Emocao emo = new Emocao(); 
		emo.setNome(emocao);
		EmocaoDAO ed = new EmocaoDAO(); 
		try {
			emo.setId_emocao(ed.getIdEmocaoByNome(emo));
		} catch (Exception e) {
			erros.add("Erro ao buscar identificador de emoção");
		}
		
		PlaylistDAO pd = new PlaylistDAO(); 
		
		try {
			pd.salvarEmocaoPlaylist(nome, u.getidUsu(), emo.getId_emocao()); 
				
			erros.add("Feedback enviado com sucesso!");	
			
		} catch (Exception e) {
			erros.add("Nao foi possivel salvar emocao");
		}
		
		request.setAttribute("mensagens", erros);

		
		 String url = "Playlist24H.jsp";
	        RequestDispatcher rd = request.getRequestDispatcher(url);
	        rd.forward(request, response);

}
}
