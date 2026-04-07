package Aula173.model.service;

import java.time.Duration;

import Aula173.model.entities.CarRental;
import Aula173.model.entities.Invoice;

public class RentalService {

	private Double pricePerHour;
	private Double pricePerDay;
	
	private TaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		super();
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public void ProcessInvoice(CarRental carRental) {
		
		double minutes = Duration.between(carRental.getStart(), carRental.getFinish()).toMinutes();		
		double hours = minutes / 60.0;
		
		double basicPayment;
		if (hours <= 12.0) {
			basicPayment = pricePerHour * Math.ceil(hours);
		}
		else {
			basicPayment = pricePerDay * Math.ceil(hours / 24);
		}
		
		double tax = taxService.Tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public void setTaxService(BrazilTaxService taxService) {
		this.taxService = taxService;
	}
	
}
