package New_20210422_TryCatch;

public class Exception_01 {

	public static void main(String[] args) {

		/*
		 * ����(Exception)ó��
		 * Try Catch ����
		 * 
		 * try{
		 * ������ ����
		 * 
		 * }catch(�ͼ��� �̸� e) {
		 * 	�ش� ���� (�ͼ���)�� �߻��� ��� ������ ����
		 * }
		 */
		
		
		try {
			int[] num=new int [3];
			
			num[3]=10; //���Ƿ� ���� ������ �߻��� ��ġ	
			
			System.out.println("try ��������");
			
		} catch (Exception e) {
			System.out.println("�迭ũ�� �ʰ�"); //������ �߻��ϴ��� �ߴܵ��� �ʵ��� ����
			e.printStackTrace(); // ������ ���� �ľ��� ������
		} finally {
			System.out.println("���ܰ� ���� �ȳ��� finally�� ������ ���ɴϴ�.");
		}
		
		
//			int[] num=new int [3];
//			
//			num[3]=10;

			System.out.println("try catch ��");
		
	}

}

