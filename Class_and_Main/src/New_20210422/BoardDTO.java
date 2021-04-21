package day16_20210421_02;

public class BoardDTO {
	private int bNumber;
	private String bTitle;
	private String bPassword;
	private String bWriter;
	private String bContents;

	public BoardDTO() {
	}

	public BoardDTO(int bNumber, String bTitle, String bPassword, String bWriter, String bContents) {
		this.bNumber = bNumber;
		this.bTitle = bTitle;
		this.bPassword = bPassword;
		this.bWriter = bWriter;
		this.bContents = bContents;
	}

	public int getbNumber() {
		return bNumber;
	}

	public void setbNumber(int bNumber) {
		this.bNumber = bNumber;
	}

	public String getbTitle() {
		return bTitle;
	}

	public void setbTitle(String bTitle) {
		this.bTitle = bTitle;
	}

	public String getbPassword() {
		return bPassword;
	}

	public void setbPassword(String bPassword) {
		this.bPassword = bPassword;
	}

	public String getbWriter() {
		return bWriter;
	}

	public void setbWriter(String bWriter) {
		this.bWriter = bWriter;
	}

	public String getbContents() {
		return bContents;
	}

	public void setbContents(String bContents) {
		this.bContents = bContents;
	}

	@Override
	public String toString() {
		return "BoardDTO [bNumber=" + bNumber + ", bTitle=" + bTitle + ", bPassword=" + bPassword + ", bWriter="
				+ bWriter + ", bContents=" + bContents + "]";
	}
	
	
}
