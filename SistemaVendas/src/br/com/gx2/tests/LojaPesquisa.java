package br.com.gx2.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

import br.com.gx2.entity.Loja;
import br.com.gx2.service.LojaService;
import br.com.gx2.service.ServiceFactory;

class LojaPesquisa {

	LojaService service = ServiceFactory.createLojaService();
	
	@Test
	void test() {
		
	Loja Loja = service.pesquisarLojaId(1);

	assertThat(Loja.getCodigoLoja(), is (1));
}

}
