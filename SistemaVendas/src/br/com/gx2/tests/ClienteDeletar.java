package br.com.gx2.tests;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.gx2.service.ClienteService;
import br.com.gx2.service.ServiceFactory;

class ClienteDeletar {

	@Test
	void test() {
		ClienteService service = ServiceFactory.createClienteService();
			
		service.apagarCliente(5);
		
		assertTrue(service.apagarCliente(5));
	}
	

}
