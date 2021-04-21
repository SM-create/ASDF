package day16_20210421_02;

import java.util.List;
import java.util.Scanner;

public class BoardService {
	Scanner scan = new Scanner(System.in);

	public void boardList(List<BoardDTO> boardList) {
		for(int i=0; i<boardList.size(); i++) {
			System.out.println(boardList.get(i));// BoardDTO에 toString 메소드 있는지 확인 
		}
	}

	public void boardView(List<BoardDTO> boardList) {
		System.out.print("글번호 : ");
		int bNumber = scan.nextInt();
		for(int i=0; i<boardList.size(); i++) {
			if(bNumber == boardList.get(i).getbNumber()) {
				System.out.println(boardList.get(i));
			}
		}
	}

	public List<BoardDTO> boardUpdate(List<BoardDTO> boardList) {
		System.out.print("글번호 : ");
		int bNumber = scan.nextInt();
		System.out.print("비밀번호 : ");
		String bPassword = scan.next();
		for(int i=0; i<boardList.size(); i++) {
			if(bNumber == boardList.get(i).getbNumber() && bPassword.equals(boardList.get(i).getbPassword())) {
				System.out.print("수정할 제목 : ");
				String bTitle = scan.next();
				System.out.print("수정할 내용 : ");
				String bContents = scan.next();
				boardList.get(i).setbTitle(bTitle);
				boardList.get(i).setbContents(bContents);
				System.out.println(boardList.get(i));
			}
		}
		return boardList;
	}

	public List<BoardDTO> boardDelete(List<BoardDTO> boardList) {
		System.out.print("글번호 : ");
		int bNumber = scan.nextInt();
		System.out.print("비밀번호 : ");
		String bPassword = scan.next();
		for(int i=0; i<boardList.size(); i++) {
			if(bNumber == boardList.get(i).getbNumber() && bPassword.equals(boardList.get(i).getbPassword())) {
				boardList.remove(i);
			}
		}
		return boardList;
	}
	
	// 게시판??
	/*
	 * CRUD
	 * Create 
	 * Read 
	 * Update 
	 * Delete
	 */
	
}








