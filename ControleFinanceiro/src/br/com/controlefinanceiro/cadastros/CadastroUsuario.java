package br.com.controlefinanceiro.cadastros;

import br.com.controlefinanceiro.usuarios.Usuarios;

public class CadastroUsuario extends Usuarios {

	public static void main(String[] args) {
		Usuarios usr = new Usuarios();
		usr.setCod_usuario(1);
		usr.setNome_usuario("Pablo");
		usr.setSenha("1234");

		usr.validaLogin("4321", usr);
	}

}
