package br.com.gx2.tests;

import static org.hamcrest.CoreMatchers.is;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import br.com.gx2.entity.Grupo;
import br.com.gx2.service.GrupoService;
import br.com.gx2.service.ServiceFactory;

class GrupoPesquisa {

	@Test
	void test() {
		GrupoService service = ServiceFactory.createGrupoService();
		
		service.pesquisarGrupoId(1);
		
		assertThat(service.pesquisarGrupoId(1), is(1));
		
		System.out.println(service.pesquisarGrupoId(1));
		
	}

	private void assertThat(Grupo pesquisarGrupoId, Matcher<Integer> matcher) {
		// TODO Auto-generated method stub
		
	}

}
