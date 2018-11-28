package br.com.emotional.persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.emotional.entidade.Usuario;

public class PlaylistDAO extends Dao{
	
	public boolean inserirPlaylist(String nome_play, int id_usu) throws Exception {
		
		open(); 
		boolean inserido = false; 
		
		String sql = "INSERT INTO PLAYLIST(NOME_PLAYLIST, ID_USU) VALUES(?, ?)"; 
		
		PreparedStatement pstm = null;
		
		try {
			
			pstm = con.prepareStatement(sql);
			
			pstm.setString(1, nome_play);
			pstm.setInt(2, id_usu);
			
			pstm.execute(); 
			
			return inserido = true; 
			
		} catch (Exception e) {
			e.printStackTrace();	
			return inserido; 
		}
	} 
		public List<Integer> buscaPlaylistporUs(int id_usu) throws Exception{
			
			open(); 
			List<Integer> lista = new ArrayList<>(); 
			
			String sql = "SELECT ID_PLAYLIST FROM PLAYLIST WHERE ID_USU = ?"; 
			
			PreparedStatement pstm = null;
			
			try {
				
				pstm = con.prepareStatement(sql);
				
				pstm.setInt(1, id_usu);

				
				ResultSet rs =  pstm.executeQuery(); 
				
				while(rs.next()) {
					
					int id = rs.getInt("ID_PLAYLIST"); 
					lista.add(id); 
				}
			
				return lista; 
			} catch (Exception e) {
				e.printStackTrace();	
				return lista; 
			}

		}
}
