package com.alessandro.nutritech.bo.gastoenergetico;

import com.alessandro.nutritech.domain.enumaration.Genero;

import java.math.BigDecimal;

public class GastoEnergeticoCalculator {

    private BigDecimal altura;
    private BigDecimal peso;
    private Integer idade;
    private Genero genero;

    public GastoEnergeticoCalculator(BigDecimal altura, BigDecimal peso, Integer idade, Genero genero) {
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;
        this.genero = genero;
    }

    public Double execute() {
        if (Genero.MASCULINO.equals(this.genero)) {
            Double resultado = 66 + (13.7 * peso.doubleValue()) + (5.0 * altura.doubleValue()) - (6.8 * idade);

            return resultado;
        }
        return 665 + (9.6 * peso.doubleValue()) + (1.8 * altura.doubleValue()) - (4.7 * idade);
    }

}
