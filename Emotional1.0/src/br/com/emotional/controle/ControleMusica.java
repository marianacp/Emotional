package br.com.emotional.controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.emotional.entidade.Emocao;
import br.com.emotional.persistencia.EmocaoDAO;

@WebServlet({"/enviarMusica"})
public class ControleMusica extends HttpServlet{
	protected void service(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		
		String nome = request.getParameter("nome"); 
		String autor = request.getParameter("autor"); 
		String estilo = request.getParameter("estilo"); 
		String emocao = request.getParameter("emocao"); 
		String musica = request.getParameter("musica");
		
		Emocao emo = new Emocao(); 
		emo.setNome(emocao);
		EmocaoDAO ed = new EmocaoDAO(); 
		try {
			emo.setId_emocao(ed.getIdEmocaoByNome(emo));
		} catch (Exception e) {
			out.println("Erro ao buscar identificador de emoção");
		}
		
		
}
}
