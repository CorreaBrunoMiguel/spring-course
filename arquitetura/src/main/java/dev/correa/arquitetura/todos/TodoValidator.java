package dev.correa.arquitetura.todos;

import org.springframework.stereotype.Component;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 08/01/2025
 **/

@Component
public class TodoValidator {
	
	private final TodoRepository todoRepository;
	
	public TodoValidator (TodoRepository todoRepository) {
		this.todoRepository = todoRepository;
	}
	
	public void validarTodo (TodoEntity todoEntity) {
		if (existeByDescricao(todoEntity.getDescricao())) {
			throw new IllegalArgumentException("TODO com descriçao: " + todoEntity.getDescricao() + " ja cadastrado.");
		}
	}
	
	public boolean existeByDescricao (String descricao) {
		return todoRepository.existsByDescricao(descricao);
	}
}
