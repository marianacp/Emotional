package br.com.emotional.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/*
 * Classe que se conecta com o banco 
 */

public class Dao {
	
	Connection con;
	PreparedStatement stmt;
	ResultSet rs;
	
	
	private final String URL = "jdbc:mysql://localhost:3306/Emotional_BD?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&autoReconnect=true&useSSL=false";
	private final String USER = "root";
	private final String PASS = "admin";
	
	
	protected void open()throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		con = DriverManager.getConnection(URL,USER,PASS);
	}
	/*O método de fechar ao ser chamado, verificará se a variavel rs que é
	 * responsável por receber dados do banco esta aberta, aqui a expressão 
	 * é diferente de nula... se estivel ele fecha, caso ela esteja fechada
	 * ele não faz nada...*/
	protected void close()throws Exception {
		
		if(rs != null)
			rs.close();
		
		if(stmt != null)
			stmt.close();
		
		if(con != null)
			con.close();
	}
	
	public static void main(String[] args) {
		try {
			Dao d = new Dao();
			d.open();
			System.out.println("Conectado...");
			d.close();
		} catch (Exception e) {
			System.out.println("Não Conectado....");
			e.printStackTrace();
		}
