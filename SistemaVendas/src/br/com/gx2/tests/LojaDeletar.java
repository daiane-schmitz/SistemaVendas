package br.com.gx2.tests;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.gx2.service.LojaService;
import br.com.gx2.service.ServiceFactory;

class LojaDeletar {

	@Test
	void test() {
		LojaService service = ServiceFactory.createLojaService();
			
		service.apagarLoja(5);
		
		assertTrue(service.apagarLoja(5));
	}
	

}
