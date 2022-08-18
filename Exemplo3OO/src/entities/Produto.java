package entities;

public class Produto {
	private String nomeProduto;
	private int quantidade;
	private double valor = 0;
	
	public Produto () {
		
	}
		
	public void AdicionarItem(int qtd) {
		quantidade += qtd;
	}
	public void RemoverItem(int qtd) {
		quantidade -= qtd;
	}
	
	public double ValorTotalEmEstoque() {
		return quantidade * valor;
	}
	
	public String getNomeProduto () {
		return nomeProduto;
	}
	
	public void setNomeProduto(String nomeProduto) {
		if(nomeProduto.length() > 3) {
			this.nomeProduto = nomeProduto;
		}else {
			this.nomeProduto = "Padrão";
		}
				
	}
	
	
	@Override
	public String toString() {
		return "Nome produto: " + nomeProduto
				+ "\nQuantidade: " + quantidade
				+ "\nValor unitário: " + valor
				+ "\nValor total em estoque: " + String.format("%.2f", ValorTotalEmEstoque());
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

}
