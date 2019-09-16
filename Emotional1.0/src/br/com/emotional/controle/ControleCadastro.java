package br.com.emotional.controle;


import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.*; 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.media.jfxmedia.logging.Logger;

import br.com.emotional.entidade.Usuario;
import br.com.emotional.persistencia.UsuarioDAO;
import util.Erro;

@WebServlet({"/cadastroUsuario"})
/**
 * Classe para o controle de cadastro de usuario no sistema
 */
public class ControleCadastro extends HttpServlet{
	protected void service(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {
		Erro erro = new Erro(); 
	String nome = request.getParameter("nome"); 
	String login = request.getParameter("username");
	String email = request.getParameter("email");
	String senha = request.getParameter("senha");
	String dataEmTexto = request.getParameter("dataNascimento");
	String cpf = request.getParameter("cpf");
	String imagem = request.getParameter("imagem");
	String tipoUsuario = request.getParameter("tipoUsuario");
	Calendar dataNascimento = null;

    // fazendo a conversão da data
    try {
        Date date =
                new SimpleDateFormat("dd/mm/yyyy")
                .parse(dataEmTexto);
        dataNascimento = Calendar.getInstance();
        dataNascimento.setTime(date);
    } catch (ParseException e) {
        erro.add("Erro de conversão da data");
    }
	
	Usuario usuario = new Usuario(); 
	
	usuario.setNome(nome);
	usuario.setLogin(login);
	usuario.setCpf(cpf);
	usuario.setEmail(email);
	usuario.setSenha(senha);
	usuario.setImagem(imagem);
	usuario.setDataNascimento(dataNascimento); 
	//Aqui ele verifica se o usuário é artista, caso seja, recebe M de músico, se não, O de ouvinte
	if(tipoUsuario.equals("artista")) {
		usuario.setTipoUsuario("M");
	}
	else {
		usuario.setTipoUsuario("O");
	}
	
	UsuarioDAO usuariodao = new UsuarioDAO();
	try {
		usuariodao.salvarUsuario(usuario);
		erro.add("Cadastro " + usuario.getNome() +
	            " efetuado com sucesso");
	} catch (Exception e) {
		Logger.logMsg(1, "Cadastro nao efetuado");
		//LOGGER.log("context", e);
		erro.add("Cadastro não Efetuado!"); 
	}
	
	
	request.setAttribute("mensagens", erro);
	  String url = "Cadastro.jsp";
      RequestDispatcher rd = request.getRequestDispatcher(url);
      rd.forward(request, response);
	}
	

}
