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
import br.com.emotional.entidade.Usuario;
import br.com.emotional.persistencia.UsuarioDAO;
import util.Erro;


@WebServlet({"/buscarUsuario"})
/**
 * Classe para o controle de busca de usuarios no sistema
 */
public class controleBuscaUsuario  extends HttpServlet{
	protected void service(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {
		
		Erro erros = new Erro();
		List<Usuario> usuario = new ArrayList<Usuario>(); 
		String busca = request.getParameter("search"); 
		
		UsuarioDAO ud = new UsuarioDAO(); 
		try {
			 usuario = ud.getListaBuscaUsuario(busca);
		} catch (Exception e) {
			erros.add("Erro ao buscar usuários");		
		} 
		request.setAttribute("mensagens", erros);
        request.setAttribute("usuarios", usuario);
        
        String URL = "HomeAdm.jsp";
        RequestDispatcher rd = request.getRequestDispatcher(URL);
        rd.forward(request, response);
	}
	}


