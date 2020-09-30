
import java.sql.DriverManager;

import java.sql.*;

/**
 *
 * @author mayron
 */
public class conexao {
	private String url;
	private String usuario;
	private String senha;
	private Connection con;
	private Statement statment;
	private String str_conexao;
	private String driverjdbc;

	conexao() {
		url = "jdbc:postgresql://26.165.171.94:5432/controle";
		usuario = "sysdba";
		senha = "L$5a7*(B";

		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection(url, usuario, senha);
			System.out.println("Conexão Realizada com Sucesso");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public int executaSQL(String sql) {
		try {
			Statement stm = con.createStatement();
			int res = stm.executeUpdate(sql);

			con.close();
			return res;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}

	}

	public ResultSet executabusca(String sql) {
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);

			con.close();
			return rs;
		} catch (Exception e) {

			e.printStackTrace();
			// TODO: handle exception
			return null;
		}
	}
}
