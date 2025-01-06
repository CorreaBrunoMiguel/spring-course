package dev.correa.produto.controller;

import dev.correa.produto.model.Produto;
import dev.correa.produto.repository.ProdutoRepository;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
	
	@DeleteMapping("/{id}")
	public void remover(@PathVariable String id) {
		produtoRepository.deleteById(id);
	}
	
	@PutMapping("/{id}")
	public void atualizar(@PathVariable String id, @RequestBody Produto produto) {
		produto.setId(id);
		produtoRepository.save(produto);
	}
	
	@GetMapping
	public List<Produto> listar(@RequestParam String nome) {
		return produtoRepository.findByNome(nome);
	}
}
