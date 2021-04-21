package day17_20210422_01;

import java.util.*;

public class LibraryService {
	
	Scanner scan = new Scanner(System.in);
		
	public List<BookDTO> borrowBook(List<BookDTO> bookList) {
		System.out.print("고객 번호 : ");
		int clientNumber = scan.nextInt();
		System.out.print("빌릴책 번호 : ");
		int bookNumber = scan.nextInt();
		for(int i=0;i<bookList.size();i++) {
			if(bookNumber==bookList.get(i).getBookNumber() && bookList.get(i).isCheck()==false) {
				bookList.get(i).setClientNumber(clientNumber);
				bookList.get(i).setCheck(true);
				System.out.println("대출이 완료되었습니다.");
			} else if(bookNumber==bookList.get(i).getBookNumber() && bookList.get(i).isCheck()==true) {
				System.out.println("대출이 불가능 합니다.");
			}
		}
		return bookList;
	}
	public void bookList(List<BookDTO> bookList) {
		for(int i=0; i<bookList.size(); i++) {
			System.out.println(bookList.get(i));
		}
	}

	public void clientList(List<ClientDTO> clientList) {
		for(int i=0; i<clientList.size(); i++) {
			System.out.println(clientList.get(i));
		}
		
	}
}
