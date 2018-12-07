package br.com.emotional.persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import br.com.emotional.entidade.Emocao;

/*
 * Classe que aplica lógica de inserir, remover e atualizar na tabela emoção no banco de dados 
 */

public class EmocaoDAO extends Dao{
	public void salvarEmocao(Emocao emocao) throws Exception{
		open();
		
		String sql = "INSERT INTO Emocao (nome_emocao)" +
				 " VALUES(?)";
		PreparedStatement pstm = null;
		
		try {
			pstm = con.prepareStatement(sql);
			
			pstm.setString(1, emocao.getNome());
			
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
		
		public int getIdEmocaoByNome(Emocao emocao) throws Exception{
			open(); 
			
			String sql = "SELECT ID_EMOCAO FROM EMOCAO WHERE NOME_EMOCAO = ? "; 
			
			PreparedStatement pstm = null;
			
			pstm = con.prepareStatement(sql);
			
			pstm.setString(1, emocao.getNome().toUpperCase());
			
			ResultSet rs =  pstm.executeQuery();
			
			int emo_id = 0; 
			
			if(rs.next()) {
				emo_id = rs.getInt("ID_EMOCAO");
			}
			
			return emo_id; 
		}
	}

