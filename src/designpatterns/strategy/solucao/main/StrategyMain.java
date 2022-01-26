package designpatterns.strategy.solucao.main;

import java.math.BigDecimal;

import designpatterns.strategy.solucao.loja.Orcamento;
import designpatterns.strategy.solucao.loja.imposto.CalculadoraDeImpostos;
import designpatterns.strategy.solucao.loja.imposto.ICMS;
import designpatterns.strategy.solucao.loja.imposto.ISS;

public class StrategyMain {

	public static void main(String[] args) {
		Orcamento o = new Orcamento(BigDecimal.valueOf(10.0));
		CalculadoraDeImpostos calc = new CalculadoraDeImpostos();
		System.out.println("valor ICMS:"+calc.calcular(o, new ICMS()));
		System.out.println("valor ISS:"+calc.calcular(o, new ISS()));
	}
}
