package br.com.emotional.persistencia;

import java.sql.PreparedStatement;

import br.com.emotional.entidade.Artista;
/*
 * Classe que aplica lógica de inserir, remover e atualizar artista no banco
 */
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
		int id_ar = 0;
		
		String sql = "select id_artista from artista where id_usu = ? ";
		
		PreparedStatement pstm = null;
		pstm = con.prepareStatement(sql);
		
		pstm.setInt(1, id_usu);
		try {
 
			rs = pstm.executeQuery(); 
			
			while(rs.next()) {
				id_ar = rs.getInt("id_artista"); 
				
			}
			
			return id_ar; 
			
			}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			try{
				 if(pstm != null){
				 
				 pstm.close();
				 }
				 
				 if(con != null){
				 con.close();
				 }
				 
				 if(rs != null) {
					 rs.close(); 
				 }
				 
				 }catch(Exception e){
				 
				 e.printStackTrace();
				 }
		}
		return id_ar; 
	}
}
