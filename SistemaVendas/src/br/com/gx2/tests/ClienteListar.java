package br.com.gx2.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

import br.com.gx2.service.ClienteService;
import br.com.gx2.service.ServiceFactory;

class ClienteListar {

		ClienteService service = ServiceFactory.createClienteService();
	
	@Test
	void test() {
		
		service.exibirTodosClientes();
		
		assertThat(service.exibirTodosClientes().size(), is (5));
	}

}
