package br.com.gx2.tests;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertNull;
import org.junit.jupiter.api.Test;

import br.com.gx2.entity.Cliente;
import br.com.gx2.entity.Grupo;
import br.com.gx2.service.GrupoService;
import br.com.gx2.service.ServiceFactory;
import junit.framework.Assert;

class GrupoDeletar {

	@Test
	void test() {
		GrupoService service = ServiceFactory.createGrupoService();
		
}
