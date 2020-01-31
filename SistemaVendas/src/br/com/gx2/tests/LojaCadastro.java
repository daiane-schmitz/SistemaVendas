package br.com.gx2.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import br.com.gx2.entity.Loja;
import br.com.gx2.service.LojaService;
import br.com.gx2.service.ServiceFactory;

public class LojaCadastro {

	
			@Test
			
			public void setUp() {
				
				//Cenário
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
				
				boolean cadastrarLoja1 = service.cadastrarLoja(loja1);
				assertTrue(cadastrarLoja1);
				boolean cadastrarLoja2 = service.cadastrarLoja(loja2);
				assertTrue(cadastrarLoja2);
				boolean cadastrarLoja3 = service.cadastrarLoja(loja3);
				assertTrue(cadastrarLoja3);
				boolean cadastrarLoja4 = service.cadastrarLoja(loja4);
				assertTrue(cadastrarLoja4);
				boolean cadastrarLoja5 = service.cadastrarLoja(loja5);
				assertTrue(cadastrarLoja5);
			}
			
			
	}

