package com.udemy.section26;

import java.util.Date;

public class Video261 {

	public static void main(String[] args) {
		System.out.println("Video 261");
		System.out.println(System.currentTimeMillis()/1000/60/60/24/365);
		System.out.println(Long.MAX_VALUE);
		
		Date d = new Date();
		@SuppressWarnings("deprecation")
		Date d1 = new Date("1/1/1980");
		System.out.println(d);
		System.out.println(d1);
		System.out.println(d.toLocaleString().replace(",", ""));
		
	}

}
