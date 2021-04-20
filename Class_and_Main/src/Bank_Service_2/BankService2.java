package Bank_Service_2;

import java.util.*;

import Bank.Bank;

import BankMain.Bank_Main;

public class BankService2 {

	Scanner scan = new Scanner(System.in);
	
	// 출금처리를 위한 메소드선언
	/*
	 *  메소드이름 : withraw
	 *  매개변수 :clientList
	 *  리턴 :clientList	 
	 */  

	public List<Bank> withraw(List<Bank> clientList) {

		System.out.println("계좌 :");
		String accountNumber = scan.next();
		System.out.println("출금액 :");
		
		int withdraw = scan.nextInt();
		
		for (int i = 0; i < clientList.size(); i++) {
			if (withdraw <= clientList.get(i).getBalance()) {
				int balance = clientList.get(i).getBalance() - withdraw;
				clientList.get(i).setBalance(balance);
			} else {
				System.out.println("없는 계좌 입니다.");
			}
		}

		return clientList;
	}

}
