package br.com.emotional.persistencia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Calendar;
import java.sql.Date;

import br.com.emotional.entidade.Usuario;


public class UsuarioDAO extends Dao {
	public void salvarUsuario(Usuario usuario) throws Exception {
		open(); 
		
		String sql = "INSERT INTO Usuario (nome, apelido, email, senha, foto, data_nasc, isPremium, ativo)" +
				 " VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
		
		Connection conn = null; 
		PreparedStatement pstm = null;
		
		try {
			pstm = con.prepareStatement(sql);
			
			pstm.setString(1, usuario.getNome());
			pstm.setString(2, usuario.getApelido());
			pstm.setString(3, usuario.getEmail());
			pstm.setString(4, usuario.getSenha());
			pstm.setString(5, usuario.getImagem());
			pstm.setDate(6, new java.sql.Date(
                    Calendar.getInstance().getTimeInMillis()));
			pstm.setBoolean(7, usuario.isPremium());
			pstm.setBoolean(8, true);
			
			pstm.execute(); 
		}
		catch(Exception e) {
			 e.printStackTrace();			
		}
		finally{
			 try{
				 if(pstm != null){
				 
				 pstm.close();
				 }
				 
				 if(conn != null){
				 conn.close();
				 }
				 
				 }catch(Exception e){
				 
				 e.printStackTrace();
				 }
		
	}
}
}
