package dev.correa.produto.controller;

import dev.correa.produto.model.Produto;
import dev.correa.produto.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author: Bruno Miguel Correa
 * @email: devsistemascorrea@gmail.com
 * 30/12/2024
 **/

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@PostMapping
	public void salvar(@RequestBody Produto produto) {
		System.out.println("Produto Salvo: " + produto);
		
		var id  = UUID.randomUUID().toString();
		produto.setId(id);
		
		produtoRepository.save(produto);
	}
	
}
