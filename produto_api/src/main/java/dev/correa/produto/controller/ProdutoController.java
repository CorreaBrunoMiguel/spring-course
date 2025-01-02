package dev.correa.produto.controller;

import dev.correa.produto.model.Produto;
import dev.correa.produto.repository.ProdutoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;
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
	public Produto salvar(@RequestBody Produto produto) {
		
		var id  = UUID.randomUUID().toString();
		produto.setId(id);
		
		produtoRepository.save(produto);
		return produto;
	}
	
	@GetMapping("/{id}")
	public Produto buscarPorId(@PathVariable String id) {
		return produtoRepository.findById(id).orElse(null);
	}
	
}
