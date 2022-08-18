package entities;

public class Produto {
	public String nomeProduto;
	public int quantidade;
	public double valor = 0;
	
	public Produto () {
		
	}
	
	public Produto (String nomeProduto, int quantidade, double valor) {
		this.quantidade = quantidade;
		this.valor = valor;
		this.nomeProduto = nomeProduto;
		
	}
	
	public Produto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
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
	
/*	public void Estoque() {
		System.out.println("temos em estoque: " + (valor * quantidade)); 
	} */
	@Override
	public String toString() {
		return "Nome produto: " + nomeProduto
				+ "\nQuantidade: " + quantidade
				+ "\nValor unitário: " + valor
				+ "\nValor total em estoque: " + String.format("%.2f", ValorTotalEmEstoque());
	}

}
