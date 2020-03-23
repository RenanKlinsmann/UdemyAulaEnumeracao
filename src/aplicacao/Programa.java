package aplicacao;

import java.util.Date;

import entidades.Pedido;
import entidades.enums.OrdemDosStatus;

public class Programa {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(1080, new Date(), OrdemDosStatus.PAGAMENTO_PENDENTE);
		
		System.out.println(pedido);
		
		OrdemDosStatus os1 = OrdemDosStatus.PROCESSAMENTO;
		OrdemDosStatus os2 = OrdemDosStatus.ENVIADO;
		OrdemDosStatus os3 = OrdemDosStatus.ENTREGUE;
		
		System.out.println(os1);
		System.out.println(os2);
		System.out.println(os3);
		
		

	}

}
