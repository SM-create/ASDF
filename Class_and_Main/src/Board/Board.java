package Board;

public class Board {

	
	private int number=0;
	private String title="";String password="";  String people=""; String content="";
	
	public Board() {
		
		
	}
	
	public Board(int number, String title,String password,String people,String content) {
		
		this.content=content;
		this.number=number;
		this.password=password;
		this.people=people;
		this.title=title;
		
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPeople() {
		return people;
	}

	public void setPeople(String people) {
		this.people = people;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "Board [number=" + number + ", title=" + title + ", password=" + password + ", people=" + people
				+ ", content=" + content + "]";
	}
	
	
}
