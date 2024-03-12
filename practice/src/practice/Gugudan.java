package practice;

public class Gugudan {
	public void printVertical() {
		System.out.println();
		for (int x = 2; x < 10; x++) {
			for (int y = 1; y < 10; y++)
				System.out.println(x + "*" + y + "=" + x * y + " ");
		}
	}

	public void printHorizontal() {
		for (int j = 1; j < 10; j++) {
			for (int i = 2; i < 10; i++) {
				System.out.printf("%d * %d = %d\t", i, j, (i * j));
			}
			System.out.println();
		}
	}

	public void printColumn(int col) {
		for (int i = 2; i < 10; i += col) {
			for (int j = 1; j < 10; j++) {
				for (int k = i; k < i + col; k++) {
					if (k < 10) {
						System.out.printf("%d * %d = %d\t", k, j, (k * j));
					}
				}
				System.out.println();
			}
			System.out.println();
		}
	}
}
	/*교수님 답
	 * 
	 */
//	public void printColumn(int col) {
//		if (9 < col) {
//			System.out.println("col is not valid![1~9]");
//			return;
//		}
//		for (int i = 2; i < 10; i += col) {
//			for (int j = 1; j < 10; j++) {
//				for (int k = 0; k < col; k++) {
//					
//					if (10 <= i + k) {
//						System.out.println();
//						break;
//					}
//
//					System.out.printf("%d * %d = %d", (i + k), j, (i + k) * j);
//
//					if (k < col - 1)	System.out.print("\t");
//					else				System.out.print("\n"); //println() 쓰거나 print("\n") 쓰면 됨
//				}
//			}
//			System.out.println();
//		}
//	}
//}


//	public void printHorizontal2(int x) {
//		System.out.println(x + "단");
//		for (int y = 1; y < 10; y++) {
//			System.out.println
//			(x + "*" + y + "=" + x*y +" ");
//	}
//	} 	

//		i단 구구단 출력 시작
//		
//		2*1=2
//		2*2=4
//		2*3=6
//		  :
//		2*9=18
//		
//		i단 구구단 출력 끝
