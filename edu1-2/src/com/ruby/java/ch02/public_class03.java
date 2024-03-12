package com.ruby.java.ch02;

public class public_class03 {
	public static void main(String[] arrgs) {
		float exchangeRate = (float)1236.50;//type casting
		String st = "Good Day! How are you OK? ";
		int num = 2147483647;
		int numSize = Integer.SIZE;
		System.out.println("numSize= "+ numSize);

		long d = 2147483648l;//8byte면 충분한데 
		//d 변수가 8바이트인지 확인 방법은? 
		int dSize = Long.SIZE;
		System.out.println("dSize= "+ dSize);
	}
}
