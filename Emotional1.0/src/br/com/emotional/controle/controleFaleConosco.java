package br.com.emotional.controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.emotional.entidade.FaleConosco;
import br.com.emotional.persistencia.FaleConoscoDAO;

@WebServlet({"/faleConosco"})
/**
 * Classe para o controle do Fale Conosco
 */
public class controleFaleConosco extends HttpServlet{
	protected void service(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {
		
		PrintWriter out = response.getWriter();
		
		String nome = request.getParameter("nome"); 
		String email = request.getParameter("email"); 
		String duvida = request.getParameter("duvida"); 
		
		FaleConosco fc = new FaleConosco(); 
		
		fc.setNome(nome);
		fc.setEmail(email);
		fc.setPergunta(duvida);
		
		FaleConoscoDAO fd = new FaleConoscoDAO(); 
		try {
			fd.salvarDuvida(fc);
			out.println( fc.getNome() +
		            ", sua duvida foi enviada com sucesso!");
		} catch (Exception e) {
			//e.printStackTrace();
			request.setAttribute("msg", 
			        "Duvida não Registrada!"); 
		}

	}
}
