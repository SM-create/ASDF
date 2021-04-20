package Member;

import java.util.*;

import Member.MemberDTO;

import Member.MemberService;

public class Member_Main {

	public static void main(String[] args) {

		Scanner scan= new Scanner(System.in);
		//회원 저장할 memberList선언
		List<MemberDTO>memberList =new ArrayList <MemberDTO>();

		boolean run= true;
		//memberDTO 타입의 변수 member
		MemberDTO member= null;
		MemberService ms= new MemberService();
		
		
		
		
		
		while(run) {
			
			System.out.println("-------------------------------------------");
			System.out.println("1.회원가입 | 2.전체회원조회 | 3.로그인 | 4.전화번호변경");
			System.out.println("-------------------------------------------");
			System.out.println("선택>");
			int select =scan.nextInt();
			
			
			
			
			switch (select) {
			
				case 1:
					
					//회원가입
					
					member= new MemberDTO();
					
					
					System.out.print("아이디 :");
					String id=scan.next();
					
					System.out.print("비밀번호 :");
					String password=scan.next();
					
					System.out.print("이름 :");
					String name=scan.next();
					
					System.out.println("전화번호 :");
					String number=scan.next();
					
					member =new MemberDTO(id, password, name, number);
					
					//입력받은 값들을 member객체 필드값으로 저장
//					member.setId(id);
//					member.setPassword(password);
//					member.setName(name);
//					member.setNumber(number);
					
					//한세[트가 다 만들어 지고 필드값이 끝나면 ArrayList에저장
					memberList.add(member);
					
					break;
					
				case 2:
					//회원정보를 하나씩 올림
				
					ms.memberList(memberList);
					
					break;
					
					
				case 3:
					
					//로그인 기능
					//아이디 비밀번호가 모두 맞으면 'id+님 환영합니다' 출력
					//둘중 하나라도 틀리면 '아이디 또는 비밀번호가 틀립니다'출력
					
//					public List<memberDTO>login(List<memberDTO>memberList)
//					
//					System.out.print("아이디 :"); 
//					id=scan.next();
//					System.out.println("비밀번호 :");
//					password=scan.next();
//					for (int i=0; i<memberList.size(); i++) {
//						
//					if (id.equals(memberList.get(i).getId())&& password.equals(memberList.get(i).getPassword()) {
//					} else {
//					 				System.out.println("아이디 또는 비밀번호가 틀립니다.");
//					}
//							
//							
//					}
					
					
					ms.memberLogin(memberList);
					
					break;
				case 4:
					
					//전화번호 변경기능
					//아이디, 비밀번호 확인후 모두 맞으면 변경할 전화번호를 입력받고 전화 번호 변경처리
					
					
					
					memberList=ms.numberUpdate(memberList);
					
					
					break;
			
					
					
					
					
					
				
			}
		}
	}

}
