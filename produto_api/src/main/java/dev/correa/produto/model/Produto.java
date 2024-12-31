package dev.correa.produto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;

/**
 * Autor: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 30/12/2024
 **/

@Setter
@Getter
@Entity
public class Produto {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	private String id;
	
	private String nome;
	private String descricao;
	private double preco;
	private int quantidade;
	
	@Override
	public String toString () {
		return "Produto{" +
				"id='" + id + '\'' +
				", nome='" + nome + '\'' +
				", descricao='" + descricao + '\'' +
				", preco=" + preco +
				", quantidade=" + quantidade +
				'}';
	}
}
