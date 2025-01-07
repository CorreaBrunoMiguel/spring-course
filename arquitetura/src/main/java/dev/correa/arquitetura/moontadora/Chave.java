package dev.correa.arquitetura.moontadora;

/**
 * Author: Bruno Miguel Correa
 * Email: devsistemascorrea@gmail.com
 * Data: 06/01/2025
 **/

public class Chave {
	private Montadora montadora;
	private String tipo;
	
	public Montadora getMontadora () {
		return montadora;
	}
	
	public void setMontadora (Montadora montadora) {
		this.montadora = montadora;
	}
	
	public String getTipo () {
		return tipo;
	}
	
	public void setTipo (String tipo) {
		this.tipo = tipo;
	}
}
