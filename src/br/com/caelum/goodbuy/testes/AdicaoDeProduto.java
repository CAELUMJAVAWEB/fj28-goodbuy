package br.com.caelum.goodbuy.testes;
import org.hibernate.Session;

import br.com.caelum.goodbuy.dao.ProdutoDao;
import br.com.caelum.goodbuy.infra.CriadorDeSession;
import br.com.caelum.goodbuy.modelo.Produto;

public class AdicaoDeProduto {
	 public static void main(String[] args) {
	     Session session = CriadorDeSession.getSession();
	     
	     Produto produto = criaProduto();
	   
	    new ProdutoDao().salva( produto);
	     
	    
	   }

	private static Produto criaProduto() {
		Produto produto = new Produto();
	     produto.setNome("Prateleira");
	     produto.setDescricao("Uma prateleira para colocar livros");
	     produto.setPreco(35.90);
		return produto;
	}
	

}
