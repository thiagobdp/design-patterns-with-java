package designpatterns.strategy.solucao.loja.imposto;

import java.math.BigDecimal;

import designpatterns.strategy.solucao.loja.Orcamento;

public class CalculadoraDeImpostos {

	public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
		return imposto.calcular(orcamento);
	}

}
