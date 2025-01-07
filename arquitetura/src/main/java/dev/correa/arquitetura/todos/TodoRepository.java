package dev.correa.arquitetura.todos;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 07/01/2025
 **/

public interface TodoRepository extends JpaRepository<TodoEntity, Integer> {
}
