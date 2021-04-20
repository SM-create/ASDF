package Member;

import java.util.*;

import Member.MemberDTO;

import Member.Member_Main;

//service CLass

/*
 * 전체회원 조회를 위한메소드
 * 메소드이름 : memberList
 * 매개변수 : memberList
 * 리턴 : 없음
 */


//case 2
public class MemberService {

	Scanner scan = new Scanner(System.in);

	// 로그인 기능
	// 아이디 비밀번호가 모두 맞으면 'id+님 환영합니다' 출력
	// 둘중 하나라도 틀리면 '아이디 또는 비밀번호가 틀립니다'출력

	void memberList(List<MemberDTO> memberList) {
		for (int i = 0; i < memberList.size(); i++) {

			System.out.println(memberList.get(i));
		}
	}

//	List <MemberDTO> login (List <MemberDTO> memberList) {
//	
//	System.out.print("아이디 :"); 
//	String id=scan.next();
//	System.out.println("비밀번호 :");
//	String password=scan.next();
//	
//	
//	for (int i=0; i<memberList.size(); i++) {
//		
//	if (id.equals(memberList.get(i).getId()) && 
//			password.equals(memberList.get(i).getPassword())) {
//		
//		System.out.println("환영합니다.");
//	} 
//	
//	else {
//	 				System.out.println("아이디 또는 비밀번호가 틀립니다.");
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
//		System.out.print("아이디 :"); 
//		String id=scan.next();
//		System.out.println("비밀번호 :");
//		String password=scan.next();
//		

	
	//case 2
	
	void memberLogin(List<MemberDTO> memberList) {
		System.out.print("아이디 :");
		String id = scan.next();
		System.out.println("비밀번호 :");
		String password = scan.next();
		
		for (int i=0; i<memberList.size(); i++) {
			if (id.equals(memberList.get(i).getId()) && 
					password.equals(memberList.get(i).getPassword())) {
				
				System.out.println(id+"님환영합니다.");
		}else {
			System.out.println("아이디 또는 비밀번호가 틀립니다.");
	}

}
		
		//case 3
}
	public List<MemberDTO> numberUpdate (List<MemberDTO> memberList) {
		
		System.out.print("아이디 :");
		String id = scan.next();
		System.out.println("비밀번호 :");
		String password = scan.next();
		
		for (int i=0; i<memberList.size(); i++) {
			if (id.equals(memberList.get(i).getId()) && 
					password.equals(memberList.get(i).getPassword())) {
				
				System.out.println( "변경할 전화번호 : ");
				String number =scan.next();
						memberList.get(i).setNumber(number);
				
		}else {
			System.out.println("아이디 또는 비밀번호가 틀립니다.");
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
//		 				System.out.println("아이디 또는 비밀번호가 틀립니다.");
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