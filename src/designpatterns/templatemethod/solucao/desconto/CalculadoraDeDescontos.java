package designpatterns.templatemethod.solucao.desconto;

import java.math.BigDecimal;

import designpatterns.templatemethod.solucao.loja.Orcamento;

public class CalculadoraDeDescontos {
	
	public BigDecimal calcular(Orcamento orcamento) {
		Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
				new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
						new SemDesconto()));
		return desconto.calcular(orcamento);
	}

}
