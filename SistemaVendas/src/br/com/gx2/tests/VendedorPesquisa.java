package br.com.gx2.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

import br.com.gx2.service.ServiceFactory;
import br.com.gx2.service.VendedorService;

class VendedorPesquisa {

	@Test
	private void test() {
		VendedorService service = ServiceFactory.createVendedorService();

		service.pesquisarVendedorId(1);
		
		assertThat(service.pesquisarVendedorId(1), is(1));

	}


}
