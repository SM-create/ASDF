package New_20210422_Parent;

public class CellPhone extends Phone {

	// CellPhone_Phone�� �ڽ�Ŭ����

	String button;
	String message;

	// �⺻������
	CellPhone() {

	}
	
	CellPhone(String button){
		System.out.println("������ ǥ���Ͻÿ�");
	}

	// button, model, color�� �Ű������� �ϴ� ������
	CellPhone(String button, String model, String company) {
		this.button = button;
		this.model = model;
		this.company = company;

		// model ,company �ʵ�� ����� �޾ұ⶧���� CellPhone�� �����������ʾƵ� ��밡��
	}

	// �޼ҵ�
	void sendMessage(String message) {
		System.out.println("�޼��� ���� :" + message);

	}
	
	//�޼ҵ� �����ε� : �޼ҵ� �̸��� ������ �Ű����� Ÿ���̳� ������ �ٸ� ��
	void sendMessage() {
		System.out.println("�Ű������� ���� �żҵ�");
	}

	void snedMessage(int number) {
		System.out.println("�Ű������� ���� �żҵ�");
	}
	
	void powerOn() {
		System.out.println("������ �մϴ�.");

	}

	// �޼ҵ� ������ : ��ӹ��� �޼ҵ��� ������ �����ϰų� �ٲٴ� ��
	//  		 : ��, �޼ҵ� �̸��� �״�� �����ؾ� ��.
	//

	// @ Annotation (������̼�) �������� ������ߴ��� Ȯ���ϴ� �����Ϸ��� ����.
	
	@Override
	
	void hangOn() {
		System.out.println("CellPhone���� ��ȭ�� �̴ϴ�.");
		System.out.println("CellPhone ��ȭ");
	}

	void hangOff() {
		System.out.println("��ȭ�� �����ϴ�.");

	}

	void call(String sendVoice) {
		System.out.println(sendVoice);
	}

}
