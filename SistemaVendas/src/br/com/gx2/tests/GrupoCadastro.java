package br.com.gx2.tests;


import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;


import br.com.gx2.entity.Grupo;
import br.com.gx2.service.GrupoService;
import br.com.gx2.service.ServiceFactory;

public class GrupoCadastro {

	
		@Test
		
		public void setUp() {
			
			//Cenário
			GrupoService service = ServiceFactory.createGrupoService();

			
			Grupo grupo1 = new Grupo(1, "Celulares");
			Grupo grupo2 = new Grupo(2, "Computadores");
			Grupo grupo3 = new Grupo(3, "Notebooks");
			Grupo grupo4 = new Grupo(4, "Ar condicionados");
			Grupo grupo5 = new Grupo(5, "Itens de Escritório");
			
			service.cadastrarGrupo(grupo1);
			service.cadastrarGrupo(grupo2);
			service.cadastrarGrupo(grupo3);
			service.cadastrarGrupo(grupo4);
			service.cadastrarGrupo(grupo5);
			
			boolean cadastrarGrupo1 = service.cadastrarGrupo(grupo1);
			assertTrue(cadastrarGrupo1);
			boolean cadastrarGrupo2 = service.cadastrarGrupo(grupo2);
			assertTrue(cadastrarGrupo2);
			boolean cadastrarGrupo3 = service.cadastrarGrupo(grupo3);
			assertTrue(cadastrarGrupo3);
			boolean cadastrarGrupo4 = service.cadastrarGrupo(grupo4);
			assertTrue(cadastrarGrupo4);
			boolean cadastrarGrupo5 = service.cadastrarGrupo(grupo5);
			assertTrue(cadastrarGrupo5);
		
		}
		
	
		
		
}
