package br.com.juliopereira.despesas.modelo;

import java.util.Calendar;

public class Despesa {
	
	private Long id;
	private String descricao;
	private boolean pago;
	private Calendar dataPagamento;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public boolean isPago() {
		return pago;
	}
	
	public void setPago(boolean pago) {
		this.pago = pago;
	}
	
	public Calendar getDataPagamento() {
		return dataPagamento;
	}
	
	public void setDataPagamento(Calendar dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
}
