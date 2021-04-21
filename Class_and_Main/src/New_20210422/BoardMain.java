package day16_20210421_02;

import java.util.*;

public class BoardMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<BoardDTO> boardList = new ArrayList<BoardDTO>();
		boolean run = true;
		BoardDTO board = null;
		BoardService bs = new BoardService();

		while (run) {
			System.out.println("------------------------------------------------------------------------");
			System.out.println("1.글쓰기 | 2.글목록 | 3.글조회 | 4.글수정 | 5.글삭제 | 6.종료");
			System.out.println("------------------------------------------------------------------------");
			System.out.print("선택> ");
			int select = scan.nextInt();

			switch (select) {
			case 1:
				int bNumber = boardList.size() + 1;
				System.out.print("글제목 : ");
				String bTitle = scan.next();
				System.out.print("비밀번호 : ");
				String bPassword = scan.next();
				System.out.print("작성자 : ");
				String bWriter = scan.next();
				System.out.print("내용 : ");
				String bContents = scan.next();
				board = new BoardDTO(bNumber, bTitle, bPassword, bWriter, bContents);
				boardList.add(board);
				break;
			case 2:
				// 목록 출력을 위한 메소드 호출(단순 출력만 하기 때문에 리턴은 필요 없음.)
				bs.boardList(boardList);
				break;
			case 3:
				// 글조회
				bs.boardView(boardList);
				break;
			case 4:
				// 글수정
				boardList = bs.boardUpdate(boardList);
				break;
			case 5:
				// 글삭제 
				boardList = bs.boardDelete(boardList);
				break;
			case 6:
				run = false;
				break;
			}
		}
	}

}
