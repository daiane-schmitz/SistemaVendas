package br.com.gx2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.gx2.entity.Loja;
import br.com.gx2.service.LojaService;
import br.com.gx2.service.ServiceFactory;

class LojaAlterar {

	LojaService service = ServiceFactory.createLojaService();

	@Test
	void test() {

		
		Loja loja1 = new Loja(1, "Americanas Ltda");
		
		service.alterarLoja(loja1);
		
		assertTrue(service.alterarLoja(loja1));
	
	}

}
