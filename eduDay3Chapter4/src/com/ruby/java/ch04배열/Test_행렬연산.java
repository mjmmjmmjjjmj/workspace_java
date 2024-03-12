package com.ruby.java.ch04배열;

import java.util.Random;

public class Test_행렬연산 {
		/*
		 * 하나의 자바 파일에서 함수 구현 실습
		 */
		
			/*
			 * 행렬 덧셈, 곱셈 연산 메소드 정의
			 * 1차버젼: 덧셈후 바로 출력
			 * 2차버젼: 덧셈후 return 값으로 결과 행렬 반환
			 */
			static void showMatrix(int [][]X) {
				//2차원 모습으로 출력
				for (int i = 0; i<X.length; i++) {
					for (int j = 0; j<X[0].length; j++) {
						System.out.print(X[i][j] + " ");
					}
				System.out.println();
			}
			}
			static void getData(int[][]B) {
				Random rand = new Random(); 
				for(int i = 0; i<B.length; i++) 
				for(int j = 0; j<B[0].length; j++) {
					B[i][j]=rand.nextInt(10);
				}
			}
			static int [][] addMatrix(int [][]B, int [][]C){
				// return 타입			parameter 변수타입을 int [][]로 지정해줘야 함
				int m[][];
				int r = B.length;//B행의 길이
				int c = B[0].length; //B열의 길이
				m = new int[r][c];
				for (int i = 0; i<r; i++)
					for (int j = 0; j<c; j++)
						m[i][j] = B[i][j]+C[i][j];
				return m;
			 	
			}
			static int [][] multiplyMatrix(int [][]B, int [][]E){
				int o[][];
				int p=B.length; //B행의 길이
				int q=B[0].length; //B열의 길이
				int r=E.length; //E행의 길이
				o = new int[p][q];
				for (int i = 0; i<p; i++)
					for (int j = 0; j<q; j++)
						for (int k = 0; k<r; k++)
						o[i][j] = B[i][j] * E[j][k];
				return o;
			}
			static int[][] transposeMatrix(int [][]B) {
			int x[][];
			int rows=B.length; //B 행의 길이
			int cols=B[0].length;//B 열의 길이
			x = new int[cols][rows];
			for(int i = 0; i<rows; i++)
				for(int j = 0; j<cols; j++)
					x[j][i]=B[i][j];		
			return x;
			}
			public static void main(String[] args) {
				/*
				 * 난수 생성으로 초기화
				 * A[3][4] = B[3][4] + C[3][4]; D[3][5] = B[3][4] * E[4][5];
				 * F[4][3] = B[3][4]의 전치 행렬
				 */
				Test_행렬연산 t1 = new Test_행렬연산();
				int[][]B = new int[3][4];
				int[][]C = new int[3][4];
				int[][]E = new int[4][5];

				System.out.println("행렬 더하기: A[3][4] = B[3][4] + C[3][4]");
				getData(B);getData(C);getData(E);
				System.out.println("행렬 B[3][4]");
				showMatrix(B);
				int [][]A = addMatrix(B, C);
				showMatrix(B);showMatrix(C);showMatrix(A);

				System.out.println("행렬 곱하기: D[3][5] = B[3][4] * E[4][5]");
				int [][]D = multiplyMatrix(B,E);
				showMatrix(B);showMatrix(E);showMatrix(D);

				System.out.println("행렬 전치: F[4][3] = B[3][4]의 전치 행렬");
				int [][]F = transposeMatrix(B);
				showMatrix(B);showMatrix(F);

			}
}
