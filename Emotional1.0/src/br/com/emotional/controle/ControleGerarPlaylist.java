package br.com.emotional.controle;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.emotional.entidade.Emocao;
import br.com.emotional.entidade.Usuario;
import br.com.emotional.persistencia.EmocaoDAO;
import br.com.emotional.persistencia.UsuarioDAO;
import util.Erro;


@WebServlet({"/gerarPlaylist"})
public class ControleGerarPlaylist extends HttpServlet {
	protected void service(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException{
		
		Erro erros = new Erro();
 
		
		HttpServletResponse res = (HttpServletResponse) response;
        HttpServletRequest req = (HttpServletRequest) request;
        HttpSession session = req.getSession();
        
        Usuario u = (Usuario) session.getAttribute("usuarioLogado");
        String emocao = request.getParameter("sentimento"); 
        
        //Ele busca o id da emocao detectada
        Emocao emo = new Emocao(); 
        emo.setNome(emocao);
        EmocaoDAO ed = new EmocaoDAO(); 
        try {
			emo.setId_emocao(ed.getIdEmocaoByNome(emo));
		} catch (Exception e) {
			erros.add("Nao foi possivel identificar a emocao");
		} 
        
        //Ele muda a emocao do usuario para a última emocao detectada
        UsuarioDAO ud = new UsuarioDAO(); 
        try {
			ud.alteraEmocaoUsuario(u.getid_usu(), emo.getId_emocao());
		} catch (Exception e) {
			erros.add("Nao foi possivel alterar emocao do usuario");
		}

        //Insere na tabela Playlist a nova playlist
        
}
}