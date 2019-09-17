package br.com.emotional.persistencia;

/*
 * Classe que aplica lógica de procurar na tabela usuario no banco de dados 
 */

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.annotation.WebServlet;

import br.com.emotional.entidade.Usuario;
@WebServlet({"/loginUsario"})
public class LoginDAO  extends Dao implements iDAO<Usuario>{
	public Usuario getSingle(String email) throws Exception {
		open(); 
		
        
        PreparedStatement ps = null;

        	String sql = "select id_usu, nome, email, Login, senha, id_emocao, Premium, foto, ativo, cpf, tipoUsuario from usuario where email = ?";
        	ps = con.prepareStatement(sql); 
        	
            ps.setString(1, email);
            rs = ps.executeQuery();
            if (rs.next()) {
               Usuario us = new Usuario(); 
               us = new Usuario(); 
				us.setLogin(rs.getString("login"));
				us.setAtivo(rs.getBoolean("ATIVO"));
				//us.setdata_nascimento(rs.getDate("data_nascimento");
				us.setEmail(rs.getString("email"));
				us.setSenha(rs.getString("senha"));
				us.setidEmocao(rs.getInt("idEmocao"));
				us.setImagem(rs.getString("FOTO"));
				us.setNome(rs.getString("NOME"));
				us.setPremium(rs.getBoolean("Premium"));
				us.setid_usu(rs.getInt("id_usu"));
				us.setCpf(rs.getString("CPF"));
				us.setTipoUsuario(rs.getString("tipoUsuario"));
				
				return us;
            }
            return null;
    }
	
	
	
        @Override
        public Usuario getSingle(Object... chave) {
            if (chave[0] instanceof Integer) {

                PreparedStatement ps = null;
                try {
                    ps = con.prepareStatement("select id_usu, nome, email, Login, senha, id_emocao, Premium, foto, ativo, cpf, tipoUsuario from usuario where email = ?");
                    ps.setInt(1, (Integer) chave[0]);
                    rs = ps.executeQuery();
                    if (rs.next()) {
                    	Usuario us = new Usuario();
                        us = new Usuario();                    	  
          				us.setLogin(rs.getString("Login"));
          				us.setAtivo(rs.getBoolean("ATIVO"));
          				//us.setdata_nascimento(rs.getDate("data_nascimento");
          				us.setEmail(rs.getString("EMAIL"));
          				us.setSenha(rs.getString("SENHA"));
          				us.setidEmocao(rs.getInt("idEmocao"));
          				us.setImagem(rs.getString("FOTO"));
          				us.setNome(rs.getString("NOME"));
          				us.setPremium(rs.getBoolean("premium"));
          				us.setid_usu(rs.getInt("id_usu"));
          				us.setCpf(rs.getString("CPF"));
          				us.setTipoUsuario(rs.getString("tipoUsuario"));
          				
          				return us;
                    }
                } catch (SQLException ex) {
                } finally {
                    try {
                    	con.close();
					} catch (SQLException e) {
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
            try {
                ps = con.createStatement();
                rs = ps.executeQuery("select id_usu, nome, email, Login, senha, id_emocao, premium, foto, ativo, cpf, tipoUsuario from usuario where email = ?");
                lista = new ArrayList<>();
                while (rs.next()) {
                	 Usuario us = new Usuario(); 
                     us = new Usuario(); 
      				us.setLogin(rs.getString("Login"));
      				us.setAtivo(rs.getBoolean("ATIVO"));
      				//us.setdata_nascimento(rs.getDate("data_nascimento");
      				us.setEmail(rs.getString("EMAIL"));
      				us.setSenha(rs.getString("SENHA"));
      				us.setidEmocao(rs.getInt("idEmocao"));
      				us.setImagem(rs.getString("FOTO"));
      				us.setNome(rs.getString("NOME"));
      				us.setPremium(rs.getBoolean("premium"));
      				us.setid_usu(rs.getInt("idUsu"));
      				us.setCpf(rs.getString("CPF"));
      				us.setTipoUsuario(rs.getString("tipoUsuario"));
      				
      				lista.add(us);
                }
            } catch (SQLException ex) {
            } finally {
                try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
            }
            return lista;
        }
}

