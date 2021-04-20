package Board;

import java.util.*;

import Board.Board;

public class BoardMain {

	public static void main(String[] args) {

		//게시판 프로젝트
		
		Scanner scan=new Scanner(System.in);
		
		boolean run=true;
		
		List <Board> boardList=new ArrayList<Board>();
		
		Board bd=null;
		
		BoardService bs=new BoardService();
		

		
		while(run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1. 글쓰기 | 2.전체글목록 | 3.글조회 | 4.글수정 | 5.글삭제 "); 
			System.out.println("------------------------------------------------------");
			System.out.println("선택>");
			int select =scan.nextInt();
			
			
			switch(select) {
			
			case 1:
				//글쓰기: 글번호를 제외한 모든 항목을 입력하고 글번호는 자동으로 하나씩 올라간다.
				
				bd=new Board();
				
				//글번호가 하나씩 올라감
				int number=boardList.size()+1;
				
				System.out.print("제목 :");
				String title=scan.next();
				System.out.println("비밀번호 :");
				String password=scan.next();
				System.out.println("작성자 :");
				String people=scan.next();
				System.out.println("내용 :");
				String content=scan.next();
				
				//board객체 필드값으로 저장
				
				bd.setContent(content);
				bd.setTitle(title);
				bd.setPassword(password);
				bd.setNumber(number);
				bd.setPeople(people);
				//필드값이 끝나면 ArrayList에 저장
				boardList.add(bd);
				
				break;
				
			case 2:
				
				//전체글 목록
				for(int i=0; i<boardList.size(); i++) {
					System.out.print(boardList.get(i));
				}
				
				break;
				
			case 3:
				//글조회: 글번호를 입력하면 해당글의 상세정보가 출력된다.
				
				System.out.println("번호를 입력하세요.");
				number=scan.nextInt();
				
				for(int i=0; i<boardList.size(); i++) {
					if(number-1==i) {
					System.out.println(boardList.get(i));
					}
				}
				
				break;
				
			case 4:
				//글수정: 글번호, 비밀번호를 입력하고 정보가 맞으면 
				//제목,내용을 수정할 수있고 수정이 완료되면 해당글의 상세내용을 출력한다.
				
				System.out.println("글번호 :");
				number=scan.nextInt();
				System.out.println("비밀번호 :");
				password=scan.next();
				
				for(int i=0; i<boardList.size(); i++) {
					
					if(number-1==i && password.equals(boardList.get(i).getPassword())) {
						System.out.println("제목을 입력하세요 :");
						title=scan.next();
						boardList.get(i).setTitle(title);
						System.out.println("내용을 입력하세요 :");
						content=scan.next();
						
						//baordList에 저장된 내용값이 변경
						boardList.get(i).setContent(content);
						
					}else {
						System.out.println("번호 또는 비밀번호가 틀립니다.");
					}
				}
				
				
				break;
				
			case 5:
				//글삭제: 글번호,비밀번호를 입력하고 맞으면 해당글 삭제
				
				System.out.println("글번호 :");
				number=scan.nextInt();
				
				System.out.println("비밀번호 :");
				password=scan.next();
				
				int temp=0;
				
				for (int i=0; i<boardList.size(); i++) {
					
					for(int j=i+1; j<boardList.size(); j++ ) {
				
				if(number-1==i && password.equals(boardList.get(i).getPassword())) {
						
					temp = boardList.size();
					boardList.size= boardList[j];
					boardList.get(i).setnumber(number);
				}
				
			else {
				System.out.println("번호 또는 비밀번호가 틀립니다.");
			}
		
			}	
				}	
				
				
				break;
				
				
				
			}
		}
		
		
		
				
				
		
	}

}
