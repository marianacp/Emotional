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
	public List<Musica> getListaMusicasAprovadas(String busca) throws Exception {
		
		open(); 
		//Status 1 eh aprovado, 2 reprovado
		String sql = "Select arquivo_musica, titulo_musica from musica mu "
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
}
