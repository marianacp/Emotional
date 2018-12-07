package br.com.emotional.persistencia;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import br.com.emotional.entidade.Musica;
import br.com.emotional.entidade.Usuario;

/*
 * Classe que aplica lógica de inserir, remover e atualizar na tabela playlist no banco de dados 
 */

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
		
		public List<Musica> gerarPlaylist(int id_emo) throws Exception{
			open(); 
			
			String sql = "select id_musica, arquivo_musica, id_estilo_musical, id_artista, titulo_musica from musica where id_emocao = ? order by rand() limit 12"; 
			List<Musica> lista = new ArrayList<>(); 
			PreparedStatement pstm = null;
			
try {
				
				pstm = con.prepareStatement(sql);
				
				pstm.setInt(1, id_emo);


				
				ResultSet rs =  pstm.executeQuery(); 
				
				while(rs.next()) {
					Musica mus = new Musica(); 
					mus.setId_musica(rs.getInt("ID_MUSICA"));
					mus.setArquivo_musica(rs.getString("ARQUIVO_MUSICA"));
					mus.setId_estilo_musical(rs.getInt("ID_ESTILO_MUSICAL"));
					mus.setId_artista(rs.getInt("ID_ARTISTA"));
					mus.setTitulo_musica(rs.getString("TITULO_MUSICA"));
					lista.add(mus); 
				}
			
				return lista; 
			} catch (Exception e) {
				e.printStackTrace();	
				return lista; 
			}
					
			
		}
		
		public void salvarEmocaoPlaylist(String nomePlaylist, int id_usuario, int id_emocao) throws Exception {
			open(); 
			
			String sql = "UPDATE PLAYLIST SET EMOCAO = ? WHERE NOME_PLAYLIST = ? AND ID_USU = ?"; 
			
			PreparedStatement pstm = null;
			
			try {
				pstm = con.prepareStatement(sql);

				
				pstm.setString(1, nomePlaylist);
				pstm.setInt(2, id_usuario);
				pstm.setInt(3, id_emocao);
				
				pstm.executeUpdate(); 
				
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
}
