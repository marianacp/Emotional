package br.com.emotional.persistencia;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;

import br.com.emotional.entidade.Musica;

public class MusicaDAO  extends Dao{
	public void salvarMusica(Musica musica) throws Exception {
		
		open(); 
		
		String sql = "INSERT INTO musica (arquivo_musica, titulo_musica, id_emocao, id_estilo_musical, id_artista)" +
				 " VALUES(?, ?, ?, ?, ?)";
		
		PreparedStatement pstm = null;

		try {
			pstm = con.prepareStatement(sql);
			
			String caminho = "C:\\Users\\USER\\Music\\Playlists\\"; 
			File file = new File(caminho + musica.getArquivo_musica()); 
			FileInputStream fis = new FileInputStream(file); 
			pstm.setBinaryStream(1, fis);
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
}
