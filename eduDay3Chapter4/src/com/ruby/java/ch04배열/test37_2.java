package com.ruby.java.ch04배열;
public class test37_2 {
	public static void main(String[] args) {
		int[] score = {90, 85, 78, 100, 98};
		int sum = 0; //총점
		double avg = 0.0; //평균
		int max = 0; //최댓값
		int min = 999; //최솟값
		
		for(int i = 0; i < score.length; i++) {
		sum += score[i];
		if(max < score[i])
			max = score[i];
		
		}
		}
	}
}
