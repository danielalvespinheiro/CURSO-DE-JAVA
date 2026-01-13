package AULA153_exercicio.boa.model;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import AULA153_exercicio.boa.model.exception.DomainException;

public class Reservation {
	private int roomNumber;
	private Date checkIn;
	private Date checkOut;
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Reservation() {}
	
	public Reservation(int roomNumber, Date checkIn, Date checkOut) {
		// Técnica de programação defensiva
		if(!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date ");
		} 
		
		this.roomNumber = roomNumber;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}
	
	public long duration() {
		long diff = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
	}
	
	public void updateDates(Date checkIn, Date checkOut) {
		
		Date now = new Date();
		if(checkIn.before(now) || checkOut.before(now)) {
			throw new DomainException("Error in reservation: Reservation dates for update must be future dates ");
			
		} if(!checkOut.after(checkIn)) {
			throw new DomainException("Check-out date must be after check-in date ");
		} 
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public int getRoomNumber() {
		return roomNumber;
	}

	public void setRoomNumber(int roomNumber) {
		this.roomNumber = roomNumber;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}
	
	@Override
	public String toString() {
		return "Room " 
			+ roomNumber
			+ ", checkIn "
			+ sdf.format(checkIn)
			+ ", checkOut "
			+ sdf.format(checkOut)
			+ ", "
			+ duration()
			+ " nights";
	}
	
}
