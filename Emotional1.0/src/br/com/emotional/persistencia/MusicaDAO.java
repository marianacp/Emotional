package br.com.emotional.persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.emotional.entidade.Classifica;
import br.com.emotional.entidade.Musica;

public class MusicaDAO  extends Dao{
	public void salvarMusica(Musica musica) throws Exception {
		
		open(); 
		
		String sql = "INSERT INTO musica (arquivo_musica, titulo_musica, id_emocao, id_estilo_musical, id_artista)" +
				 " VALUES(?, ?, ?, ?, ?)";
		
		PreparedStatement pstm = null;

		try {
			pstm = con.prepareStatement(sql);
			
			String caminho = musica.getArquivo_musica(); 
			//File file = new File(caminho + musica.getArquivo_musica()); 
			//FileInputStream fis = new FileInputStream(file); 
			//pstm.setBinaryStream(1, fis);
			pstm.setString(1, caminho);
			pstm.setString(2, musica.getTitulo_musica());
			pstm.setInt(3, musica.getId_emocao());
			pstm.setInt(4, musica.getId_estilo_musical());
			pstm.setInt(5, musica.getId_artista());

			
			pstm.execute(); 
		}
		catch(SQLException e) {
			 e.printStackTrace();			
		}

	}
	public List<Musica> getListaMusicasAprovadas(String busca) throws Exception {
		
		open(); 
		//Status 1 eh aprovado, 0 reprovado
		String sql = "Select mu.id_musica , arquivo_musica, titulo_musica from musica mu "
				+ "join aprovacao_musica am on am.id_musica = mu.id_musica where UPPER(titulo_musica) like ? "
				+ "and am.cod_status = 1";
		
		PreparedStatement pstm = null;
	
		List<Musica> lista = new ArrayList<>(); 
		try {
			pstm = con.prepareStatement(sql);
			
			pstm.setString(1, "%" + busca.toUpperCase() + "%");
			
			ResultSet rs = pstm.executeQuery(); 
			

			while(rs.next()) {
				Musica musica = new Musica(); 
				musica.setId_musica(rs.getInt("id_musica"));
				musica.setArquivo_musica(rs.getString("arquivo_musica"));
				musica.setTitulo_musica(rs.getString("titulo_musica"));
				lista.add(musica); 
			}			
			return lista; 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista; 
	}
	
	public boolean denunciarMusica(int id_musica) throws Exception{
		open(); 
		
		String sql = "update aprovacao_musica set cod_status = 0 where id_musica = ?"; 
		
		boolean denunciado = false; 
		
		PreparedStatement pstm = null;
		
		try {
			pstm = con.prepareStatement(sql);
			
			pstm.setInt(1, id_musica);
			
			pstm.executeUpdate(); 
			
			denunciado = true; 
			return denunciado; 
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return denunciado; 
	}
	
	public boolean classificarMusica(Classifica classi) throws Exception{
		
		open(); 
		
		String sql = "Insert into classifica(id_usu, id_musica, id_emocao) values(?, ?, ?)"; 
		
		PreparedStatement pstm = null;
		boolean classificado = false; 

		try {
			pstm = con.prepareStatement(sql);
			
			pstm.setInt(1, classi.getId_usu());
			pstm.setInt(2, classi.getId_musica());
			pstm.setInt(3, classi.getId_emocao());

			
			pstm.execute(); 
			
			return classificado = true; 
		}
		catch(Exception e) {
			 e.printStackTrace();			
		}
		return classificado; 
	}
	
public List<Musica> getListaMusicasNaoAprovadas(String busca) throws Exception {

		open(); 
	 
		//Status 1 eh aprovado, 0 reprovado
		String sql = "Select mu.id_musica , arquivo_musica, titulo_musica from musica mu "
				+ "join aprovacao_musica am on am.id_musica = mu.id_musica where am.cod_status = 0 ";

		if(!busca.isEmpty()) {
			sql +=  "AND UPPER(mu.titulo_musica) like ? "; 
		}
		
		PreparedStatement pstm = null;
	
		List<Musica> lista = new ArrayList<>(); 
		try {
			pstm = con.prepareStatement(sql);
			
			pstm.setString(1, "%" + busca.toUpperCase() + "%");
			
			ResultSet rs = pstm.executeQuery(); 
			

			while(rs.next()) {
				Musica musica = new Musica(); 
				musica.setId_musica(rs.getInt("id_musica"));
				musica.setArquivo_musica(rs.getString("arquivo_musica"));
				musica.setTitulo_musica(rs.getString("titulo_musica"));
				lista.add(musica); 
			}			
			return lista; 
		} catch (Exception e) {
			e.printStackTrace();
		}
		return lista; 
	}

public int getIdporNomeArtista(Musica mus) throws Exception{
	open(); 
	
	String sql = "SELECT ID_MUSICA FROM MUSICA WHERE TITULO_MUSICA = ? AND ID_ARTISTA = ?";
	PreparedStatement pstm = null;
	int id_mus = 0; 
	
	try {
		
		pstm = con.prepareStatement(sql);

		pstm.setString(1, mus.getTitulo_musica());
		pstm.setInt(2, mus.getId_artista()); 
		
	
		
		ResultSet rs = pstm.executeQuery(); 

		if (rs.next()) {
			id_mus = rs.getInt("ID_MUSICA"); 
		}
		
		return id_mus; 
	} catch (Exception e) {
		e.printStackTrace();
	}
 return id_mus; 
}

public void requererAprovacao(int id_musica) throws Exception{
	open(); 
	
	String sql = "INSERT INTO APROVACAO_MUSICA(ID_MUSICA, COD_STATUS) VALUES(?, 0)"; 
	
	PreparedStatement pstm = null;

	try {
		pstm = con.prepareStatement(sql);
		
		pstm.setInt(1, id_musica);
		
		pstm.execute(); 
		
	} catch (Exception e) {
		e.printStackTrace();	
		}
	
}

public void excluirMusica(int musica_id) throws Exception {
	open(); 
	
	String sql = "DELETE FROM APROVACAO_MUSICA WHERE ID_MUSICA = ? ";
	String sql2 = "DELETE FROM MUSICA WHERE ID_MUSICA = ?"; 
	
	PreparedStatement pstm = null;
	
	try {
		pstm = con.prepareStatement(sql);
		
		pstm.setInt(1, musica_id);
		pstm.execute();
		
		pstm = con.prepareStatement(sql2);
		pstm.setInt(1, musica_id);
		
		pstm.execute();
		
	} catch (Exception e) {
		e.printStackTrace();	
	}
}
}
