package aula_123.entities;

import java.util.Date;

public class HourContract {
	private Date date;
	private Double valuePerHour;
	private Integer hour;

	public HourContract() {}
	
	public HourContract(Date date, double valuePerHour, Integer hour) {
		this.date = date;
		this.valuePerHour = valuePerHour;
		this.hour = hour;
	}

	public double totalValue() {
		return valuePerHour * hour;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}
	
}
