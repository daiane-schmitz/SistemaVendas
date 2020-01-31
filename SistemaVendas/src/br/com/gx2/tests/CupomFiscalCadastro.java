package br.com.gx2.tests;

import java.util.Date;

import org.junit.Test;

import br.com.gx2.entity.Cliente;
import br.com.gx2.entity.CupomFiscal;
import br.com.gx2.entity.Loja;
import br.com.gx2.entity.Vendedor;
import br.com.gx2.service.CupomFiscalService;
import br.com.gx2.service.ServiceFactory;

public class CupomFiscalCadastro {

	
			@Test
			
			public void setUp() {
				
				
				//Cenário
				CupomFiscalService service = ServiceFactory.createCupomFiscalService();
				Date data = new Date();

				Loja loja1 = new Loja(1, "Americanas");
				Loja loja2 = new Loja(2, "Dell");
				Loja loja3 = new Loja(3, "Apple");
				Loja loja4 = new Loja(4, "Ponto Frio");
				Loja loja5 = new Loja(5, "Magazine Luiza");
				
				
				Cliente cliente1 = new Cliente(1, "Alice Rita Gomes", "45958384090");
				Cliente cliente2 = new Cliente(2, "Matheus Vicente Nunes", "92565269056" );
				Cliente cliente3 = new Cliente(3, "Caleb Rafael Almada", "89282417077");
				Cliente cliente4 = new Cliente(4, "Carla Isabel Nogueira", "68924631004");
				Cliente cliente5 = new Cliente(5, "Nicolas Paulo Porto", "70596919018");
				
				
				Vendedor vendedor1 = new Vendedor(1, "123", "Maria Silva");
				Vendedor vendedor2 = new Vendedor(2, "321", "José Sauro" );
				Vendedor vendedor3 = new Vendedor(3, "456", "Carlos Augustio");
				Vendedor vendedor4 = new Vendedor(4, "654", "Felipe Silveira");
				Vendedor vendedor5 = new Vendedor(5, "789", "Alexandre Lentilha");

				
				CupomFiscal cupomFiscal1 = new CupomFiscal(1, 800.0, data, loja1, cliente1, vendedor1);
				CupomFiscal cupomFiscal2 = new CupomFiscal(2, 2400.0, data, loja2, cliente2, vendedor2);
				CupomFiscal cupomFiscal3 = new CupomFiscal(3, 1600.0, data, loja3, cliente3, vendedor3);
				CupomFiscal cupomFiscal4 = new CupomFiscal(4, 1200.0, data, loja4, cliente4, vendedor4);
				CupomFiscal cupomFiscal5 = new CupomFiscal(5, 600.0, data, loja5, cliente5, vendedor5);
				
				service.cadastrarCupomFiscal(cupomFiscal1);
				service.cadastrarCupomFiscal(cupomFiscal2);
				service.cadastrarCupomFiscal(cupomFiscal3);
				service.cadastrarCupomFiscal(cupomFiscal4);
				service.cadastrarCupomFiscal(cupomFiscal5);
				
			}
			
	}

