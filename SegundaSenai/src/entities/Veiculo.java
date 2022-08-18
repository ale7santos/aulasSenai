package entities;

public class Veiculo {

	private int qtdPneus;
	private String potencia;
	private int qtdPassageiros;
	private String tipoCombustivel;
	private String tipo;
	private String modelo;

	public Veiculo() {

	}

	public Veiculo(int qtdPneus, String potencia, int qtdPassageiros, String tipoCombustivel, String tipo,
			String modelo) {
		super();
		this.qtdPneus = qtdPneus;
		this.potencia = potencia;
		this.qtdPassageiros = qtdPassageiros;
		this.tipoCombustivel = tipoCombustivel;
		this.tipo = tipo;
		this.modelo = modelo;

	}

	public int getQtdPneus() {
		return qtdPneus;
	}

	public void setQtdPneus(int qtdPneus) {
		this.qtdPneus = qtdPneus;
	}

	public String getPotencia() {
		return potencia;
	}

	public void setPotencia(String potencia) {
		this.potencia = potencia;
	}

	public int getQtdPassageiros() {
		return qtdPassageiros;
	}

	public void setQtdPassageiros(int qtdPassageiros) {
		this.qtdPassageiros = qtdPassageiros;
	}

	public String getTipoCombustivel() {
		return tipoCombustivel;
	}

	public void setTipoCombustivel(String tipoCombustivel) {
		this.tipoCombustivel = tipoCombustivel;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {

		return "qtdPneus =" + qtdPneus + "\n potencia = " + potencia + "\nqtdPassageiros= " + qtdPassageiros
				+ "\ntipoCombustivel = " + tipoCombustivel + "\n tipo = " + tipo + "\nmodelo = " + modelo;

	}
}
