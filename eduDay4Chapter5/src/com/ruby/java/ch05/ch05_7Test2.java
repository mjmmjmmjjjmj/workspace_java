package com.ruby.java.ch05;

public class ch05_7Test2 {
	static void test(String name, int... v) {
		System.out.print(name+" : ");
		for(int x : v)
			System.out.print(x+" ");
		System.out.println();
	}
	
	public static void main(String[] args) {
		test("오정임", 98, 85, 88);
		test("김푸름", 98, 95, 92);
		test("김하늘", 88, 98, 95);
	}
}
