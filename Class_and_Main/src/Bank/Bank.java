package Bank;
//DTO :데이터 전달을 위한 클래스
//필드 ,기본생성자,매개변수있는 생성자, getter/setter ,toString
//DTO 사용용도
//게시판 :게시판 등록용, 회원:회원등록용, 쇼핑몰:상품 등록용

//VO ,Bean
public class Bank {
	
	//필드선언
	
	private int clientNumber=0 , balance=0;
	private String name=""; 
	private String accountNumber="";
	
	//생성자 (2가지)
	
	public Bank (){
		
	}
	
	public Bank(int clientNumber, String name,String accountNumber, int balance) {
		
	this.accountNumber=accountNumber;
	this.balance=balance;
	this.clientNumber=clientNumber;
	this.name=name;
	}
	
	
	
	public int getClientNumber() {
		return clientNumber;
	}
	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	
	@Override
	public String toString() {
		return "Bank [clientNumber=" + clientNumber + ", balance=" + balance + ", name=" + name + ", accountNumber="
				+ accountNumber + "]";
	}
	
	
	
}
