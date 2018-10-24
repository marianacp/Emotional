package br.com.emotional.persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import br.com.emotional.entidade.Usuario;

public class LoginDAO  extends Dao implements iDAO<Usuario>{
	public Usuario getSingle(String email) throws Exception {
		open(); 
		
        
        PreparedStatement ps = null;
        ResultSet rs = null;

        	String sql = "select us_id, nome, email, apelido, senha, emo_id, ispremium, foto, ativo from usuario where email = ?";
        	ps = con.prepareStatement(sql); 
        	
            ps.setString(1, email);
            rs = ps.executeQuery();
            if (rs.next()) {
               Usuario us = new Usuario(); 
               us = new Usuario(); 
				us.setApelido(rs.getString("APELIDO"));
				us.setAtivo(rs.getBoolean("ATIVO"));
				//us.setData_nasc(rs.getDate("DATA_NASC");
				us.setEmail(rs.getString("EMAIL"));
				us.setSenha(rs.getString("SENHA"));
				us.setEmo_id(rs.getInt("EMO_ID"));
				us.setImagem(rs.getString("FOTO"));
				us.setNome(rs.getString("NOME"));
				us.setPremium(rs.getBoolean("ISPREMIUM"));
				us.setUs_id(rs.getInt("US_ID"));
				
				return us;
            }
            return null;
    }
	
        @Override
        public Usuario getSingle(Object... chave) {
            if (chave[0] instanceof Integer) {

                PreparedStatement ps = null;
                ResultSet rs = null;
                try {
                    ps = con.prepareStatement("select us_id, nome, email, apelido, senha, emo_id, ispremium, foto, ativo from usuario where email = ?");
                    ps.setInt(1, (Integer) chave[0]);
                    rs = ps.executeQuery();
                    if (rs.next()) {
                    	 Usuario us = new Usuario(); 
                         us = new Usuario(); 
          				us.setApelido(rs.getString("APELIDO"));
          				us.setAtivo(rs.getBoolean("ATIVO"));
          				//us.setData_nasc(rs.getDate("DATA_NASC");
          				us.setEmail(rs.getString("EMAIL"));
          				us.setSenha(rs.getString("SENHA"));
          				us.setEmo_id(rs.getInt("EMO_ID"));
          				us.setImagem(rs.getString("FOTO"));
          				us.setNome(rs.getString("NOME"));
          				us.setPremium(rs.getBoolean("ISPREMIUM"));
          				us.setUs_id(rs.getInt("US_ID"));
          				
          				return us;
                    }
                } catch (SQLException ex) {
                } finally {
                    try {
						con.close();
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} 
                }
            }
            return null;
        }
        @Override
        public List<Usuario> getList() {
            return getList(0);
        }
      
        @Override
        public List<Usuario> getList(int top) {
            if (top < 0) {
                return null;
            }
            List<Usuario> lista = null;

            Statement ps = null;
            ResultSet rs = null;
            try {
                ps = con.createStatement();
                rs = ps.executeQuery("select us_id, nome, email, apelido, senha, emo_id, ispremium, foto, ativo from usuario where email = ?");
                lista = new ArrayList<>();
                while (rs.next()) {
                	 Usuario us = new Usuario(); 
                     us = new Usuario(); 
      				us.setApelido(rs.getString("APELIDO"));
      				us.setAtivo(rs.getBoolean("ATIVO"));
      				//us.setData_nasc(rs.getDate("DATA_NASC");
      				us.setEmail(rs.getString("EMAIL"));
      				us.setSenha(rs.getString("SENHA"));
      				us.setEmo_id(rs.getInt("EMO_ID"));
      				us.setImagem(rs.getString("FOTO"));
      				us.setNome(rs.getString("NOME"));
      				us.setPremium(rs.getBoolean("ISPREMIUM"));
      				us.setUs_id(rs.getInt("US_ID"));
      				
      				lista.add(us);
                }
            } catch (SQLException ex) {
            } finally {
                try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
            return lista;
        }
}

