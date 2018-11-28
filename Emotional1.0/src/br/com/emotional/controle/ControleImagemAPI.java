package br.com.emotional.controle;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.emotional.API.APIFace;
import util.Erro;

@WebServlet({"/detectarEmocao"})
public class ControleImagemAPI extends HttpServlet {
	protected void service(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {
	Erro erro = new Erro(); 	
	String URL;
	String nome = request.getParameter("nome"); 	
	String imagem = request.getParameter("imagem");
	
	APIFace apif = new APIFace();
	apif.insereImagem(imagem);
	String sentimento	= apif.detectar();
	
	
	if (!sentimento.isEmpty()) {
		 URL = "GerarPlaylist.jsp";
		 request.setAttribute("sentimento", sentimento);
	}
	else {
		erro.add("Não foi possível reconhecer o humor. Tente novamente!");
		 URL = "DetectarEmocao.jsp";
	}
	
	  request.setAttribute("mensagens", erro);
      RequestDispatcher rd = request.getRequestDispatcher(URL);
      rd.forward(request, response);
	}
}
