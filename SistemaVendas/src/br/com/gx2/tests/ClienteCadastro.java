package br.com.gx2.tests;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;

import br.com.gx2.entity.Cliente;
import br.com.gx2.service.ClienteService;
import br.com.gx2.service.ServiceFactory;

public class ClienteCadastro {

	
			@Test
			
			public void setUp() {
				
				//Cenário
				ClienteService service = ServiceFactory.createClienteService();

				
				Cliente cliente1 = new Cliente(1, "Alice Rita Gomes", "45958384090");
				Cliente cliente2 = new Cliente(2, "Matheus Vicente Nunes", "92565269056" );
				Cliente cliente3 = new Cliente(3, "Caleb Rafael Almada", "89282417077");
				Cliente cliente4 = new Cliente(4, "Carla Isabel Nogueira", "68924631004");
				Cliente cliente5 = new Cliente(5, "Nicolas Paulo Porto", "70596919018");
				
				service.cadastrarCliente(cliente1);
				service.cadastrarCliente(cliente2);
				service.cadastrarCliente(cliente3);
				service.cadastrarCliente(cliente4);
				service.cadastrarCliente(cliente5);

				
			boolean cadastrarCliente1 = service.cadastrarCliente(cliente1);
			assertTrue(cadastrarCliente1);
			boolean cadastrarCliente2 = service.cadastrarCliente(cliente2);
			assertTrue(cadastrarCliente2);
			boolean cadastrarCliente3 = service.cadastrarCliente(cliente3);
			assertTrue(cadastrarCliente3);
			boolean cadastrarCliente4 = service.cadastrarCliente(cliente4);
			assertTrue(cadastrarCliente4);
			boolean cadastrarCliente5 = service.cadastrarCliente(cliente5);
			assertTrue(cadastrarCliente5);
			
			}
	}

