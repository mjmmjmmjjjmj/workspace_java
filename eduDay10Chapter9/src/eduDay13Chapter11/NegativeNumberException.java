package eduDay13Chapter11;

public class NegativeNumberException extends Exception {
	private static final long serialVersionUID = 1L;
	
	public NegativeNumberException() {
		// TODO Auto-generated constructor stub
		//자동으로 생성자 만들기 : Ctrl+Space
		super("음수는 허용하지 않습니다.");
	}
	public NegativeNumberException(String message) {
		// TODO Auto-generated constructor stub
		super(message);
	}
}
