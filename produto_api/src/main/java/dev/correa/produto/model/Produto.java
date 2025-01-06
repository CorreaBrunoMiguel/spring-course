package dev.correa.produto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

/**
 * Autor: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 30/12/2024
 **/

@Entity
public class Produto {
	
	@Id
	@Column(name = "id")
	private String id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "preco")
	private double preco;
	
	@Override
	public String toString () {
		return "Produto{" +
				"id='" + id + '\'' +
				", nome='" + nome + '\'' +
				", descricao='" + descricao + '\'' +
				", preco=" + preco +
				'}';
	}
	
	public String getId () {
		return id;
	}
	
	public void setId (String id) {
		this.id = id;
	}
	
	public String getNome () {
		return nome;
	}
	
	public void setNome (String nome) {
		this.nome = nome;
	}
	
	public String getDescricao () {
		return descricao;
	}
	
	public void setDescricao (String descricao) {
		this.descricao = descricao;
	}
	
	public double getPreco () {
		return preco;
	}
	
	public void setPreco (double preco) {
		this.preco = preco;
	}
}
