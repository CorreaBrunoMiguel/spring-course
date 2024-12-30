package dev.correa.produto.model;

import lombok.Getter;
import lombok.Setter;

/**
 @author: Bruno Miguel Correa
 @email: devsistemascorrea@gmail.com
 30/12/2024
 **/

// POJO - PlainOld Java Object
public class Produto {
	
	private String id;
	private String nome;
	private String descricao;
	private double preco;
	private int quantidade;
	
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
	
	public int getQuantidade () {
		return quantidade;
	}
	
	public void setQuantidade (int quantidade) {
		this.quantidade = quantidade;
	}
	
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
