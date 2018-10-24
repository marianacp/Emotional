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
		
		//Connection conn = null; 
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
				 
				 if(con != null){
				 con.close();
				 }
				 
				 }catch(Exception e){
				 
				 e.printStackTrace();
				 }
		
	}
}
	
	public void atualizarUsuario(Usuario usuario) throws Exception {
		open(); 
		
		String sql = "UPDATE USUARIO SET NOME = ?, APELIDO = ?, EMAIL = ?,"
				+ " SENHA = ?, FOTO = ?, DATA_NASC = ? , ISPREMIUM = ?, ATIVO = ? WHERE US_ID = ?";
				
				
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
			pstm.setBoolean(8, usuario.isAtivo());
			pstm.setInt(9, usuario.getUs_id());
			
			pstm.executeUpdate(); 
		}
		catch(Exception e) {
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
	
	
	
	public void excluirUsuario(Usuario usuario) throws Exception {
		open(); 
		
		String sql = "DELETE FROM USUARIO WHERE US_ID = ?"; 
		
		PreparedStatement pstm = null;
		
		try {
			pstm = con.prepareStatement(sql);
			
			pstm.setInt(1, usuario.getUs_id());
			
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
				 
				 if(con != null){
				 con.close();
				 }
				 
				 }catch(Exception e){
				 
				 e.printStackTrace();
				 }
		
	}
		
	}
	
	//Buscar o Usuário pelo ID 
	public Usuario buscaPorCodigo(Usuario usuario) throws Exception {
		open(); 
		
		String sql = "SELECT * FROM USUARIO WHERE US_ID = ?"; 
		
		PreparedStatement pstm = null;
		
		
			pstm = con.prepareStatement(sql);
			
			pstm.setInt(1, usuario.getUs_id());
			
			ResultSet rs =  pstm.executeQuery(); 
		
			Usuario us = null; 
			if(rs.next()) {
				us = new Usuario(); 
				us.setApelido(rs.getString("APELIDO"));
				us.setAtivo(rs.getBoolean("ATIVO"));
				//us.setData_nasc(rs.getDate("DATA_NASC");
				us.setEmail(rs.getString("EMAIL"));
				us.setEmo_id(rs.getInt("EMO_ID"));
				us.setImagem(rs.getString("FOTO"));
				us.setNome(rs.getString("NOME"));
				us.setPremium(rs.getBoolean("ISPREMIUM"));
				us.setUs_id(rs.getInt("US_ID"));
			}
			return us; 
				
	}
	
	//Trazer o email do usuário buscando pelo ID
	public int getIdPorEmail(String email) throws Exception {
		open(); 
		
		String sql = "SELECT US_ID FROM USUARIO WHERE EMAIL = ?"; 
		
		PreparedStatement pstm = null;
		
		try {
			pstm = con.prepareStatement(sql);
			pstm.setString(1, email);
			
			ResultSet rs = pstm.executeQuery(); 
		}

	catch(Exception e){
   e.printStackTrace();
   
}
		pstm.close();
        con.close();
		int codigo = rs.getInt("us_id"); 
		return codigo; 
	}
	
	public void bloquearDesbloquearUsuario(Usuario usuario) throws Exception {
		open(); 
		
		//Se está Ativo, bloqueia o usuário
		if(usuario.isAtivo()) {
			String sql = "UPDATE USUARIO SET ATIVO = FALSE WHERE US_ID = ?";	
			
			PreparedStatement pstm = null;
			try {
			pstm = con.prepareStatement(sql);
			
			pstm.setInt(1, usuario.getUs_id());
			
			pstm.executeUpdate(); 
			}
			catch(Exception e) {
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
		
		//Se está inativo, desbloqueia
		else {
			String sql = "UPDATE USUARIO SET ATIVO = TRUE WHERE US_ID = ?";	
			
			PreparedStatement pstm = null;
			
			try {
			pstm = con.prepareStatement(sql);
			
			pstm.setInt(1, usuario.getUs_id());
			
			pstm.executeUpdate(); 
			}
			catch(Exception e) {
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
		
	}
	
	public static void main(String[] args) {
		Usuario us = new Usuario(); 
		us.setUs_id(1);
		
		UsuarioDAO ud = new UsuarioDAO(); 
		try {
			ud.buscaPorCodigo(us);
			System.out.println(us.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
	
}
