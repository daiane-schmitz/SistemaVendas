package br.com.gx2.tests;


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
			
		
		}
		
	
		
		
}
