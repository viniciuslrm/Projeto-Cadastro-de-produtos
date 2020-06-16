package com.viniciuslisboa.cadastrodeprodutos.business.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@SessionScoped
@ManagedBean(name = "produtos")
public class produtosBean {
	private List<produtoBean> produtos;
	private produtoBean produtoSelecionado;

	public produtosBean() {
		produtos = new ArrayList<>();
		produtoSelecionado = new produtoBean();
	}

	public List<produtoBean> getprodutos() {
		return produtos;
	}

	public void adicionar(produtoBean produto) {
		produtos.add(produto);
	}

	public void remover(produtoBean produto) {
		produtos.remove(produto);
	}

	public String selecionar(produtoBean produto) {
		produtoSelecionado = produto;
		
		
		return "detalhe";
	}

	public produtoBean getprodutoSelecionado() {
		return produtoSelecionado;
	}
}
