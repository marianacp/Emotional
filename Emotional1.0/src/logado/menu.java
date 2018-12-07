package logado;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/*
 * Classe responsável por menu de usuário logado
 */

@WebServlet(name = "Menu", urlPatterns = {"/logado/Menu.jsp"})
public class menu extends HttpServlet{
	  protected void processRequest(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {
	        RequestDispatcher rd = request.getRequestDispatcher(
	                "/Menu.jsp");
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
