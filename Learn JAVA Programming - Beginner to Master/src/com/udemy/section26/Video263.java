package com.udemy.section26;

import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class Video263 {

	public static void main(String[] args) {
		System.out.println("Video 263");
		//Joda Time API
		Date d = new Date();
		d.setHours(21); // It is mutable
		System.out.println(d);
		
//		LocalDate dt = LocalDate.now();
//		System.out.println(dt);
		LocalDate dt = LocalDate.of(2022, 04, 22);
		dt = dt.plusYears(1); // It is immutable
		System.out.println(dt);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
	}

}
