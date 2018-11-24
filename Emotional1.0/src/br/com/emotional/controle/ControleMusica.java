package br.com.emotional.controle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import br.com.emotional.entidade.Emocao;
import br.com.emotional.entidade.EstiloMusical;
import br.com.emotional.entidade.Musica;
import br.com.emotional.entidade.Usuario;
import br.com.emotional.persistencia.ArtistaDAO;
import br.com.emotional.persistencia.EmocaoDAO;
import br.com.emotional.persistencia.EstiloMusicalDAO;
import br.com.emotional.persistencia.MusicaDAO;
import util.Erro;

@WebServlet({"/enviarMusica"})
public class ControleMusica extends HttpServlet{
	protected void service(HttpServletRequest request,
            HttpServletResponse response)
            throws IOException, ServletException {
		
		Erro erros = new Erro();
		int id_artista = 0; 
		
		HttpServletResponse res = (HttpServletResponse) response;
        HttpServletRequest req = (HttpServletRequest) request;
        HttpSession session = req.getSession();
        
        Usuario u = (Usuario) session.getAttribute("usuarioLogado");
        
        if(u.getTipoUsuario().equals("O")) {
        	erros.add("Você não tem permissão para enviar música");
        	request.setAttribute("mensagens", erros);
            
            String URL = "EnviarMusica.jsp";
            RequestDispatcher rd = request.getRequestDispatcher(URL);
            rd.forward(request, response);
        }
        
		String nome = request.getParameter("nome"); 
		//String autor = request.getParameter("autor"); 
		String estilo = request.getParameter("estilo"); 
		String emocao = request.getParameter("emocao"); 
		String musica = request.getParameter("musica");
		int usuario_id = u.getid_usu(); 
		
		Emocao emo = new Emocao(); 
		emo.setNome(emocao);
		EmocaoDAO ed = new EmocaoDAO(); 
		try {
			emo.setId_emocao(ed.getIdEmocaoByNome(emo));
		} catch (Exception e) {
			erros.add("Erro ao buscar identificador de emoção");
		}
		
		EstiloMusical esti = new EstiloMusical(); 
		esti.setNome_estilo_musical(estilo);
		EstiloMusicalDAO em = new EstiloMusicalDAO(); 
		try {
			esti.setId_estilo_musical(em.getIdEstiloByNome(esti));
		} catch (Exception e) {
			erros.add("Erro ao buscar identificador do estilo musical");

		}
		
		ArtistaDAO ad = new ArtistaDAO(); 
		try {
			id_artista = ad.getIdArtistabyUsu(u.getid_usu());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			erros.add("Erro ao buscar identificador do artista");
		} 
		
		Musica musc = new Musica(); 
		musc.setArquivo_musica(musica);
		musc.setId_artista(id_artista);
		musc.setId_emocao(emo.getId_emocao());
		musc.setId_estilo_musical(esti.getId_estilo_musical());
		musc.setTitulo_musica(nome);
		
		MusicaDAO musicadao = new MusicaDAO(); 
		try {
			musicadao.salvarMusica(musc);
			erros.add("Música adicionada com sucesso!");
		} catch (Exception e) {
			erros.add("Música não pôde ser salva");
		}
		
		request.setAttribute("mensagens", erros);
        
        String URL = "EnviarMusica.jsp";
        RequestDispatcher rd = request.getRequestDispatcher(URL);
        rd.forward(request, response);
}
}
