package aula177_exercicio.model.service;

import java.time.LocalDate;
import aula177_exercicio.model.entities.Contract;
import aula177_exercicio.model.entities.Installment;

public class ContractService {

	private OnlinePaymentService onlinePaymentService;

	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract ct, int month) {
		// amount
		Double basicQuota = ct.getTotalValue() / month;
		
		for(int i=1; i<=month; i++) {
			
			LocalDate dueDate = ct.getDate().plusMonths(i);
			
			Double interest = onlinePaymentService.interest(basicQuota, i);
			Double fee = onlinePaymentService.paymentFee(basicQuota + interest);
			Double quota = basicQuota + interest + fee;
			
			ct.getInstallment().add(new Installment(dueDate, quota));
		}
		
		
	};
	
}
