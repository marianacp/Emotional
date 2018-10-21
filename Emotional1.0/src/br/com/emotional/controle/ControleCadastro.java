package br.com.emotional.controle;


import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.emotional.entidade.Usuario;
import br.com.emotional.persistencia.UsuarioDAO;

@WebServlet({"/cadastroUsuario"})
public class ControleCadastro extends HttpServlet{
	protected void service(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		
	String nome = request.getParameter("nome"); 
	String apelido = request.getParameter("apelido");
	String email = request.getParameter("email");
	String senha = request.getParameter("senha");
	String dataEmTexto = request.getParameter("dataNascimento");
	String imagem = request.getParameter("imagem"); 
	Calendar dataNascimento = null;

    // fazendo a conversão da data
    try {
        Date date =
                new SimpleDateFormat("dd/MM/yyyy")
                .parse(dataEmTexto);
        dataNascimento = Calendar.getInstance();
        dataNascimento.setTime(date);
    } catch (ParseException e) {
        out.println("Erro de conversão da data");
        return; //para a execução do método
    }
	
	Usuario usuario = new Usuario(); 
	
	usuario.setNome(nome);
	usuario.setApelido(apelido);
	usuario.setEmail(email);
	usuario.setSenha(senha);
	usuario.setImagem(imagem);
	usuario.setData_nasc(dataNascimento); 
	
	UsuarioDAO usuariodao = new UsuarioDAO();
	try {
		usuariodao.salvarUsuario(usuario);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		return; 
	}
	
	out.println("Contato " + usuario.getNome() +
            " adicionado com sucesso");
	}
}
