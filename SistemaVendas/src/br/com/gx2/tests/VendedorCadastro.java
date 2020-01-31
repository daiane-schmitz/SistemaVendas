package br.com.gx2.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import br.com.gx2.entity.Vendedor;
import br.com.gx2.service.VendedorService;
import br.com.gx2.service.ServiceFactory;

public class VendedorCadastro {

	
			@Test
			
			public void setUp() {
				
				//Cenário
				VendedorService service = ServiceFactory.createVendedorService();

				
				Vendedor vendedor1 = new Vendedor(1, "123", "Maria Silva");
				Vendedor vendedor2 = new Vendedor(2, "321", "José Sauro" );
				Vendedor vendedor3 = new Vendedor(3, "456", "Carlos Augustio");
				Vendedor vendedor4 = new Vendedor(4, "654", "Felipe Silveira");
				Vendedor vendedor5 = new Vendedor(5, "789", "Alexandre Lentilha");
				
				service.cadastrarVendedor(vendedor1);
				service.cadastrarVendedor(vendedor2);
				service.cadastrarVendedor(vendedor3);
				service.cadastrarVendedor(vendedor4);
				service.cadastrarVendedor(vendedor5);
			
				boolean cadastrarVendedor1 = service.cadastrarVendedor(vendedor1);
				assertTrue(cadastrarVendedor1);
				boolean cadastrarVendedor2 = service.cadastrarVendedor(vendedor2);
				assertTrue(cadastrarVendedor2);
				boolean cadastrarVendedor3 = service.cadastrarVendedor(vendedor3);
				assertTrue(cadastrarVendedor3);
				boolean cadastrarVendedor4 = service.cadastrarVendedor(vendedor4);
				assertTrue(cadastrarVendedor4);
				boolean cadastrarVendedor5 = service.cadastrarVendedor(vendedor5);
				assertTrue(cadastrarVendedor5);
			
			}
			
			
	}

