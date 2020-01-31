package br.com.gx2.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

import br.com.gx2.entity.Grupo;
import br.com.gx2.service.GrupoService;
import br.com.gx2.service.ServiceFactory;

class GrupoPesquisa {


		GrupoService service = ServiceFactory.createGrupoService();
		
		@Test
		void test() {
			
		Grupo grupo = service.pesquisarGrupoId(1);
	
		assertThat(grupo.getCodigoGrupo(), is (1));
	}

}
