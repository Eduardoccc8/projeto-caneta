package entities10;

public class Programa10 () {	
		
	public String nome;
	public double preco;
	public int quantidade;
	
	// agora publicar digitar as funcoes os valores ou se preferir os metodos!

	public double totalValoresNoEstoque() {
	return preco * quantidade;
}
	public void addProdutos(int quantidade ) {
		this.quantidade += quantidade;
		
	}
	
	public void removerProdutos(int quantidade) {
		this.quantidade -= quantidade;
		
	}
}







	
