package eduDay6Chapter7_3;

public class IPhoneMessenger implements Messenger{

	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "iPhone";
	}

	@Override
	public void setMessage(String msg) {
		// TODO Auto-generated method stub
		System.out.println("iPhone에서 메시지를 설정합니다 : " + msg);
	}
	
	public void clearMessage() {
			System.out.println("좌우로 흔들어 문자열을 지웁니다.");
		}
	}