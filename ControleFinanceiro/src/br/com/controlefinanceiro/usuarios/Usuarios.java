package br.com.controlefinanceiro.usuarios;

import br.com.controlefinanceiro.cadastros.Pessoas;

public class Usuarios extends Pessoas {
	private int tipo_acesso;
	private int cod_usuario;
	private String nome_usuario;
	private int cod_cad_pessoa;

	public String getNome_usuario() {
		return nome_usuario;
	}

	public void setNome_usuario(String nome_usuario) {
		this.nome_usuario = nome_usuario;
	}

	public int getCod_usuario() {

		return cod_usuario;
	}

	public void setCod_usuario(int cod_usuario) {
		if (cod_usuario <= 0)
			System.out.println("Código inválido");
		else {
			this.cod_usuario = cod_usuario;

		}
	}

	public String validaLogin(String senha, Pessoas p) {
		if (senha == p.getSenha()) {
			System.out.println("Senha correta");
		} else {
			System.out.println("Errou");
		}
		return senha;

	}
}
