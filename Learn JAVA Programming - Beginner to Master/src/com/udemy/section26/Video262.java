package com.udemy.section26;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Video262 {

	public static void main(String[] args) {
		System.out.println("Video 262");
		GregorianCalendar gc = new GregorianCalendar();
		System.out.println(gc);
		System.out.println(gc.get(Calendar.DAY_OF_YEAR));
		TimeZone tz  = gc.getTimeZone();
		System.out.println(tz.getDisplayName());
	}

}
