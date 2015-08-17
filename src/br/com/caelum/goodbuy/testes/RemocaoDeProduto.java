package br.com.caelum.goodbuy.testes;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import br.com.caelum.goodbuy.dao.ProdutoDao;
import br.com.caelum.goodbuy.infra.CriadorDeSession;
import br.com.caelum.goodbuy.modelo.Produto;
public class RemocaoDeProduto {
	   public static void main(String[] args) {
		   Session session = CriadorDeSession.getSession();
		     
	     // carrega o produto do banco de dados
		   ProdutoDao produtoDao = new ProdutoDao();
		     Produto produto = produtoDao.procura(3l);
		     
			   produtoDao.apaga(produto);
	   }
	 }