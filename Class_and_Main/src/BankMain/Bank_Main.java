package BankMain;

import java.util.*;

import Bank.Bank;

import Bank_Service.Bank_Service;

import Bank_Service_2.BankService2;

public class Bank_Main {
	
	public static void main(String[] args) {
		
		//은행계좌문제//
		
		Scanner scan=new Scanner(System.in);
		boolean run=true;
		
		//고객전체를 저장할 List선언
		// Bank 클래스타입
		List <Bank> clientList =new ArrayList <Bank>();
		
		//Bank_service클래스 객체 (1개만 있어도된다..)
		Bank_Service bs =new Bank_Service();
		BankService2 bs2 =new BankService2();
		
		while (run) {
			System.out.println("---------------------------------------------------------------------");
			System.out.println("1. 고객등록 get.,set | 2.고객등록(생성자) | 3.입금 | 4.출금 | 5.고객리스트 | 6.종료"); 
			System.out.println("---------------------------------------------------------------------");
			System.out.println("선택>");
			int select =scan.nextInt();
			
			//Bank 클래스 타입의 변수 client
			
			Bank client =null;
			
			switch (select) {
				
				case 1:
					
					
					client = new Bank();
					
					int clientNumber=clientList.size()+1;	
					
					System.out.print("이름 : ");
					String name =scan.next();
					
					System.out.print("계좌 : ");
					String accountNumber =scan.next();
					
					System.out.print("입금액 : ");
					int balance =scan.nextInt();
					
					//입력받은 값을 bank객체필드값으로 저장
					client.setClientNumber(clientNumber);
					client.setName(name);
					client.setAccountNumber(accountNumber);
					client.setBalance(balance);
					
					client.setClientNumber(balance);
					//한세트가 다 만들어 지면 필드값세팅이끝나면 ArrayList에 저장
					clientList.add(client);
					
					break;
				
				case 2:
					//고객번호를 어떻게 하나씩 올릴지..
					
					System.out.print("이름 :");
					name = scan.next();
					System.out.print("계좌 :");
					accountNumber = scan.next();
					System.out.print("입금액 :");
					balance =scan.nextInt()	;
					client = new Bank(0 ,name, accountNumber, balance);	
					clientList.add(client);
					
					break;
				
				case 3:
					//입금할계좌번호와 입금금액을 입력받고
					//입력한 계좌와 동일한 계좌번호가 ArrayList에서 어디에 위치해 있는지
					//계좌번호(String) String이 같은지 비교할때는 ==쓰지않고 .equal 사용
					
					/*
					 * System.out.print("계좌 :"); accountNumber =scan.next();
					 * System.out.print("입금액 :"); int deposit=scan.nextInt(); for(int i=0;
					 * i<clientList.size(); i++) { if( accountNumber.equals(
					 * clientList.get(i).getAccountNumber())) { //같은 계좌를 찾았으면 입금처리 //입금처리: 기존 잔고에
					 * 입금액을 더해서 잔고값을 바꾸는 것 
					 * balance= clientList.get(i).getBalance()+deposit;
					 * clientList.get(i).setBalance(balance);
					 * clientList.get(i).setBalance(clientList.get(i).getBalance()+deposit); } else
					 * { System.out.println("없는계좌입니다."); }
					 * 
					 * 
					 * }
					 */
					
					// BankService클래스에 있는 입금용 메소드호출
					
					clientList= bs.deposit(clientList);
					
					//리턴이 있는 메소드호출방식 clientList같은 받아주는 매개체가 필요
								
					break;
				case 4:
					
//					System.out.println("계좌");
//					accountNumber=scan.next();
//					System.out.println("출금액");
//					int withdraw=scan.nextInt();
//					for(int i=0; i<clientList.size(); i++) {
//						if(withdraw<=clientList.get(i).getBalance()) {
//							balance=clientList.get(i).getBalance()-withdraw;
//							clientList.get(i).setBalance(balance);
//						}else {
//							System.out.println("없는 계좌 입니다.");
//						}
//					}
					
					clientList= bs2.withraw(clientList);
				  	
				   
					break;
				case 5:
					//고객리스트(clientList)
					for(int i=0; i<clientList.size(); i++) {
						System.out.print(clientList);
					}
					break;
					
				case 6:
					//종료
					System.out.println("종료");
					break;
				
			}
		}
	}
}
