package dev.correa.produto.controller;

import dev.correa.produto.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Bruno Miguel Correa
 * @email: devsistemascorrea@gmail.com
 * 30/12/2024
 **/

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	@PostMapping
	public void salvar(@RequestBody Produto produto) {
		System.out.println("Produto Salvo: " + produto);
	}
	
}
