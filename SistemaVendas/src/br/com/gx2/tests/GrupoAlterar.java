package br.com.gx2.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.com.gx2.entity.Grupo;
import br.com.gx2.service.GrupoService;
import br.com.gx2.service.ServiceFactory;

public class GrupoAlterar {

	@Test
	void test() {
	
			//Cenário
			GrupoService service = ServiceFactory.createGrupoService();
			
			Grupo grupo1 = new Grupo(1, "Celulares");
			
			service.alterarGrupo(grupo1);
			
			assertTrue(service.alterarGrupo(grupo1));
			
	}

}
