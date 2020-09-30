

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class cadastroUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		Connection con = Conecta.criarConexao();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	PreparedStatement pst = null;
	ResultSet rs = null;
	
	

		String sql = "select * from funcionarios";
		try {
		System.out.println(sql);
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
}
