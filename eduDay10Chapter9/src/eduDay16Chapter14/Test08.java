package eduDay16Chapter14;

import java.util.Arrays;

interface StringFunc2 {
	String[] modify(String s) throws EmptyStringException;
}

class EmptyStringException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	EmptyStringException() {
		super("빈 문자열");
	}
}
//try catch
public class Test08 {
	public static void main(String[] args) {
		
		String str = "Korea,Austrailia,China,Germany,Spain,Turkey";
		StringFunc2 sf = (s) -> {
			if(s.length() == 0)
				throw new EmptyStringException();
			return s.split(",");
		};
		try {
			String result[] = sf.modify(str);
			System.out.println(Arrays.toString(result));
			
			String str2 = "";
			String result2[] = sf.modify(str2);
			System.out.println(Arrays.toString(result2));
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
	}

}
