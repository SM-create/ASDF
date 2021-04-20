package Member;

public class MemberDTO {
	
	
	// 필드선언 balance..?
	
	private String id="";
	private String password=""; 
	private String name=""; 
	private String number=""; 
	
	
	//생성자 (2가지)
	
	public MemberDTO() {
		
	}
	
	public MemberDTO (String id,String name,String password,String number) {
	
	this.id=id;
	this.name=name;
	this.number=number;
	this.password=password;
			
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	@Override
	
	public String toString() {
		return "MemberDTO [ id=" + id + ", password=" + password + ", name=" + name
				+ ", number=" + number + "]";
	} 
		
		
	
	

}
