package com.ruby.java.ch02;

public class Test13 {
	public static void main(String[] args) {
		byte a = 0b00010001;
		byte b = 0b00100010;
		//byte d = (~a);
		int c = a ^ b;//00110011
		System.out.println(Integer.toBinaryString(c));
		int f = 12;
		int g = (~f) +1;//two's complement
		System.out.println("g="+g);
		int h = f << 1;//왼쪽으로 1비트 이동
	}
}
