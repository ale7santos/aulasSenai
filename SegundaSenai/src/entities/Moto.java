package entities;

public class Moto extends Veiculo {

	private String direcao;
	private String fabricante;

	public Moto() {

	}

	public Moto(int qtdPneus, String potencia, int qtdPassageiros, String tipoCombustivel, String tipo, String modelo) {
		super(qtdPneus, potencia, qtdPassageiros, tipoCombustivel, tipo, modelo);

		this.direcao = direcao;
		this.fabricante = fabricante;
	}

	public String getDirecao() {
		return direcao;
	}

	public void setDirecao(String direcao) {
		this.direcao = direcao;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return " direcao =" + direcao 
				+ "\nfabricante=" + fabricante ;
	}

}
