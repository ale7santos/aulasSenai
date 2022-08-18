package entities;

public class Carro extends Veiculo {

	private String arCondicionado;
	private String sonorizacao;

	public Carro() {

	}

	public String getArCondicionado() {
		return arCondicionado;
	}

	public void setArCondicionado(String arCondicionado) {
		this.arCondicionado = arCondicionado;
	}

	public String getSonorizacao() {
		return sonorizacao;
	}

	public void setSonorizacao(String sonorizacao) {
		this.sonorizacao = sonorizacao;
	}

	public Carro(int qtdPneus, String potencia, int qtdPassageiros, String tipoCombustivel, String tipo,
			String modelo) {
		super(qtdPneus, potencia, qtdPassageiros, tipoCombustivel, tipo, modelo);

		this.arCondicionado = arCondicionado;
		this.sonorizacao = sonorizacao;
	}

	@Override
	public String toString() {
		return "ar-condicionado=" + arCondicionado 
				+ "\nsonorizacao=" + sonorizacao ;
	}
}
