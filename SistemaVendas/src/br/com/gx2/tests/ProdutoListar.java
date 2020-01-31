package br.com.gx2.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

import br.com.gx2.service.ProdutoService;
import br.com.gx2.service.ServiceFactory;

class ProdutoListar {
	ProdutoService service = ServiceFactory.createProdutoService();
	
@Test
void test() {
	
	service.exibirTodosProdutos();
	
	assertThat(service.exibirTodosProdutos().size(), is (5));
	}

}
