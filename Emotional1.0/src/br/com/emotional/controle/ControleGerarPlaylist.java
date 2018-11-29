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
import javax.servlet.http.HttpSession;

import br.com.emotional.entidade.Emocao;
import br.com.emotional.entidade.Musica;
import br.com.emotional.entidade.Usuario;
import br.com.emotional.persistencia.EmocaoDAO;
import br.com.emotional.persistencia.PlaylistDAO;
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
        String nome = request.getParameter("nomePlaylist"); 

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

        //Insere na tabela Playlist a nova playlist, mas antes verifica se o usuário já tem playlist criada
        PlaylistDAO pd = new PlaylistDAO(); 
        boolean inserido = false; 
        
        //Agora, vai trazer as playlists criadas e pertencentes ao usuário.
        List<Integer> lst = new ArrayList<>(); 
        try {
			lst = pd.buscaPlaylistDiariaporUs(u.getid_usu());
		} catch (Exception e) {
			erros.add("Playlist nao pode ser recuperada");
		} 
        
        if (lst.size() > 0 && u.Premium() == false) {
        	erros.add("Usuário estourou limite de playlist do dia.");
        	String URL = "GerarPlaylist.jsp";
        	
        	request.setAttribute("mensagens", erros);
            RequestDispatcher rd = request.getRequestDispatcher(URL);
            rd.forward(request, response);
		}
        
        if (!erros.isExisteErros()) {
			
		
        try {
			inserido = pd.inserirPlaylist(nome, u.getid_usu());
		} catch (Exception e) {
			erros.add("Playlist nao inserida");
		} 
        if (!inserido) {
        	request.setAttribute("mensagens", erros);
        	
            String URL = "GerarPlaylist.jsp";
            RequestDispatcher rd = request.getRequestDispatcher(URL);
            rd.forward(request, response);
		}
       
        else {
        	
        	List<Musica> listaMusicas = new ArrayList<>(); 
        	try {
				listaMusicas = pd.gerarPlaylist(emo.getId_emocao());
			} catch (Exception e) {
				erros.add("Erro ao gerar playlist");
			}
        	
        	if (listaMusicas.size() == 12) {
				
        		request.setAttribute("musicas", listaMusicas);
            	
                String URL = "Playlist24H.jsp";
                RequestDispatcher rd = request.getRequestDispatcher(URL);
                rd.forward(request, response);
        		
			}
        	else {
        		erros.add("A lista não retornou as 12 musicas esperadas");
        		request.setAttribute("mensagens", erros);
            	
                String URL = "GerarPlaylist.jsp";
                RequestDispatcher rd = request.getRequestDispatcher(URL);
                rd.forward(request, response);
        	}
        }
        }
}
}