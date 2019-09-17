package br.com.emotional.persistencia;

import java.sql.PreparedStatement;


import br.com.emotional.entidade.FaleConosco;


/*
 * Classe que aplica lógica de inserir, remover e atualizar na FaleConosco no banco de dados 
 */

public class FaleConoscoDAO extends Dao{

	public void salvarDuvida(FaleConosco fc) throws Exception {
		
		open();
		
		String sql = "INSERT INTO FALE_CONOSCO (NOME, EMAIL, PERGUNTA) VALUES(?, ?, ?)"; 
		
		PreparedStatement pstm = null;
		
		try {
			pstm = con.prepareStatement(sql);
			
			pstm.setString(1, fc.getNome());
			pstm.setString(2, fc.getEmail());
			pstm.setString(3, fc.getPergunta());

			
			pstm.execute(); 
		}
		catch(Exception e) {
			// e.printStackTrace();	
			 Logger.log("erro", e);
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
				 
				// e.printStackTrace();
				 Logger.log("erro", e);
				 }
		
	}
	}
}
