package br.com.gx2.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

import br.com.gx2.service.GrupoService;
import br.com.gx2.service.ServiceFactory;

class GruposListar {


		GrupoService service = ServiceFactory.createGrupoService();

		@Test
		void test() {
	
		service.exibirTodosGrupos();
			
		assertThat(service.exibirTodosGrupos().size(), is (5));
		
		}

}
