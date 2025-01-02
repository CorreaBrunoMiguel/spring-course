package dev.correa.produto.repository;

import dev.correa.produto.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 31/12/2024
 **/

public interface ProdutoRepository extends JpaRepository<Produto, String> {
}
