package com.viniciuslisboa.cadastrodeprodutos.business.bean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean(name = "produto")
public class produtoBean {
	
	private String nome;
	private String categoria;
	private Float preco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getcategoria() {
		return categoria;
	}

	public void setcategoria(String categoria) {
		this.categoria = categoria;
	}

	public Float getpreco() {
		return preco;
	}

	public void setpreco(Float preco) {
		this.preco = preco;
	}

}
