package com.paulo.os.api.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.paulo.os.api.domain.model.Cliente;

@RestController
public class ClienteController {

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		
		Cliente cliente1 = new Cliente();
		cliente1.setId(1L);
		cliente1.setName("Paulo H.");
		cliente1.setTelefone("11 99999-9999");
		cliente1.setEmail("paulo@email.com");
		
		Cliente cliente2 = new Cliente();
		cliente2.setId(2L);
		cliente2.setName("Lili");
		cliente2.setTelefone("11 99999-1111");
		cliente2.setEmail("lili@email.com");
		
		return Arrays.asList(cliente1, cliente2);
	}
}
