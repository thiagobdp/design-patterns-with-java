package designpatterns.commandhandler.solucao.loja;

import java.math.BigDecimal;

import designpatterns.commandhandler.solucao.loja.pedido.GeraPedido;
import designpatterns.commandhandler.solucao.loja.pedido.GeraPedidoHandler;


public class TestesPedidos {

	public static void main(String[] args) {
		String cliente = "Ana da Silva";
		BigDecimal valorOrcamento = new BigDecimal("745.99");
		int quantidadeItens = 3;
		
		GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, quantidadeItens);
		GeraPedidoHandler handler = new GeraPedidoHandler();
		handler.executar(gerador);
	}

}
