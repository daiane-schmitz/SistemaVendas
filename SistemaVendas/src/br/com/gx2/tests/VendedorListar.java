package br.com.gx2.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

import br.com.gx2.service.ServiceFactory;
import br.com.gx2.service.VendedorService;

class VendedorListar {

	VendedorService service = ServiceFactory.createVendedorService();

	@Test
	void test() {

	service.exibirTodosVendedores();
		
	assertThat(service.exibirTodosVendedores().size(), is (5));
	
	}


}
