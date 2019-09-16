package br.com.emotional.persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.emotional.entidade.EstiloMusical;

/*
 * Classe que aplica lógica de inserir, remover e atualizar na tabela estilo musical no banco de dados 
 */

public class EstiloMusicalDAO extends Dao{
	public void salvarEstilo(EstiloMusical estilo) throws Exception{
		open();
		
		String sql = "INSERT INTO Estilo_musical (nome_estilo_musical)" +
				 " VALUES(?)";
		PreparedStatement pstm = null;
		
		try {
			pstm = con.prepareStatement(sql);
			
			pstm.setString(1, estilo.getNome_estilo_musical());
			
			pstm.execute(); 
			
		} catch (Exception e) {
			e.printStackTrace();	
			}
		finally{
			 try{
				 if(pstm != null){
				 
				 pstm.close();
				 }
				 
				 if(con != null){
				 con.close();
				 }
				 
				 }catch(Exception e){
				 
				 e.printStackTrace();
				 }
		
	}
	}
	
	public int getIdEstiloByNome(EstiloMusical estilo) throws Exception{
		open(); 
		
		String sql = "SELECT ID_ESTILO_MUSICAL FROM ESTILO_MUSICAL WHERE NOME_ESTILO_MUSICAL = ? "; 
		
		PreparedStatement pstm = null;
		
		pstm = con.prepareStatement(sql);
		
		pstm.setString(1, estilo.getNome_estilo_musical().toUpperCase());
		
		 rs =  pstm.executeQuery();
		
		int est_id = 0; 
		
		if(rs.next()) {
			est_id = rs.getInt("ID_ESTILO_MUSICAL");
		}
		
		return est_id; 
	}
}
