package dev.correa.arquitetura.todos;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 07/01/2025
 **/

@RestController
@RequestMapping("/todos")
public class TodoController {
	
	private final TodoService todoService;
	private final TodoValidator validator;
	
	public TodoController (TodoService todoService, TodoValidator validator) {
		this.todoService = todoService;
		this.validator = validator;
	}
	
	@PostMapping
	public TodoEntity salvar (@RequestBody TodoEntity entity) {
		try {
			if (!validator.existeByDescricao(entity.getDescricao())) {
				return todoService.salvar(entity);
			}
		} catch (Exception e) {
			throw new RuntimeException(e.getMessage());
		}
		return null;
	}
}
