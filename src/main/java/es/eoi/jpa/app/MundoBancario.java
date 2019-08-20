package es.eoi.jpa.app;

import es.eoi.jpa.entity.Banco;
import es.eoi.jpa.entity.Cliente;
import es.eoi.jpa.repository.BancoRepository;
import es.eoi.jpa.repository.ClienteRepository;

public class MundoBancario {

	public static void main(String[] args) {

		BancoRepository bancoRepository = new BancoRepository();
		ClienteRepository clienteRepository = new ClienteRepository();
		
//		if (bancoRepository.create(new Banco("Santander", "Santander")))
//			System.out.println("Correcto");
//		else
//			System.out.println("Error");

//		if (clienteRepository.create(new Cliente("456123789", "JuanMa", "C/ Ass")))
//			System.out.println("Correcto");
//		else
//			System.out.println("Error");

	}

}
