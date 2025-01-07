package dev.correa.arquitetura.todos;

import jakarta.persistence.*;

import static jakarta.persistence.GenerationType.IDENTITY;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 07/01/2025
 **/

@Entity
@Table(name = "tb_todo")
public class TodoEntity {
	
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id")
	private Integer id;
	
	@Column(name = "descricao")
	private String descricao;
	
	@Column(name = "fl_status")
	private Boolean status;
	
	
	public Integer getId () {
		return id;
	}
	
	public void setId (Integer id) {
		this.id = id;
	}
	
	public String getDescricao () {
		return descricao;
	}
	
	public void setDescricao (String descricao) {
		this.descricao = descricao;
	}
	
	public Boolean getStatus () {
		return status;
	}
	
	public void setStatus (Boolean status) {
		this.status = status;
	}
}
