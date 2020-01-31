package br.com.gx2.tests;

import java.util.List;

import org.junit.jupiter.api.Test;

import br.com.gx2.entity.Grupo;
import br.com.gx2.service.GrupoService;
import br.com.gx2.service.ServiceFactory;

class GruposListar {

	@Test
	void test() {

		GrupoService service = ServiceFactory.createGrupoService();

		assertThat(service.exibirTodosGrupos());

}

	private void assertThat(List<Grupo> grupos) {
		// TODO Auto-generated method stub
		
	}
}
