package New_20210422_Parent;

public class CellPhone extends Phone {

	// CellPhone_Phone의 자식클래스

	String button;
	String message;

	// 기본생성자
	CellPhone() {

	}
	
	CellPhone(String button){
		System.out.println("내용을 표시하시오");
	}

	// button, model, color를 매개변수로 하는 생성자
	CellPhone(String button, String model, String company) {
		this.button = button;
		this.model = model;
		this.company = company;

		// model ,company 필드는 상속을 받았기때문에 CellPhone이 가지고있지않아도 사용가능
	}

	// 메소드
	void sendMessage(String message) {
		System.out.println("메세지 전송 :" + message);

	}
	
	//메소드 오버로딩 : 메소드 이름은 같지만 매개변수 타입이나 갯수가 다른 것
	void sendMessage() {
		System.out.println("매개변수가 없는 매소드");
	}

	void snedMessage(int number) {
		System.out.println("매개변수가 없는 매소드");
	}
	
	void powerOn() {
		System.out.println("전원을 켭니다.");

	}

	// 메소드 재정의 : 상속받은 메소드의 내용을 수정하거나 바꾸는 것
	//  		 : 단, 메소드 이름은 그대로 유지해야 함.
	//

	// @ Annotation (어노테이션) 재정인을 제대로했는지 확인하는 컴파일러의 역할.
	
	@Override
	
	void hangOn() {
		System.out.println("CellPhone으로 전화를 겁니다.");
		System.out.println("CellPhone 전화");
	}

	void hangOff() {
		System.out.println("전화를 끊습니다.");

	}

	void call(String sendVoice) {
		System.out.println(sendVoice);
	}

}
