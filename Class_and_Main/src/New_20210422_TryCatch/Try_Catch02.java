package New_20210422_TryCatch;


public class Try_Catch02 {

	public static void main(String[] args) {

		// �������� �Ҷ�
		// a/b���� b�� 0�̸� �߻��ϴ� ���ܸ� Ȯ���ϰ�
		// ����ó���� �� �� �ִ� �ڵ带 �ۼ��غ�����
		// ���ܰ� �߻��ϴ� ��� "0���� �����������ϴ�." �� ���


	

		try {
			int a = 5;
			int b = 0		;
			System.out.println(a / b);

		} catch (ArithmeticException e) {
			System.out.println("0���� �����������ϴ�.");
		} catch (Exception e) {
			System.out.println("�ٸ� ����");
		}


	}

}
