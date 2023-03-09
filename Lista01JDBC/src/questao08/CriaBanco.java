package questao08;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriaBanco {
	
public static void main(String[] args) {
	try {
		Connection conexao = DriverManager.getConnection("jdbc:mysql://localhost/" + "?serverTimezone=UTC","root","aluno");
		Statement stm = conexao.createStatement();
		String WSQL = "create database leonardo";
		stm.executeQuery(WSQL);
		
		WSQL = "create table usuario(idUsuario int not null primary key auto_increment)";
		conexao.close();
	} catch (SQLException e) {
		e.printStackTrace();
	}

}
}
