package Bank_Service;

import java.util.*;

import Bank.Bank;

import BankMain.Bank_Main;


//service Class :ó���� ����ϴ� Ŭ����(����Ͻ� Ŭ����)

public class Bank_Service {

	Scanner scan = new Scanner(System.in);

	// �Ա�ó���� ���� �޼ҵ弱��
	/*
	 * �޼ҵ��̸� : deposit �Ű����� : clientList Return : (���ҵ�) clientList
	 */

	// �޼ҵ带 �����Ҷ� ���� ��� List<Bank>=Ÿ��_deposit=�����̸�_List
	// <Bank>_(�Ű�����)clientList(���������Ѻκ�)

	 public List <Bank> deposit(List<Bank> clientList) {

		System.out.print("���� :");
		String accountNumber = scan.next();
		System.out.print("�Աݾ� :");

		int deposit = scan.nextInt();

		for (int i = 0; i < clientList.size(); i++) {
			if (accountNumber.equals(clientList.get(i).getAccountNumber())) { // ���� ���¸� ã������ �Ա�ó�� 
																			   //�Ա�ó��: ���� �ܰ� �Աݾ������ؼ� �ܰ��� �ٲٴ� �� 
					
				int balance=clientList.get(i).getBalance()+deposit;
				clientList.get(i).setBalance(balance);
				clientList.get(i).setBalance(clientList.get(i).getBalance() + deposit);
				
			} else {
				System.out.println("���°����Դϴ�.");
			}

		}

		return clientList;

	}
}