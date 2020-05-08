package com.antriksh.LocalDate;

import java.time.*;

public class LocalDateTest2 {

	public static void main(String[] args) {
		DayOfWeek dayOfWeek = LocalDate.now().getDayOfWeek();
		System.out.println(dayOfWeek);
		System.out.println("***-------------------****");
		int dayOfMonth = LocalDate.now().getDayOfMonth();
		System.out.println(dayOfMonth);
		System.out.println("***-------------------****");
		LocalDate thisyear=LocalDate.now();
		System.out.println(thisyear.isLeapYear());
		System.out.println("***-------------------****");
		LocalDate thisyear1=LocalDate.now().minusYears(1);
		System.out.println(thisyear1.isLeapYear());
		System.out.println("Comparing the Two Date");
	}

}
