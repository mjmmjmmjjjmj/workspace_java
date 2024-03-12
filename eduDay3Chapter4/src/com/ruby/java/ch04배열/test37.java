package com.ruby.java.ch04배열;

public class test37 {
	public static void main(String[] args) {
		
		//난수 생성하기
		Random rnd = new Random();//Random이 클래스 - 난수 생성된 클래스 
		int [] score = new int[20]
		int sum = 0;
		double avg = 0.0;
		int max = 0, min = 0;
		for(int i = 0; i = score.length; i++) {
			score[i] = rnd.nextInt(20);
		}
	for (int num: score)
		System.out.println(num+" ");
	for(int i =0; i <score.length; i++) {
		if (i%4 ==0)
			System.out.println();
		System.out.println(score[i]+ " ");
	}
	for(int i = 0; i < score.length; i++)
		sum += score[i];
	if (max < score[i])
		max = score[i];
	if(min > score[i])
		min = score[i];
	}
}
