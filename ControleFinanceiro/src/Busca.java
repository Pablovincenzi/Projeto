import java.sql.ResultSet;

public class Busca {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conexao con = new conexao();
		String sql = "SELECT id_documento, titulo FROM contas_pagar";
		ResultSet rs = con.executabusca(sql);
		
		
		try {
			while (rs.next()) {
				int id = rs.getInt("id_documento");
				String titulo = rs.getString("titulo");
				System.out.print(id);
				System.out.println(titulo);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
