package practice;

public class GugudanColumn {
	public void printColumn(int col) {
		for(int i = 2; i <=9; i += 3) {
			
			if(i < 7)
				System.out.println("---------------");
		}
	}
}
/*	public void printMultiplecationTable(int start) {
		for(int i = start; i<start+3 && i<= 9; i++) {
			for(int j = 1; j<=9; j++) {
				System.out.printf("%d * %d = %d%n", i, j, i*j);
			}
			if(i < start +2 && i < 9)
				System.out.println();
		}
	}
	
	
	public static void main(String[] args) {
		GugudanColumn gugudan = new GugudanColumn();
		gugudan.printColumn(3);
	}
}
*/
