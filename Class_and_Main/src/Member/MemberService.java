package Member;

import java.util.*;

import Member.MemberDTO;

import Member.Member_Main;

//service CLass

/*
 * ��üȸ�� ��ȸ�� ���Ѹ޼ҵ�
 * �޼ҵ��̸� : memberList
 * �Ű����� : memberList
 * ���� : ����
 */


//case 2
public class MemberService {

	Scanner scan = new Scanner(System.in);

	// �α��� ���
	// ���̵� ��й�ȣ�� ��� ������ 'id+�� ȯ���մϴ�' ���
	// ���� �ϳ��� Ʋ���� '���̵� �Ǵ� ��й�ȣ�� Ʋ���ϴ�'���

	void memberList(List<MemberDTO> memberList) {
		for (int i = 0; i < memberList.size(); i++) {

			System.out.println(memberList.get(i));
		}
	}

//	List <MemberDTO> login (List <MemberDTO> memberList) {
//	
//	System.out.print("���̵� :"); 
//	String id=scan.next();
//	System.out.println("��й�ȣ :");
//	String password=scan.next();
//	
//	
//	for (int i=0; i<memberList.size(); i++) {
//		
//	if (id.equals(memberList.get(i).getId()) && 
//			password.equals(memberList.get(i).getPassword())) {
//		
//		System.out.println("ȯ���մϴ�.");
//	} 
//	
//	else {
//	 				System.out.println("���̵� �Ǵ� ��й�ȣ�� Ʋ���ϴ�.");
//	}
//			
//			
//	}
//	
//	return  memberList;
//	
//	
//}
//	
//	List<MemberDTO> change (List<MemberDTO>memberList){
//		
//		System.out.print("���̵� :"); 
//		String id=scan.next();
//		System.out.println("��й�ȣ :");
//		String password=scan.next();
//		

	
	//case 2
	
	void memberLogin(List<MemberDTO> memberList) {
		System.out.print("���̵� :");
		String id = scan.next();
		System.out.println("��й�ȣ :");
		String password = scan.next();
		
		for (int i=0; i<memberList.size(); i++) {
			if (id.equals(memberList.get(i).getId()) && 
					password.equals(memberList.get(i).getPassword())) {
				
				System.out.println(id+"��ȯ���մϴ�.");
		}else {
			System.out.println("���̵� �Ǵ� ��й�ȣ�� Ʋ���ϴ�.");
	}

}
		
		//case 3
}
	public List<MemberDTO> numberUpdate (List<MemberDTO> memberList) {
		
		System.out.print("���̵� :");
		String id = scan.next();
		System.out.println("��й�ȣ :");
		String password = scan.next();
		
		for (int i=0; i<memberList.size(); i++) {
			if (id.equals(memberList.get(i).getId()) && 
					password.equals(memberList.get(i).getPassword())) {
				
				System.out.println( "������ ��ȭ��ȣ : ");
				String number =scan.next();
						memberList.get(i).setNumber(number);
				
		}else {
			System.out.println("���̵� �Ǵ� ��й�ȣ�� Ʋ���ϴ�.");
	}

}
		return memberList;
		
		
		
	}
}


//		
//		for (int i=0; i<memberList.size(); i++) {
//			
//		if (id.equals(memberList.get(i).getId()) && 
//				password.equals(memberList.get(i).getPassword())) {
//			
//			
//			
//		} 
//		
//		else {
//		 				System.out.println("���̵� �Ǵ� ��й�ȣ�� Ʋ���ϴ�.");
//		}
//				
//				
//		}
//		
//		
//		
//		return memberList;
//		
//			
//	}
//}