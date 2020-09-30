
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Despesas
ID(DB)
numerodoc
titulo
observacoes
origem
tipo_documento
prestacoes
valor
data _emissao
data _previso
data_baixa
situacao
*/

public  class Contas {

	private int numerodoc;
	private Double saldo;
	private String titulo;
	private String observacoes;
	private String origem;
	protected String tipo_documento;
	private int prestacoes;
	private double valor;
	private String dataemissao;
	private String datacadastro;
	private String data_previsao;
	private String data_baixa;
	private int situacao;
	private String nomeTipo;
	
	
	public void setNomeTipo(String nomeTipo) {
		this.nomeTipo = nomeTipo;
	}

	DateFormat strDf = new SimpleDateFormat("dd/MM/yyyy hh:mm"); //Metodo data e hora atual
	Date data = new Date();

	public String retornoData() {
		
		return this.datacadastro = strDf.format(data);

	}

	public int getNumerodoc() {
		return numerodoc;
	}

	public void setNumerodoc(int numerodoc) {
		this.numerodoc = numerodoc;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public String getOrigem() {
		return origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	public String getTipo_documento() {
		return tipo_documento;
	}

	public void setTipo_documento(String tipo_documento) {
		this.tipo_documento = tipo_documento;
	}

	public int getPrestacoes() {
		return prestacoes;
	}

	public void setPrestacoes(int prestacoes) {
		this.prestacoes = prestacoes;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getDataemissao() {
		return dataemissao;
	}

	public void setDataemissao(String dataemissao) {
		this.dataemissao = dataemissao;
	}

	public String getData_previsao() {
		return data_previsao;
	}

	public void setData_previsao(String data_previsao) {
		this.data_previsao = data_previsao;
	}

	public String getData_baixa() {
		return data_baixa;
	}

	public void setData_baixa(String data_baixa) {
		this.data_baixa = data_baixa;
	}

	public int getSituacao() {
		return situacao;
	}

	public void setSituacao(int situacao) {
		this.situacao = situacao;
	}

	public DateFormat getStrDf() {
		return strDf;
	}

	public void setStrDf(DateFormat strDf) {
		this.strDf = strDf;
	}

	public String getNomeTipo() {
		return nomeTipo;
	}

	
}
