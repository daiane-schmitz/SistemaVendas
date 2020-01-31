package br.com.gx2.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

import br.com.gx2.entity.Produto;
import br.com.gx2.service.ProdutoService;
import br.com.gx2.service.ServiceFactory;

class ProdutoPesquisa {

	ProdutoService service = ServiceFactory.createProdutoService();
	
	@Test
	void test() {

	Produto Produto = service.pesquisarProdutoId(1);

	assertThat(Produto.getCodigoProduto(), is (1));
	}

}
