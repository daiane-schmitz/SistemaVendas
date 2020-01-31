package br.com.gx2.tests;

import org.junit.Test;

import br.com.gx2.entity.Loja;
import br.com.gx2.service.LojaService;
import br.com.gx2.service.ServiceFactory;

public class LojaCadastro {

	
			@Test
			
			public void setUp() {
				
				//Cen�rio
				LojaService service = ServiceFactory.createLojaService();
				
				Loja loja1 = new Loja(1, "Americanas");
				Loja loja2 = new Loja(2, "Dell");
				Loja loja3 = new Loja(3, "Apple");
				Loja loja4 = new Loja(4, "Ponto Frio");
				Loja loja5 = new Loja(5, "Magazine Luiza");
				
				service.cadastrarLoja(loja1);
				service.cadastrarLoja(loja2);
				service.cadastrarLoja(loja3);
				service.cadastrarLoja(loja4);
				service.cadastrarLoja(loja5);
				
			}
			
			
	}

