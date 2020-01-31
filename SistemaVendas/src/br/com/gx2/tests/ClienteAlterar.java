package br.com.gx2.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.gx2.entity.Cliente;
import br.com.gx2.service.ClienteService;
import br.com.gx2.service.ServiceFactory;

class ClienteAlterar {

	@Test
	void test() {

		ClienteService service = ServiceFactory.createClienteService();

		
		Cliente cliente1 = new Cliente(1, "Alice Rita Gomes", "45958384090");
		
		service.alterarCliente(cliente1);
		
		assertTrue(service.alterarCliente(cliente1));
	
	}

}
