package Member;

import java.util.*;

import Member.MemberDTO;

import Member.MemberService;

public class Member_Main {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		//ȸ�� ������ memberList����
		List<MemberDTO>memberList =new ArrayList <MemberDTO>();

		boolean run= true;
		//memberDTO Ÿ���� ���� member
		MemberDTO member= null;
		MemberService ms= new MemberService();
		
		
		
		
		
		while(run) {
			
			System.out.println("-------------------------------------------");
			System.out.println("1.ȸ������ | 2.��üȸ����ȸ | 3.�α��� | 4.��ȭ��ȣ����");
			System.out.println("-------------------------------------------");
			System.out.println("����>");
			int select =scan.nextInt();
			
			
			
			
			switch (select) {
			
				case 1:
					
					//ȸ������
					
					member= new MemberDTO();
					
					
					System.out.print("���̵� :");
					String id=scan.next();
					
					System.out.print("��й�ȣ :");
					String password=scan.next();
					
					System.out.print("�̸� :");
					String name=scan.next();
					
					System.out.println("��ȭ��ȣ :");
					String number=scan.next();
					
					member =new MemberDTO(id, password, name, number);
					
					//�Է¹��� ������ member��ü �ʵ尪���� ����
//					member.setId(id);
//					member.setPassword(password);
//					member.setName(name);
//					member.setNumber(number);
					
					//�Ѽ�[Ʈ�� �� ����� ���� �ʵ尪�� ������ ArrayList������
					memberList.add(member);
					
					break;
					
				case 2:
					//ȸ�������� �ϳ��� �ø�
				
					ms.memberList(memberList);
					
					break;
					
					
				case 3:
					
					//�α��� ���
					//���̵� ��й�ȣ�� ��� ������ 'id+�� ȯ���մϴ�' ���
					//���� �ϳ��� Ʋ���� '���̵� �Ǵ� ��й�ȣ�� Ʋ���ϴ�'���
					
//					public List<memberDTO>login(List<memberDTO>memberList)
//					
//					System.out.print("���̵� :"); 
//					id=scan.next();
//					System.out.println("��й�ȣ :");
//					password=scan.next();
//					for (int i=0; i<memberList.size(); i++) {
//						
//					if (id.equals(memberList.get(i).getId())&& password.equals(memberList.get(i).getPassword()) {
//					} else {
//					 				System.out.println("���̵� �Ǵ� ��й�ȣ�� Ʋ���ϴ�.");
//					}
//							
//							
//					}
					
					
					ms.memberLogin(memberList);
					
					break;
				case 4:
					
					//��ȭ��ȣ ������
					//���̵�, ��й�ȣ Ȯ���� ��� ������ ������ ��ȭ��ȣ�� �Է¹ް� ��ȭ ��ȣ ����ó��
					
					
					
					memberList=ms.numberUpdate(memberList);
					
					
					break;
			
					
					
					
					
					
				
			}
		}
	}

}
