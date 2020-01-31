package br.com.gx2.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import br.com.gx2.entity.Grupo;
import br.com.gx2.entity.Produto;
import br.com.gx2.service.ProdutoService;
import br.com.gx2.service.ServiceFactory;

public class ProdutosCadastro {
	
			@Test
			
			public void setUp() {
				
				//Cenário
				
				ProdutoService service = ServiceFactory.createProdutoService();
				
				Grupo grupo1 = new Grupo(1, "Celulares");
				Grupo grupo2 = new Grupo(2, "Computadores");
				Grupo grupo3 = new Grupo(3, "Notebooks");
				Grupo grupo4 = new Grupo(4, "Ar condicionados");
				Grupo grupo5 = new Grupo(5, "Itens de Escritório");
				
				Produto produto1 = new Produto(1, "8517", "Celular Motorola", grupo1);
				Produto produto2 = new Produto(2, "84729021", "Computador Dell", grupo2);
				Produto produto3 = new Produto(1, "8517", "Celular Motorola", grupo3);
				Produto produto4 = new Produto(2, "84729021", "Computador Dell", grupo4);
				Produto produto5 = new Produto(1, "8517", "Celular Motorola", grupo5);
		
				
				service.cadastrarProduto(produto1);
				service.cadastrarProduto(produto2);
				service.cadastrarProduto(produto3);
				service.cadastrarProduto(produto4);
				service.cadastrarProduto(produto5);
				
				
				boolean cadastrarProduto1 = service.cadastrarProduto(produto1);
				assertTrue(cadastrarProduto1);
				boolean cadastrarProduto2 = service.cadastrarProduto(produto2);
				assertTrue(cadastrarProduto2);
				boolean cadastrarProduto3 = service.cadastrarProduto(produto3);
				assertTrue(cadastrarProduto3);
				boolean cadastrarProduto4 = service.cadastrarProduto(produto4);
				assertTrue(cadastrarProduto4);
				boolean cadastrarProduto5 = service.cadastrarProduto(produto5);
				assertTrue(cadastrarProduto5);
			
			}
			
			
	}