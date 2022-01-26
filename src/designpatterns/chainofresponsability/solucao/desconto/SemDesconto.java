package designpatterns.chainofresponsability.solucao.desconto;

import java.math.BigDecimal;

import designpatterns.chainofresponsability.solucao.loja.Orcamento;

public class SemDesconto extends Desconto {
	
	public SemDesconto() {
		super(null);
	}

	public BigDecimal calcular(Orcamento orcamento) {
		return BigDecimal.ZERO;
	}

}
