package com.alessandro.nutritech.bo.imc;

import java.math.BigDecimal;

public class Imc {

	private BigDecimal valor;
	private ImcStatus status;

	public Imc(BigDecimal valor, ImcStatus status) {
		this.valor = valor;
		this.status = status;
	}

	public BigDecimal getValue() {
		return valor;
	}

	public ImcStatus getStatus() {
		return status;
	}

	public String getDescricao() {
		return status.getDESCRICAO();
	}

}
