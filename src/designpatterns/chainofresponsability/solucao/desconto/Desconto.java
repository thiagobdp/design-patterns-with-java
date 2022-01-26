package designpatterns.chainofresponsability.solucao.desconto;

import java.math.BigDecimal;

import designpatterns.chainofresponsability.solucao.loja.Orcamento;

public abstract class Desconto {

	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}

	public abstract BigDecimal calcular(Orcamento orcamento);

}
