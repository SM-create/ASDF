package day17_20210422_01;
import java.util.*;

public class LibraryMain {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		
		List<ClientDTO> clientList = new ArrayList<ClientDTO>();
		List<BookDTO> bookList = new ArrayList<BookDTO>();
		ClientDTO client = null;
		BookDTO book = null;
		LibraryService libraryService = new LibraryService();
		
		while(run) {
			System.out.println("--------------------------------------------------------------");
			System.out.println("1.회원등록 | 2.도서등록 | 3.도서대출 | 4.도서목록 | 5.회원목록 | 6.종료");
			System.out.println("--------------------------------------------------------------");
			System.out.print("선택> ");
			int selectNo = scan.nextInt();
			switch(selectNo) {
			case 1:
				System.out.print("이름 : ");
				String name = scan.next();
				System.out.print("전화번호 : ");
				String phone = scan.next();
				
				client = new ClientDTO();
				client.setName(name);
				client.setPhone(phone);
				
				int clientNumber = clientList.size() + 1;
				client.setClientNumber(clientNumber);
				clientList.add(client);
				
				break;
			case 2:
				System.out.print("도서명 : ");
				String bookName = scan.next();
				System.out.print("저자 : ");
				String author = scan.next();
				
				book = new BookDTO();
				book.setBookName(bookName);
				book.setAuthor(author);
				
				int bookNumber = bookList.size() + 1;
				book.setBookNumber(bookNumber);
				bookList.add(book);
				break;
			case 3:
				bookList = libraryService.borrowBook(bookList);
				break;
			case 4: 
				libraryService.bookList(bookList);
				break;
			case 5: 
				libraryService.clientList(clientList);
				break;
			case 6:
				run = false;
				break;
				
			}
		}
	}

}
