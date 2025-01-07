package dev.correa.arquitetura.todos;

import org.springframework.stereotype.Service;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 07/01/2025
 **/

@Service
public class TodoService {
	
	private final TodoRepository todoRepository;
	
	public TodoService(TodoRepository todoRepository){
		this.todoRepository = todoRepository;
	}
	
	public TodoEntity salvar(TodoEntity novoTodo){
		return todoRepository.save(novoTodo);
	}
}
