package com.antriksh.LocalDate;

/*LocalDate is immutable class and it is threadSafe*/
import java.time.*;
import java.time.temporal.ChronoUnit;

public class LocalDateTest {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		System.out.println("***------------------------***");
		Clock clock = Clock.systemDefaultZone();
		LocalDate localDate1 = LocalDate.now(clock);
		System.out.println(localDate1);
		System.out.println("***------------------------***");
		ZoneId id = ZoneId.of("Europe/Paris");
		LocalDate localDate2 = LocalDate.now(id);
		System.out.println(localDate2);
		System.out.println("***------------------------***");
		LocalDate date = LocalDate.of(2020, 05, 07);
		System.out.println(date);
		System.out.println("***------------------------***");
		LocalDate date1 = LocalDate.parse("2020-05-07");
		System.out.println(date1);
		System.out.println("***------------------------***");
		LocalDate date2 = date1.plusDays(5);
		System.out.println(date2);
		System.out.println("***------------------------***");
		LocalDate date3 = date1.minus(2, ChronoUnit.DAYS);
		System.out.println(date3);

	}

}
