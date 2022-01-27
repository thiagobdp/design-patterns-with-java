package designpatterns.state.solucao.loja;

import java.math.BigDecimal;

import designpatterns.state.solucao.loja.orcamento.Orcamento;

public class TestesDescontos {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(new BigDecimal("200"), 6);

		System.out.println("valor original: "+orcamento.getValor());
		orcamento.aplicarDescontoExtra();
		System.out.println("situacao o orcamento: '"+orcamento.getSituacao().getClass().getSimpleName()+"'. Valor com desconto extra: "+orcamento.getValor());
		orcamento.aprovar();
		orcamento.aplicarDescontoExtra();
		System.out.println("situacao o orcamento: '"+orcamento.getSituacao().getClass().getSimpleName()+"'. Valor com desconto extra: "+orcamento.getValor());
		orcamento.finalizar();
		System.out.println("situacao o orcamento: '"+orcamento.getSituacao().getClass().getSimpleName()+"'.");
		System.out.println("Agora vai lançar exceção de exemplo");
		orcamento.reprovar();
	}

}
