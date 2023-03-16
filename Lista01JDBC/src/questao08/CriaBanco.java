package questao08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriaBanco {
	
public static void main(String[] args) {
	try {
		Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/","root","aluno");
		Statement stm = conexao.createStatement();
		String WSQL = "create database if not exists leonardo";
		stm.executeUpdate(WSQL);
		
		WSQL = "use leonardo";
		stm.executeUpdate(WSQL);
		
		WSQL = "create table pais(pais_id INT PRIMARY KEY NOT NULL, nome VARCHAR(50) NOT NULL, continente VARCHAR(50) NOT NULL)";
		stm.executeUpdate(WSQL);
		
		conexao.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}

}
}
