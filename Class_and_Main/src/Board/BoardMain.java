package Board;

import java.util.*;

import Board.Board;

public class BoardMain {

	public static void main(String[] args) {

		//�Խ��� ������Ʈ
		
		Scanner scan=new Scanner(System.in);
		
		boolean run=true;
		
		List <Board> boardList=new ArrayList<Board>();
		
		Board bd=null;
		
		BoardService bs=new BoardService();
		

		
		while(run) {
			System.out.println("------------------------------------------------------");
			System.out.println("1. �۾��� | 2.��ü�۸�� | 3.����ȸ | 4.�ۼ��� | 5.�ۻ��� "); 
			System.out.println("------------------------------------------------------");
			System.out.println("����>");
			int select =scan.nextInt();
			
			
			switch(select) {
			
			case 1:
				//�۾���: �۹�ȣ�� ������ ��� �׸��� �Է��ϰ� �۹�ȣ�� �ڵ����� �ϳ��� �ö󰣴�.
				
				bd=new Board();
				
				//�۹�ȣ�� �ϳ��� �ö�
				int number=boardList.size()+1;
				
				System.out.print("���� :");
				String title=scan.next();
				System.out.println("��й�ȣ :");
				String password=scan.next();
				System.out.println("�ۼ��� :");
				String people=scan.next();
				System.out.println("���� :");
				String content=scan.next();
				
				//board��ü �ʵ尪���� ����
				
				bd.setContent(content);
				bd.setTitle(title);
				bd.setPassword(password);
				bd.setNumber(number);
				bd.setPeople(people);
				//�ʵ尪�� ������ ArrayList�� ����
				boardList.add(bd);
				
				break;
				
			case 2:
				
				//��ü�� ���
				for(int i=0; i<boardList.size(); i++) {
					System.out.print(boardList.get(i));
				}
				
				break;
				
			case 3:
				//����ȸ: �۹�ȣ�� �Է��ϸ� �ش���� �������� ��µȴ�.
				
				System.out.println("��ȣ�� �Է��ϼ���.");
				number=scan.nextInt();
				
				for(int i=0; i<boardList.size(); i++) {
					if(number-1==i) {
					System.out.println(boardList.get(i));
					}
				}
				
				break;
				
			case 4:
				//�ۼ���: �۹�ȣ, ��й�ȣ�� �Է��ϰ� ������ ������ 
				//����,������ ������ ���ְ� ������ �Ϸ�Ǹ� �ش���� �󼼳����� ����Ѵ�.
				
				System.out.println("�۹�ȣ :");
				number=scan.nextInt();
				System.out.println("��й�ȣ :");
				password=scan.next();
				
				for(int i=0; i<boardList.size(); i++) {
					
					if(number-1==i && password.equals(boardList.get(i).getPassword())) {
						System.out.println("������ �Է��ϼ��� :");
						title=scan.next();
						boardList.get(i).setTitle(title);
						System.out.println("������ �Է��ϼ��� :");
						content=scan.next();
						
						//baordList�� ����� ���밪�� ����
						boardList.get(i).setContent(content);
						
					}else {
						System.out.println("��ȣ �Ǵ� ��й�ȣ�� Ʋ���ϴ�.");
					}
				}
				
				
				break;
				
			case 5:
				//�ۻ���: �۹�ȣ,��й�ȣ�� �Է��ϰ� ������ �ش�� ����
				
				System.out.println("�۹�ȣ :");
				number=scan.nextInt();
				
				System.out.println("��й�ȣ :");
				password=scan.next();
				
				int temp=0;
				
				for (int i=0; i<boardList.size(); i++) {
					
					for(int j=i+1; j<boardList.size(); j++ ) {
				
				if(number-1==i && password.equals(boardList.get(i).getPassword())) {
						
					temp = boardList.size();
					boardList.size= boardList[j];
					boardList.get(i).setnumber(number);
				}
				
			else {
				System.out.println("��ȣ �Ǵ� ��й�ȣ�� Ʋ���ϴ�.");
			}
		
			}	
				}	
				
				
				break;
				
				
				
			}
		}
		
		
		
				
				
		
	}

}
