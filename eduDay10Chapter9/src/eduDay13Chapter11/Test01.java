package eduDay13Chapter11;

public class Test01 {
	public static void main(String[] args) {
		test1();
		System.out.println("GOOD");
	}
	private static void test1() {
		System.out.println("test1 start");
		test2();
		System.out.println("test1 end");
	}

	private static void test2() {
	System.out.println("test2 start");
		try {
			int temp =10/0;
			String s = new String("java");
			int len = s.length();
			s=null;
			s.length();
			int arr[] = new int[3];
			arr[3] = 30; //new ArrayIndexOutOfBoundsException()
			System.out.println("OK");	
		} 
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println(e1.getMessage());
		}
		catch (NullPointerException e2 ) {
			e2.printStackTrace();
		}
		catch (Exception e) {
			System.out.println("오류발생 : "+ e);
		}
		System.out.println("test2 end");
	}
	private static void test3() {
			try {
				System.out.println("1");
				String s = null;
				s.length();
				System.out.println("2");
				System.out.println("3");
			} 
			catch(Exception e) {
				System.out.println("오류 발생");
			} 
			finally {
				System.out.println("OK");
			}
			System.out.println("4");
		}

}
	