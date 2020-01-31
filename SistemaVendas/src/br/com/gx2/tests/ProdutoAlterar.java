package br.com.gx2.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.gx2.entity.Grupo;
import br.com.gx2.entity.Produto;
import br.com.gx2.service.ProdutoService;
import br.com.gx2.service.ServiceFactory;

class ProdutoAlterar {

	@Test
	void test() {
	
			//Cenário
			ProdutoService service = ServiceFactory.createProdutoService();

			Grupo grupo1 = new Grupo(1, "Celulares");
			
			Produto produto1 = new Produto(1, "8517", "Celular Motorola MotoG10", grupo1);
			
			
			service.alterarProduto(produto1);
			
			assertTrue(service.alterarProduto(produto1));
			
	}

}

