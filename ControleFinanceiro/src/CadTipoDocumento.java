import java.sql.Statement;
import java.util.Scanner;

import org.postgresql.util.*;

public class CadTipoDocumento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Contas tp = new Contas();
		Scanner tr = new Scanner(System.in);

		System.out.println("Informe tipo de documento ");
		String rt_tp = tr.next();
		System.out.println("Informe tipo de documento ");
		String rt_nome = tr.next();

		tp.setTipo_documento(rt_tp);
		tp.setNomeTipo(rt_nome);

		
	conexao con = new conexao();
	String sql = "select tp_codigo from tipos_documentos";
	con.executabusca(sql);
	System.out.println(sql);
	String sql1 = "INSERT into tipos_documentos (id_tipo,tp_codigo,tp_nome)" + 
			"values(default ,'" + tp.getTipo_documento() + "', '" + tp.getNomeTipo() + "')";
//				String sql = "INSERT into tipos_documentos (id_tipo,tp_codigo,tp_nome values(default,?,?))";
		  
		  
			int res = con.executaSQL(sql);
			if (res > 0)
				System.out.println("cadastrado");

			else
				System.out.println("nao cadastrado");
	System.out.println("Após erro");
		
}
}
