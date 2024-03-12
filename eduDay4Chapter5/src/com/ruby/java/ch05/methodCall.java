package com.ruby.java.ch05;

public class methodCall {
	public static void main(String[] args) {
		
		System.out.println("1");
		System.out.println("2");
		
		//int num = takeoff();
		String num = takeoff(6, 7); //takeoff라는 메소드가 리턴하는 값을 num에 저장
		//long num = takeoff();
		//boolean num = takeoff();
		System.out.println(num);
		
		//System.out.println(takeoff());
		
		System.out.println("3");
		System.out.println("4");
		
		
	}
	//int, String, long, boolean, char
	//static num takeoff() {
	static String takeoff(int num1, int num2) {
	//static long takeoff() {
	//static boolean takeoff() {
	System.out.println("takeoff1");
		System.out.println("takeoff2");
		System.out.println("takeoff3");
	
		return num1 + " ===> " + num2;
	}
}
