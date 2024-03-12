package eduDay16Chapter14;

interface NumberFunc {
	int func(int n);
}

public class Test05 {
	public static void main(String[] args) {
		NumberFunc sum = (n) -> {
			int result = 0;
			for(int i = 0; i<=n; i++) {
				result += i;
			}
			return result;
		};
		
		NumberFunc esum = (n) -> { //짝수 even
			int result2 = 0;
			for(int i = 0; i<=n; i++)
				if(i % 2 == 0) {
					result2 += i;
				}
				
			return result2;
		};
		NumberFunc osum = (n) -> { //홀수 odd
			int result3 = 0;
			for (int i = 0; i<=n; i++)
				if(i % 2 == 1) {
					result3 += i;
				}
			return result3;
		};
		
		System.out.println("1-10까지의 합 : "+sum.func(10));
		System.out.println("1-10까지 짝수의 합 : "+esum.func(10));
		System.out.println("1-10까지 홀수의 합 : "+osum.func(10));
		System.out.println("1-100까지의 합 : "+sum.func(100));
		System.out.println("1-100까지 짝수의 합 : "+esum.func(100));
		System.out.println("1-100까지 홀수의 합 : "+osum.func(100));
	}
}
