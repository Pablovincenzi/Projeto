import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class TesteSelect {

	public static void main(String[] args) {
		String recebe = "esteinsert";
		System.out.println(recebe);
		conexao con = new conexao();
		String sql =("INSERT INTO contas_receber (titulo) VALUES ('" + recebe + "')");
		
		int res = con.executaSQL(sql);
		if(res>0)
			System.out.println("cadastrado");
		else 
			System.out.println("nao");
	}}