package New_20210422_Parent;

public class SmartPhone extends CellPhone {

	String type;
	
	@Override
	void powerOn() {
		System.out.println("����Ʈ���� �մϴ�1");
	}
	
	@Override
	void hangOff() {
		System.out.println("����Ʈ�� ��ȭ ����1");
	}
}
