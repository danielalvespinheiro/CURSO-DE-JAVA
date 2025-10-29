package AULASDAUDEMI;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Aula114 {

	public static void main(String[] args) {

		LocalDate d04 = LocalDate.parse("2025-09-22");
		LocalDateTime d05 = LocalDateTime.parse("2025-09-22T06:05:01");
		Instant d06 = Instant.parse("2025-09-20T01:30:50Z");
		
		LocalDate semanaPassada = d04.minusDays(7);
		LocalDate semanaQueVem = d04.plusDays(7);
		
		System.out.println("Semana passada = " + semanaPassada);
		System.out.println("Semana que vem = " + semanaQueVem);
		
		System.out.println();
		
		LocalDateTime semanaPassadaTime = d05.minusDays(7);
		LocalDateTime semanaQueVemTime = d05.plusDays(7);
		
		System.out.println("Semana passada time = " + semanaPassadaTime);
		System.out.println("Semana que vem time = " + semanaQueVemTime);
		
		System.out.println();
		
		Instant semanaPassadaInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant semanaQueVemInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("Semana passada instant = " + semanaPassadaInstant);
		System.out.println("Semana que vem instant = " + semanaQueVemInstant);
		
		System.out.println();	
												// Duas formas de converter para local date
		Duration d1 = Duration.between(semanaPassada.atTime(0, 0), d04.atStartOfDay());
		Duration d2 = Duration.between(semanaPassadaTime, d05);
		Duration d3 = Duration.between(semanaPassadaInstant, d06);
		Duration d4 = Duration.between(d06, semanaPassadaInstant);
		
		System.out.println("d1 = " + d1.toDays());
		System.out.println("d2 = " + d2.toDays());
		System.out.println("d3 = " + d3.toDays());
		System.out.println("d4 invertido = " + d4.toDays());
	
	}

}
