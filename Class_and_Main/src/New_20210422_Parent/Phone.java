package New_20210422_Parent;


public class Phone {
	
	/*
	 * ���
	 *  : �θ�Ŭ����, �ڽ�Ŭ����
	 *  : "�ʵ�,�޼ҵ�" �θ� �ڽ����� �ִ°�
	 *  : private���� ������ �ʵ�, �޼ҵ�� ��ӺҰ���
	 *  
	 */
	
	//PhoneŬ���� :�θ�Ŭ����
	//Phone -> CellPhone -> SmartPhone
	
	//�ʵ� ����
	
	String model;
	String company;
	
	//�޼ҵ� ����
	
	
	void hangOn() {
		System.out.println("��ȭ�� �̴ϴ�.");
	}

	void hangOff() {
		System.out.println("��ȭ�� �����ϴ�.");
		
	}
	
	void call(String sendVoice) {
		System.out.println(sendVoice);
	}
	
	
}
