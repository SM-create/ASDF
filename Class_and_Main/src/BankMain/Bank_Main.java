package BankMain;

import java.util.*;

import Bank.Bank;

import Bank_Service.Bank_Service;

import Bank_Service_2.BankService2;

public class Bank_Main {
	
	public static void main(String[] args) {
		
		//������¹���//
		
		Scanner scan=new Scanner(System.in);
		boolean run=true;
		
		//����ü�� ������ List����
		// Bank Ŭ����Ÿ��
		List <Bank> clientList =new ArrayList <Bank>();
		
		//Bank_serviceŬ���� ��ü (1���� �־�ȴ�..)
		Bank_Service bs =new Bank_Service();
		BankService2 bs2 =new BankService2();
		
		while (run) {
			System.out.println("---------------------------------------------------------------------");
			System.out.println("1. ����� get.,set | 2.�����(������) | 3.�Ա� | 4.��� | 5.������Ʈ | 6.����"); 
			System.out.println("---------------------------------------------------------------------");
			System.out.println("����>");
			int select =scan.nextInt();
			
			//Bank Ŭ���� Ÿ���� ���� client
			
			Bank client =null;
			
			switch (select) {
				
				case 1:
					
					
					client = new Bank();
					
					int clientNumber=clientList.size()+1;	
					
					System.out.print("�̸� : ");
					String name =scan.next();
					
					System.out.print("���� : ");
					String accountNumber =scan.next();
					
					System.out.print("�Աݾ� : ");
					int balance =scan.nextInt();
					
					//�Է¹��� ���� bank��ü�ʵ尪���� ����
					client.setClientNumber(clientNumber);
					client.setName(name);
					client.setAccountNumber(accountNumber);
					client.setBalance(balance);
					
					client.setClientNumber(balance);
					//�Ѽ�Ʈ�� �� ����� ���� �ʵ尪�����̳����� ArrayList�� ����
					clientList.add(client);
					
					break;
				
				case 2:
					//����ȣ�� ��� �ϳ��� �ø���..
					
					System.out.print("�̸� :");
					name = scan.next();
					System.out.print("���� :");
					accountNumber = scan.next();
					System.out.print("�Աݾ� :");
					balance =scan.nextInt()	;
					client = new Bank(0 ,name, accountNumber, balance);	
					clientList.add(client);
					
					break;
				
				case 3:
					//�Ա��Ұ��¹�ȣ�� �Աݱݾ��� �Է¹ް�
					//�Է��� ���¿� ������ ���¹�ȣ�� ArrayList���� ��� ��ġ�� �ִ���
					//���¹�ȣ(String) String�� ������ ���Ҷ��� ==�����ʰ� .equal ���
					
					/*
					 * System.out.print("���� :"); accountNumber =scan.next();
					 * System.out.print("�Աݾ� :"); int deposit=scan.nextInt(); for(int i=0;
					 * i<clientList.size(); i++) { if( accountNumber.equals(
					 * clientList.get(i).getAccountNumber())) { //���� ���¸� ã������ �Ա�ó�� //�Ա�ó��: ���� �ܰ�
					 * �Աݾ��� ���ؼ� �ܰ��� �ٲٴ� �� 
					 * balance= clientList.get(i).getBalance()+deposit;
					 * clientList.get(i).setBalance(balance);
					 * clientList.get(i).setBalance(clientList.get(i).getBalance()+deposit); } else
					 * { System.out.println("���°����Դϴ�."); }
					 * 
					 * 
					 * }
					 */
					
					// BankServiceŬ������ �ִ� �Աݿ� �޼ҵ�ȣ��
					
					clientList= bs.deposit(clientList);
					
					//������ �ִ� �޼ҵ�ȣ���� clientList���� �޾��ִ� �Ű�ü�� �ʿ�
								
					break;
				case 4:
					
//					System.out.println("����");
//					accountNumber=scan.next();
//					System.out.println("��ݾ�");
//					int withdraw=scan.nextInt();
//					for(int i=0; i<clientList.size(); i++) {
//						if(withdraw<=clientList.get(i).getBalance()) {
//							balance=clientList.get(i).getBalance()-withdraw;
//							clientList.get(i).setBalance(balance);
//						}else {
//							System.out.println("���� ���� �Դϴ�.");
//						}
//					}
					
					clientList= bs2.withraw(clientList);
				  	
				   
					break;
				case 5:
					//������Ʈ(clientList)
					for(int i=0; i<clientList.size(); i++) {
						System.out.print(clientList);
					}
					break;
					
				case 6:
					//����
					System.out.println("����");
					break;
				
			}
		}
	}
}
