package New_20210422_Parent;

public class PhoneMain {

	public static void main(String[] args) {

		//Phone Ŭ���� ��ü
		
		
		
		Phone p=new Phone();
		p.company="ȸ��1";
		p.hangOn();
		
		//CellPhone Ŭ������ü
		CellPhone cp=new CellPhone();
		//CellPhone �� �������ִ� �ʵ���
		cp.button="��ư10��";
		cp.message="�޽��� ����";
		
		//CellPhone��ü�� Phone �ʵ� ���
		cp.company="ȸ��2";
		cp.model="��ȭ��1";
		
		//Phone�� �������ִ� �޼ҵ� ȣ��
		cp.hangOff();
		//�������� �޼ҵ带 ȣ���ϸ� �����ǵ� ���븸 �����
		cp.hangOn();
		
		p.hangOn();
		
		//-------------------------------------//
		
		SmartPhone sp= new SmartPhone();
		
		sp.company="ȸ��2"; //Phone�� �ʵ�
		sp.button="��ġ��"; //CellPhone�� �ʵ�
		sp.type="5G"; //SmartPhone�� �ʵ�
		
		sp.call("��������"); //Phone�� �޼ҵ�
		sp.hangOn(); //CellPhone�� �������� �޼ҵ�
		sp.hangOff(); //SmartPhone ���������� �޼ҵ�
		
	}

}
