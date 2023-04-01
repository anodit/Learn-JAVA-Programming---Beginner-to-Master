package com.udemy.section24;

import java.util.ArrayList;

public class GenericDemo<T> {
	
	T data[] = (T[])new Object[3];
	public static void main(String[] args) {
//		Object obj = new String("Hi");
//		System.out.println(obj);
//		//obj = new Integer(10);
//		String str = (String)obj;
//		
//		Object ob[] = new Object[3];
//		ob[0] = "hi";
//		ob[1] = "hellow";
//		ob[2] = new Integer(10);
//		System.out.println(ob);
//		String str1;
//		for(int i=0;i<3;i++) {
//			str1 = (String)ob[i];
//			System.out.println(str1);
//		}
		
		GenericDemo<String> gd = new GenericDemo(); 
		gd.data[0] = "hi";
		gd.data[0] = "buy";
		gd.data[0] = "mohit";
		
	}
}
