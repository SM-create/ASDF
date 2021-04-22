package New_20210422_Parent;

public class SmartPhone extends CellPhone {

	String type;
	
	@Override
	void powerOn() {
		System.out.println("스마트폰을 켭니다1");
	}
	
	@Override
	void hangOff() {
		System.out.println("스마트폰 통화 종료1");
	}
}
