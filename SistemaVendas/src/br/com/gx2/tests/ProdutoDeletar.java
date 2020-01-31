package br.com.gx2.tests;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.gx2.service.ProdutoService;
import br.com.gx2.service.ServiceFactory;

class ProdutoDeletar {

	@Test
	void test() {
		ProdutoService service = ServiceFactory.createProdutoService();
			
		service.apagarProduto(5);
		
		assertTrue(service.apagarProduto(5));
	}
	
}
