package eduDay6Chapter7_3;
//원래 innerClass에 있었어야 함
interface Messenger {
	String getMessage();
	void setMessage(String msg);
}

public class MessengerTest3 {
	public static void main(String[] args) {
		Messenger galaxy = new Messenger()
				{
			public String getMessage() {
				return "test";
			}
			public void setMessage(String msg) {
				System.out.println("메시지 = : + msg");
			}
};
Messenger test = new Messenger() {
	public String getMessage() {
		return "test";
	}
	public void setMessage(String msg) {
		System.out.println("메시지 = : + msg");
	}
};//여기에 세미콜론 왜 붙는지 : to complete local variable declararion statement
}
}
