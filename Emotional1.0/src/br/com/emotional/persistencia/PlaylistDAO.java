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
		
		String sql = "INSERT INTO PLAYLIST(NOME_PLAYLIST, ID_USU, DATA_GERACAO) VALUES(?, ?, ?)"; 
		
		PreparedStatement pstm = null;
		
		try {
			
			java.sql.Timestamp date = new java.sql.Timestamp(new java.util.Date().getTime());

			
			pstm = con.prepareStatement(sql);
			
			pstm.setString(1, nome_play);
			pstm.setInt(2, id_usu);
			pstm.setTimestamp(3, date);
			
			pstm.execute(); 
			
			return inserido = true; 
			
		} catch (Exception e) {
			e.printStackTrace();	
			return inserido; 
		}
	} 
		public List<Integer> buscaPlaylistDiariaporUs(int id_usu) throws Exception{
			
			open(); 
			List<Integer> lista = new ArrayList<>(); 
			
			String sql = "SELECT ID_PLAYLIST FROM PLAYLIST WHERE ID_USU = ? AND DATA_GERACAO = CURDATE()"; 
			
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
