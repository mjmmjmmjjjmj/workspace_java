package com.ruby.java.ch05;

import java.util.Random;

/*
	 * 클래스 메소드 구현 실습 목적
	 */
	class Matrix {
		int rows;
		int cols;
		int[] data;
		public Matrix(int rows, int cols) {
			this.rows = rows; 
			this.cols = cols;
			data = new int[rows * cols];
		}
		void getData() {
			// 난수로 입력 : 한 거임 손댈필요 x
			Random rand = new Random();
			for (int i = 0; i<rows*cols; i++) {
				data[i] = rand.nextInt(100);
			}
		}
		Matrix addMatrix(Matrix b) {//Matrix b=new Matrix[3][4]
			Matrix m = new Matrix(this.rows, this.cols);
				for(int i=0; i<this.cols; i++)
				m.data[i]=this.data[i]+b.data[i];
			return m;
			
			//Matrix m = new int[this.rows][b.cols];
			//for (int i = 0; i<rows; i++)
				//for(int j = 0; j<cols; j++)
			//return m; -> 틀린 풀이과정 m.data[i]=this.data[i]+b.data[i];이게 없음
		}
		Matrix multiplyMatrix(Matrix b) {//D[3][5] = B[3][4] * E[4][5]
			// 새로운 행렬 d 생성
		    // 행의 크기는 현재 행렬의 행의 수(rows)와 인자로 전달된 행렬 b의 열의 수(b.cols)와 같음
		    // 열의 크기는 현재 행렬의 열의 수(cols)와 인자로 전달된 행렬 b의 행의 수(b.rows)와 같음
			Matrix d = new Matrix(this.rows, b.cols);
			// 행렬 곱셈 연산 수행
			for (int i=0; i<this.rows; i++)// 현재 행렬의 행을 반복
					for(int j=0; j<b.cols; j++)// 전달된 행렬 b의 열을 반복
						for(int k=0; k<this.cols; k++)// 현재 행렬의 열과 전달된 행렬 b의 행을 반복
							 // 행렬 d의 i행 j열에 현재 행렬의 i행 k열과 전달된 행렬 b의 k행 j열의 곱을 더함
							//2차원으로 표현하려면 : m.data[i][j]+=this.data[i][k]*d.data[k][j]
					d.data[i*d.cols+j] += this.data[i*cols+k] * b.data[k*b.cols+j];		
					return d; // 행렬 d 반환
			}
		Matrix transposeMatrix() { 
			Matrix m = new Matrix(this.cols, this.rows);//자기자신 행렬B
			for(int i = 0; i<this.rows; i++)
				for(int j = 0; j<this.cols; j++)
				//m.data[j][i] = this.data[i][j];
				m.data[i * m.cols +j] += this.data[i*this.cols+j];
			return m;
		}
		void showMatrix(String str) {
			System.out.println(str);			
			//2차원 배열 모양으로 출력하는 코드 작성
			for (int i = 0; i<rows; i++) {
				for(int j = 0; j<cols; j++) {
					System.out.print(data [i*cols+j]+" ");
				}	
			}
			System.out.println();
		}
	}
	public class Test_행렬클래스 {

		public static void main(String[] args) {
			/*
			 * 
			 * 난수 생성으로 초기화
			 * A[3][4] = B[3][4] + C[3][4]; D[3][5] = B[3][4] * E[4][5];
			 * F[4][3] = B[3][4]의 전치 행렬
			 */
			Matrix B = new Matrix(3,4);
			Matrix C = new Matrix(3,4);
			Matrix A, D, F;
			Matrix E = new Matrix(4,5);

			System.out.println
			("행렬 더하기: A[3][4] = B[3][4] + C[3][4]");
			B.getData();C.getData();E.getData();
			
			A = B.addMatrix(C);
			B.showMatrix("B[3][4]");
			C.showMatrix("C[3][4]");
			A.showMatrix("A[3][4]");
			
			System.out.println
			("행렬 곱하기: D[3][5] = B[3][4] * E[4][5]");
			D = B.multiplyMatrix(E);
			B.showMatrix("B[3][4]");
			E.showMatrix("E[4][5]");
			D.showMatrix("D[3][5]");
			
			System.out.println
			("행렬 전치: F[4][3] = B[3][4]의 전치 행렬");
			F = B.transposeMatrix();
			B.showMatrix("B[3][4]"); 
			F.showMatrix("F[4][3]");

		}

	}
