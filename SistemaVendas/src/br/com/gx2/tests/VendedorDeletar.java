package br.com.gx2.tests;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.gx2.service.ServiceFactory;
import br.com.gx2.service.VendedorService;

class VendedorDeletar {

	@Test
	void test() {
		VendedorService service = ServiceFactory.createVendedorService();
			
		service.apagarVendedor(5);
		
		assertTrue(service.apagarVendedor(5));
	}
	

}
