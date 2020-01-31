package br.com.gx2.tests;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.Test;

import br.com.gx2.service.GrupoService;
import br.com.gx2.service.ServiceFactory;


	class GrupoDeletar {

		@Test
		void test() {
			GrupoService service = ServiceFactory.createGrupoService();
				
			service.apagarGrupo(1);
			
		assertTrue(service.apagarGrupo(1));
		}
		

	}
