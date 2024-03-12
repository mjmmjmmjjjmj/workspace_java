package com.ruby.java.ch04배열;

public class test35 {
	public static void main(String[] args) {
		String []st = {"apple", "banana", "peach", "pineapple"};
		int[] arr = {1, 2, 3, 4, 5};
		int j;int sum=0;
		for (int i = 0; i < 3; i++) {
			System.out.println(arr[i]);
			sum += i;
		}
			for (String stx: st)
			System.out.println(stx);
		for(int num : arr) {//위에 for(int i=0; i<3; i++)보다 간결한 코딩 - 배열원소 전부 출력 + 인덱스 사용이 필요하지 않을 때 
			System.out.println(num);
		}
	}
}
