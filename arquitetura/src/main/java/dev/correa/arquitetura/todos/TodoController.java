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
	
	private TodoService todoService;
	
	public TodoController (TodoService todoService) {
		this.todoService = todoService;
	}
	
	@PostMapping
	public TodoEntity salvar (@RequestBody TodoEntity entity) {
		return todoService.salvar(entity);
	}
}
