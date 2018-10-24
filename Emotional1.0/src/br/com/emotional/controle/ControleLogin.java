package br.com.emotional.controle;

import br.com.emotional.persistencia.LoginDAO;
import util.Erro;
import br.com.emotional.entidade.Usuario;
//import util.Erro;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
  

@WebServlet(name = "Login", urlPatterns = {"/index.jsp", "/logout.jsp"})
public class ControleLogin extends HttpServlet {
	protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Erro erros = new Erro();
        if (request.getParameter("bOK") != null) {
            String login = request.getParameter("email");
            String senha = request.getParameter("senha");
            if (login == null || login.isEmpty()) {
                erros.add("Login não informado!");
            }
            if (senha == null || senha.isEmpty()) {
                erros.add("Senha não informada!");
            }
            if (!erros.isExisteErros()) {
                LoginDAO dao = new LoginDAO();
                Usuario user = new Usuario();
				try {
					user = dao.getSingle(login);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
                if (user != null) {
                    if (user.getSenha().equalsIgnoreCase(senha)) {
                        request.getSession().setAttribute("usuarioLogado", user);
                        response.sendRedirect("Menu.jsp");
                        return;
                    } else {
                        erros.add("Senha inválida!");
                    }
                } else {
                    erros.add("Usuário não encontrado!");
                }
            }
  
        }
        request.getSession().invalidate();
        
        request.setAttribute("mensagens", erros);
        
        String URL = "Login.jsp";
        RequestDispatcher rd = request.getRequestDispatcher(URL);
        rd.forward(request, response);
	}
	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }
  
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
