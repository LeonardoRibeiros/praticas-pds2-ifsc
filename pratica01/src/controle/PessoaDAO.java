package controle;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.Pessoa;

public class PessoaDAO {
	private Conexao con;
	public boolean inserir(Pessoa p) {
		//Instanciar conexão//
		con = Conexao.getInstancia();
		
		//Abrir conexão//
		Connection c = con.conectar();
		try {
			String query = "INSERT INTO pessoa (cpf,nome) VALUES (?, ?);";
		PreparedStatement stm = c.prepareStatement(null);
		stm.setInt(1, 12345);
		stm.setString(2, "leonardo");
		int valida = stm.executeUpdate();
		
		}catch (SQLException e){
			e.printStackTrace();
		}
		
		
		//Fechar conexão//
		con.fecharConexao();
		return false;
	}

	public boolean atualizar(Pessoa p) {
		
		return false;
	}
	public boolean deletar(Pessoa p) {
		
		return false;
	}
	
	public ArrayList<Pessoa> listarPessoas(){
		ArrayList <Pessoa> pessoas = new ArrayList<>();
		//Instanciar conexão//
				con = Conexao.getInstancia();
				
				//Abrir conexão//
				Connection c = con.conectar();
				try {
					Statement stm = c.createStatement();
					String query = "SELECT *FROM pessoa";
					ResultSet rs = stm.executeQuery(query);
					while (rs.next()){
						int id = rs.getInt("cpf");
						String nome = rs.getString("nome");
						Pessoa p = new Pessoa();
						p.setCpf(cpf);
						p.setNome(nome);
						pessoas.add(p);
					}
				}catch (SQLException e){
					e.printStackTrace();
				}
				
				//Fechar conexão//
				con.fecharConexao();
		return null;
	}
}
