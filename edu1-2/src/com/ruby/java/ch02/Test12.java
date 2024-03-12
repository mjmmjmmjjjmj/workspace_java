package com.ruby.java.ch02;

public class Test12 {
	public static void main(String[] args) {
		int a = 017;//8진법
		int b = 0xf;//16진법
		System.out.println("a=" + b + ", b=" + b);
		String hexa = Integer.toHexString(b);
		System.out.println("hexa=" +hexa);
	}
}
