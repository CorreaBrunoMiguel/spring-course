package dev.correa.arquitetura.moontadora.api;

import dev.correa.arquitetura.moontadora.*;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 06/01/2025
 **/

@RestController
@RequestMapping("/api")
public class TesteFabricaController {
	
	private Motor motor;
	
	@PostMapping("/ligar")
	public CarroStatus ligarCarro (@RequestBody Chave chave) {
		var carro = new HondaHRV(motor);
		return carro.darIgnicao(chave);
	}
	
}
