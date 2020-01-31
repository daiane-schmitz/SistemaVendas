package br.com.gx2.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import br.com.gx2.entity.Vendedor;
import br.com.gx2.service.ServiceFactory;
import br.com.gx2.service.VendedorService;

class VendedorAlterar {

	VendedorService service = ServiceFactory.createVendedorService();

	@Test
	void test() {

		Vendedor vendedor1 = new Vendedor(1, "123", "Maria Silva Sauro");
		
		service.alterarVendedor(vendedor1);
		
		assertTrue(service.alterarVendedor(vendedor1));
	
	}

}