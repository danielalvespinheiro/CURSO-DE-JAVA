package aula177_exercicio.model.service;

public interface OnlinePaymentService {

	Double paymentFee(Double amount);
	Double interest(Double amount, Integer month);
	
}
