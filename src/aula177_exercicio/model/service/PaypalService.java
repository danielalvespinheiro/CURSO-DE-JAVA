package aula177_exercicio.model.service;

public class PaypalService implements OnlinePaymentService{

	// Taxa de pagamento
	@Override
	public Double paymentFee(Double amount) {
		return amount * 0.02;
	}

	// Juros ou Juros simples mensal
	@Override
	public Double interest(Double amount, Integer month) {
		
		return amount * 0.01 * month;
	}

}
