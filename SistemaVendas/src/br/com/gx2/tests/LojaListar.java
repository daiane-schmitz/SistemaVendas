package br.com.gx2.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

import br.com.gx2.service.LojaService;
import br.com.gx2.service.ServiceFactory;

class LojaListar {

	LojaService service = ServiceFactory.createLojaService();

		@Test
		void test() {

		service.exibirTodasLojas();

		assertThat(service.exibirTodasLojas().size(), is(5));
	}

}
