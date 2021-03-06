package br.com.gx2.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

import br.com.gx2.entity.Cliente;
import br.com.gx2.service.ClienteService;
import br.com.gx2.service.ServiceFactory;


class ClientePesquisa {

	
		ClienteService service = ServiceFactory.createClienteService();
		
		@Test
		void test() {

		Cliente cliente = service.pesquisarClienteId(1);
	
		assertThat(cliente.getCodigoCliente(), is (1));
			
	}

}
