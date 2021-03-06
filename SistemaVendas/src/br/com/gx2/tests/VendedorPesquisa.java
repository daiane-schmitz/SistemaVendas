package br.com.gx2.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import org.junit.jupiter.api.Test;

import br.com.gx2.entity.Vendedor;
import br.com.gx2.service.ServiceFactory;
import br.com.gx2.service.VendedorService;

class VendedorPesquisa {

	@Test
	private void test() {
		VendedorService service = ServiceFactory.createVendedorService();

		Vendedor vendedor = service.pesquisarVendedorId(1);
		
		assertThat(vendedor.getCodigoVendedor(), is (1));
	}


}
