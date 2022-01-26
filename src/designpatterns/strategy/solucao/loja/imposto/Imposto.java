package designpatterns.strategy.solucao.loja.imposto;

import java.math.BigDecimal;

import designpatterns.strategy.solucao.loja.Orcamento;

public interface Imposto {

	BigDecimal calcular(Orcamento orcamento);

}
