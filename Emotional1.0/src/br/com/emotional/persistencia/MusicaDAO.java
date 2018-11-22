package br.com.emotional.persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import br.com.emotional.entidade.Musica;

public class MusicaDAO  extends Dao{
	public void salvarMusica(Musica musica) throws Exception {
		
		open(); 
		
		String sql = "INSERT INTO musica (arquivo_musica, titulo_musica, id_emocao, id_estilo_musical, id_artista)" +
				 " VALUES(?, ?, ?, ?, ?)";
		
		PreparedStatement pstm = null;

		try {
			pstm = con.prepareStatement(sql);
			
			String caminho = "C:\\Users\\USER\\Music\\Playlists\\" + musica.getArquivo_musica(); 
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
	public Musica getMusicaAprovada(Musica mus) throws Exception {
		
		open(); 
		
		String sql = "Select arquivo_musica, titulo_musica from musica mu "
				+ "join aprovacao_musica am on am.id_musica = mu.id_musica where id_musica = ?";
		
		PreparedStatement pstm = null;
	
		
		try {
			pstm = con.prepareStatement(sql);
			
			pstm.setInt(1, mus.getId_musica());
			
			ResultSet rs = pstm.executeQuery(); 
			

			if(rs.next()) {
				mus.setArquivo_musica(rs.getString("arquivo_musica"));
				mus.setTitulo_musica(rs.getString("titulo_musica"));
			}			
			return mus; 
		} catch (Exception e) {

		}
		return mus; 
	}
}
