package AULASDAUDEMI;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Aula111 {

	public static void main(String[] args) {
		DateTimeFormatter fmt01 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt02 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt03 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt04 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt05 = DateTimeFormatter.ISO_INSTANT;
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2025-09-19");
		LocalDateTime d05 = LocalDateTime.parse("2025-09-19T06:05:01.4233");
		Instant d06 = Instant.parse("2025-09-19T06:05:01.4233Z");
		Instant d07 = Instant.parse("2025-09-19T06:05:01.4233-03:00");
		
		LocalDate d08 = LocalDate.parse("12/12/2012", fmt01);
		LocalDateTime d09 = LocalDateTime.parse("12/12/2012 01:45", fmt02);
		
		LocalDate d10 = LocalDate.of(2025, 12, 22);
		LocalDateTime d11 = LocalDateTime.of(2025, 12, 22, 01, 43);
		
		System.out.println("d01 = " + d01);
		System.out.println("d02 = " + d02);
		System.out.println("d03 = " + d03);
		System.out.println("d04 = " + d04);
		System.out.println("d05  = " + d05);
		System.out.println("d06  = " + d06);
		System.out.println("d07  = " + d07);
		System.out.println("d08  = " + d08);
		System.out.println("d09  = " + d09);
		System.out.println("d10  = " + d10);
		System.out.println("d11  = " + d11);
		System.out.println("d05 = " + fmt03.format(d05));
		System.out.println("d05 = " + fmt04.format(d05));
		System.out.println("d05 = " + fmt05.format(d06));
		
	}

}
