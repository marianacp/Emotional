package br.com.emotional.controle;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.emotional.entidade.Usuario;
import br.com.emotional.persistencia.UsuarioDAO;
import util.Erro;

@WebServlet({"/bloquearUsuario"})
/**
 * Classe para o controle de bloqueio e desbloqueio do usuario no sistema
 */
public class ControleBloqueioUsuario extends HttpServlet{
	protected void service(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException{
		Erro erros = new Erro();
		int id_usuario = Integer.parseInt(request.getParameter("id_usu"));
		
		Usuario us = new Usuario(); 
		UsuarioDAO ud = new UsuarioDAO(); 
		us.setid_usu(id_usuario);
		
		try {
			us.setAtivo(ud.estaAtivoporId(us.getid_usu())); 
		} catch (Exception e1) {
			erros.add("Nao é possivel verificar se usuario esta ativo");
		} 
		
		try {
			ud.bloquearDesbloquearUsuario(us);
			erros.add("Usuário bloqueado/desbloqueado com sucesso!");
		} catch (Exception e) {
			erros.add("Usuário não pôde ser bloqueado/desbloqueado");
		}
		
		request.setAttribute("mensagens", erros);
		
		String URL = "HomeAdm.jsp";
        RequestDispatcher rd = request.getRequestDispatcher(URL);
        rd.forward(request, response);
		
}
}