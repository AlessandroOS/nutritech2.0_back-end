package com.alessandro.nutritech.bo.imc;

import java.math.BigDecimal;

public class ImcCalculator {

	private BigDecimal altura;
	private BigDecimal peso;

	public ImcCalculator(BigDecimal altura, BigDecimal peso) {
		this.altura = altura;
		this.peso = peso;
	}

	public Imc calculate() {
		Double imc = peso.doubleValue() / (altura.doubleValue() * altura.doubleValue());

		ImcStatus imcStatus = ImcStatus.find(imc);
		return new Imc(new BigDecimal(imc), imcStatus);
	}

}
