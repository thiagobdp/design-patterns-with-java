package designpatterns.strategy.solucao.loja.imposto;

import java.math.BigDecimal;

import designpatterns.strategy.solucao.loja.Orcamento;

public class ISS implements Imposto{
	
	public BigDecimal calcular(Orcamento orcamento) {
		return orcamento.getValor().multiply(new BigDecimal("0.06"));
	}

}
