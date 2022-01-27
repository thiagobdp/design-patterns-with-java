package designpatterns.state.solucao.loja.orcamento.situacao;

import java.math.BigDecimal;

import designpatterns.state.solucao.loja.DomainException;
import designpatterns.state.solucao.loja.orcamento.Orcamento;

public class Finalizado extends SituacaoOrcamento {

	@Override
	public BigDecimal calcularDescontoExtra(Orcamento orcamento) {
		throw new DomainException("Orcamento finalizado nao pode ter desconto extra!");
	}

}
