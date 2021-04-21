package day17_20210422_01;

public class BookDTO {
	private int bookNumber;
	private String bookName;
	private String author;
	private boolean check;
	private int clientNumber;

	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public boolean isCheck() {
		return check;
	}

	public void setCheck(boolean check) {
		this.check = check;
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	@Override
	public String toString() {
		return "BookDTO [bookNumber=" + bookNumber + ", bookName=" + bookName + ", author=" + author + ", check="
				+ check + ", clientNumber=" + clientNumber + "]";
	}

	public BookDTO(int bookNumber, String bookName, String author, boolean check, int clientNumber) {
		this.bookNumber = bookNumber;
		this.bookName = bookName;
		this.author = author;
		this.check = check;
		this.clientNumber = clientNumber;
	}

	public BookDTO() {
	}

}
