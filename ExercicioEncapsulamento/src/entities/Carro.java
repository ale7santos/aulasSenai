package entities;

public class Carro {
	private int ano;
	private String modelo;
	private String cor;
	private String tipo;
	private String cambio;
	private String tipoCombustivel;
	private double valor;
	private String estaoConservacao;
	private Cliente cliente;

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) throws Exception {
		if(ano >= 2019) {
			this.ano = ano;
		}else {
			throw new Exception("Não pode ser efetuado cadastro, carro com ano incompativel, so aceitamos carro com menos de 3 anos de uso");
		}
		this.ano = ano;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCambio() {
		return cambio;
	}

	public void setCambio(String cambio) {
		this.cambio = cambio;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public double getValor() {
		return valor;
	}

	/*
	 * public void setValor(double valor) { this.valor = valor; }
	 */

	public String getEstaoConservacao() {
		return estaoConservacao;
	}

	public void setEstaoConservacao(String estaoConservacao) {
		this.estaoConservacao = estaoConservacao;
	}

	public void ValorCompra(double valor) {
		this.valor += (valor + (valor * 0.40));
	}

	@Override
	public String toString() {

		return "Cliente: " + cliente.getNome()
		+"\nCPF: " + cliente.getCpf()
		+"\nTelefone: " + cliente.getTelefone()
		+"\nEndereço: " + cliente.getEndereco()
		+"\n\n"
		+"\nVeículo: " + modelo
		+"\nCambio: " + cambio
		+"\nAno: " + ano
		+"\nCor: " + cor
		+"\nTipo: " + tipo
		+"\nCombustível: " + tipoCombustivel
		+"\nVeículo novo ou usado: " + estaoConservacao
		+"\nValor venda: " + valor;
	}

}
