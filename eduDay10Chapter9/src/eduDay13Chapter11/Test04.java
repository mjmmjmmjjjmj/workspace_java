package eduDay13Chapter11;

import java.io.*;

public class Test04 {

	public static void test() throws Exception {
		FileInputStream fi = new FileInputStream("a.txt");
		int c = fi.read();
		System.out.println((char) c);
	}

	public static void main(String[] args) {
		System.out.println("Start");
		try {
			test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("End");
	}
}
