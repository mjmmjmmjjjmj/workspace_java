package com.ruby.java.ch08.innerClass;

class OuterClass {
	class InstanceClass {
		int a;
		void method2() {
			System.out.println("Instance Class : "+a);
		}
	}
	static class Statistics {
		int b;
		void method3() {
			System.out.println("Static Class: "+ b);
		}
		static void method() {
			System.out.println("Static Class: " + c);
		}
		
	}
}

public class OuterClassTest {
	public static void main(String[] args) {
		Outerclass outer = new OuterClass();
		OuterClass.InstanceClass inner01 = outer.new InstanceClass();
		//outer.InstanceClass inner02 = outer.new InstanceClass);
		inner01.a = 123;
		inner01.method2();
		OuterClass.StaticClass inner02 = new OuterClass.StaticClass();
		OuterClass.StaticClass.c=789;
		OuterClass.StaticClass.method4();
	}
}
//클래스가 선언된 패키지 내에서느 ㄴ접근 가능하다