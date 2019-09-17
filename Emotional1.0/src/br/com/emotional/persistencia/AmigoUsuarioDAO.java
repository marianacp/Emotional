package br.com.emotional.persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;

import br.com.emotional.entidade.AmigoUsuario;
import br.com.emotional.entidade.Usuario;

/*
 * Classe que aplica lógica de inserir, remover e atualizar amigo no banco de dados 
 */
public class AmigoUsuarioDAO extends Dao {
	public void salvarSolicAmizade(AmigoUsuario amigo) throws Exception {
		open();

		String sql = "INSERT INTO lista_amigos (CONFIRMACAO, ID_SOLICITADO, ID_SOLICITANTE)" + "VALUES(?, ?, ?) ";
		PreparedStatement pstm = null;

		try {
			pstm = con.prepareStatement(sql);

			pstm.setBoolean(1, amigo.isConfirmacao());
			pstm.setInt(2, amigo.getid_solicitado());
			pstm.setInt(3, amigo.getid_solicitante());

			pstm.execute();
		} catch (Exception e) {
			// e.printStackTrace();
			Logger.log("erro", e);
		} finally {
			try {
				if (pstm != null) {

					pstm.close();
				}

				if (con != null) {
					con.close();
				}

			} catch (Exception e) {

				// e.printStackTrace();
				Logger.log("erro", e);
			}

		}

	}

	public void confirmarSolicAmizade(AmigoUsuario amigo) throws Exception {
		open();
		// quando formos implementar o controle, lembrar que ao aceitar uma amizade, a
		// pessoa que aceita é o solicitado
		String sql = "UPDATE lista_amigos SET CONFIRMACAO = ?  WHERE ID_SOLICITANTE = ? AND ID_SOLICITADO = ?";

		PreparedStatement pstm = null;

		try {
			pstm = con.prepareStatement(sql);

			pstm.setBoolean(1, true);
			pstm.setInt(2, amigo.getid_solicitante());
			pstm.setInt(3, amigo.getid_solicitado());

			pstm.executeUpdate();
		} catch (Exception e) {
			// e.printStackTrace();
			Logger.log("erro", e);
		} finally {
			try {
				if (pstm != null) {

					pstm.close();
				}

				if (con != null) {
					con.close();
				}

			} catch (Exception e) {
				Logger.log("erro", e);
				// e.printStackTrace();
			}

		}

	}

	public ArrayList<AmigoUsuario> listarAmigos(Usuario usuario) throws Exception {

		open();
		ArrayList<AmigoUsuario> lista = new ArrayList<AmigoUsuario>();

		String sql = "SELECT * FROM lista_amigos WHERE ID_SOLICITANTE = ?";

		PreparedStatement pstm = null;

		pstm = con.prepareStatement(sql);

		pstm.setInt(1, usuario.getid_usu());

		try {
			rs = pstm.executeQuery();

			while (rs.next()) {

				AmigoUsuario amigo = new AmigoUsuario();
				amigo.setid_solicitado(rs.getInt("ID_SOLICITADO"));
				amigo.setid_solicitante(rs.getInt("ID_SOLICITANTE"));
				amigo.setConfirmacao(rs.getBoolean("CONFIRMACAO"));

				lista.add(amigo);
			}
			return lista;
		} catch (Exception e) {
			//e.printStackTrace();
			Logger.log("erro", e);
		}

		return lista;

	}

	public static void main(String[] args) {

		AmigoUsuarioDAO ad = new AmigoUsuarioDAO();

		AmigoUsuario am = new AmigoUsuario();
		am.setid_solicitado(1);
		am.setid_solicitante(2);

		try {
			ad.salvarSolicAmizade(am);
			;
			System.out.println("Adicionado");
		} catch (Exception e) {
			//System.out.println("Erro");
			Logger.log("erro", e);
		//	e.printStackTrace();
		}
	}
}
