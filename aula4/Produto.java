package br.edu.imed;

/*
 * Classe de neg�cio
 * */
public class Produto {

	// Atributos: o que se sabe sobre a classe (objeto)
	String descricao;
	Double preco;
	Integer quantidadeEstoque = 0; // Objeto n�o inicializado � nulo
	String fabricante;
	
	// M�todos: as a��es que a classe (objeto) executa
	public void adicionarEstoque(Integer quantidade) {
		
		quantidadeEstoque += quantidade;
		System.out.println(quantidade+" unidade(s) adicionadas ao estoque.");
	}
	
	public void removerEstoque(Integer quantidade) {
		
		quantidadeEstoque -= quantidade;
	}
}
