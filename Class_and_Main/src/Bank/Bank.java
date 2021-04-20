package Bank;
//DTO :������ ������ ���� Ŭ����
//�ʵ� ,�⺻������,�Ű������ִ� ������, getter/setter ,toString
//DTO ���뵵
//�Խ��� :�Խ��� ��Ͽ�, ȸ��:ȸ����Ͽ�, ���θ�:��ǰ ��Ͽ�

//VO ,Bean
public class Bank {
	
	//�ʵ弱��
	
	private int clientNumber=0 , balance=0;
	private String name=""; 
	private String accountNumber="";
	
	//������ (2����)
	
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
