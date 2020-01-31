package br.com.gx2.tests;

import static org.hamcrest.CoreMatchers.is;

import org.hamcrest.Matcher;
import org.junit.jupiter.api.Test;

import br.com.gx2.entity.Cliente;
import br.com.gx2.service.ClienteService;
import br.com.gx2.service.ServiceFactory;

class ClientePesquisa {

	@Test
	void test() {
		ClienteService service = ServiceFactory.createClienteService();


		service.pesquisarClienteId(1);
		
		assertThat(service.pesquisarClienteId(1), is(1));


	
	}

	private void assertThat(Cliente pesquisarClienteId, Matcher<Integer> matcher) {
		// TODO Auto-generated method stub
		
	}

}
