

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class testePostgres {

	public static void main(String[] args) {

		conexao con = new conexao();
		String sql ="INSERT into contas_pagar (id_documento,titulo)"
				+ "values(default ,'Teste')";
		int res = con.executaSQL(sql);
		if(res>0)
			System.out.println("cadastrado");
		else 
			System.out.println("nao");
	}}