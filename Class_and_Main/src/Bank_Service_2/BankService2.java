package Bank_Service_2;

import java.util.*;

import Bank.Bank;

import BankMain.Bank_Main;

public class BankService2 {

	Scanner scan = new Scanner(System.in);
	
	// ���ó���� ���� �޼ҵ弱��
	/*
	 *  �޼ҵ��̸� : withraw
	 *  �Ű����� :clientList
	 *  ���� :clientList	 
	 */  

	public List<Bank> withraw(List<Bank> clientList) {

		System.out.println("���� :");
		String accountNumber = scan.next();
		System.out.println("��ݾ� :");
		
		int withdraw = scan.nextInt();
		
		for (int i = 0; i < clientList.size(); i++) {
			if (withdraw <= clientList.get(i).getBalance()) {
				int balance = clientList.get(i).getBalance() - withdraw;
				clientList.get(i).setBalance(balance);
			} else {
				System.out.println("���� ���� �Դϴ�.");
			}
		}

		return clientList;
	}

}
