package br.com.emotional.persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.emotional.entidade.Artista;

public class ArtistaDAO extends Dao{
	public void salvarArtista(Artista artista) throws Exception {
		open(); 
		
		String sql = "INSERT INTO artista (id_usu, id_estilo_musical)" +
				 " VALUES(?, ?)";
		
		PreparedStatement pstm = null;
		try {
			pstm = con.prepareStatement(sql);
			
			pstm.setInt(1, artista.getid_usu());
			pstm.setInt(2, artista.getEstilo_musical());


			
			pstm.execute(); 
		}
		catch(Exception e) {
			 e.printStackTrace();			
		}
		
	}
	
	public int getIdArtistabyUsu(int id_usu) throws Exception {
open(); 
		
		String sql = "select id_artista from artista where id_usu = ? ";
		
		PreparedStatement pstm = null;
		try {
			pstm = con.prepareStatement(sql);
			
			pstm.setInt(1, id_usu);

			
			}
		catch (Exception e) {
			e.printStackTrace();
		}
		int id_ar = 0; 
		ResultSet rs = pstm.executeQuery(); 
		
		if(rs.next()) {
			id_ar = rs.getInt("id_artista"); 
						
		}
		
		return id_ar; 
		
	}
}
