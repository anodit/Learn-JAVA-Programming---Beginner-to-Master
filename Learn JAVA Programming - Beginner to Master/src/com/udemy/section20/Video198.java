package com.udemy.section20;

public class Video198 {

	public static void main(String[] args) {
		Object o1 = new Object();
		Object o2 = new Object();
		Object o3 =  o1;
		System.out.println(o1);
		System.out.println(o1.toString());
		System.out.println(o1.equals(o2));
		System.out.println(o1.equals(o3));
		System.out.println(o1.hashCode());
		System.out.println(o2.hashCode());
		System.out.println(o3.hashCode());
		
	}

}

//Output
//java.lang.Object@7344699f
//java.lang.Object@7344699f
//false
//true
//1933863327
//112810359
//1933863327

