package Bank_Service;

import java.util.*;

import Bank.Bank;

import BankMain.Bank_Main;


//service Class :처리를 담당하는 클래스(비즈니스 클래스)

public class Bank_Service {

	Scanner scan = new Scanner(System.in);

	// 입금처리를 위한 메소드선언
	/*
	 * 메소드이름 : deposit 매개변수 : clientList Return : (스왑된) clientList
	 */

	// 메소드를 정의할때 쓰는 방식 List<Bank>=타입_deposit=변수이름_List
	// <Bank>_(매개변수)clientList(수정가능한부분)

	 public List <Bank> deposit(List<Bank> clientList) {

		System.out.print("계좌 :");
		String accountNumber = scan.next();
		System.out.print("입금액 :");

		int deposit = scan.nextInt();

		for (int i = 0; i < clientList.size(); i++) {
			if (accountNumber.equals(clientList.get(i).getAccountNumber())) { // 같은 계좌를 찾았으면 입금처리 
																			   //입금처리: 기존 잔고에 입금액을더해서 잔고값을 바꾸는 것 
					
				int balance=clientList.get(i).getBalance()+deposit;
				clientList.get(i).setBalance(balance);
				clientList.get(i).setBalance(clientList.get(i).getBalance() + deposit);
				
			} else {
				System.out.println("없는계좌입니다.");
			}

		}

		return clientList;

	}
}