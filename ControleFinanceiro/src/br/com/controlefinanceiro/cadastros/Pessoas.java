package br.com.controlefinanceiro.cadastros;

public abstract class Pessoas {
	private int codigo;
	private String nome;
	private String senha;
	private int cpf;
	private String endereco;
	private char sexo;
	private String email;
	private int celular;

	public boolean autenticaSenha(String senha) {
		if (senha == this.senha) {
			return true;
		} else
			return false;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		if (this.codigo <= 0) {
			System.out.println("Impossível cadastrar este código");
			return;

		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

// Fim classe Usuário

}
