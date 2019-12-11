package br.com.mapfre.teste;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoTest {

	public static void main(String[] args) {
		try {
			Connection con =  DriverManager.getConnection("jdbc:oracle:thin:@oracle.fiap.com.br:1521:orcl","rm80577","120197");
			System.out.println("Conectou");
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
