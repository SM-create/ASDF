package TEST;

import java.util.*;

public class ProductMain {

	public static void main(String[] args) {

		//T1.��ǰ���� ���α׷�����
		
		Scanner scan=new Scanner(System.in);
		
		List<ProductDTO>productList=new ArrayList<ProductDTO>();
		boolean run=true;
		ProductDTO product=null;
		ProductService ps=new ProductService();
		
		while(run) {
		 System.out.println("----------------------------------------------");
		 System.out.println("1.��ǰ��� | 2.��ü��ǰ��ȸ | 3.��ǰ�������� | 4.��ǰ����");
		 System.out.println("----------------------------------------------");
		 System.out.println("����>");
		 int select =scan.nextInt();
		 
		 switch (select) {
		 
		 case 1:
			 //��ǰ��� : ��ǰ��, ��ǰ����, ����� �Է��ϰ� ��ǰ��ȣ�� �ڵ����� �Էµǰ���.
			 int pNumber =productList.size()+1;
			 System.out.print("��ǰ�� :");
			 String pName=scan.next();
			 System.out.print("��ǰ���� :");
			 int pPrice=scan.nextInt();
			 System.out.print("��� :");
			 int pStock=scan.nextInt();
			 product= new ProductDTO(pNumber,pPrice,pStock,pName);
			 productList.add(product);
			 break;
			 
		 case 2:
			 //��ü��ǰ��ȸ : ��ü��ǰ�� ���.
			 ps.productList(productList);
			 break;
		 case 3:
			 //��ǰ�������� : ��ǰ����, ����� ������ �� ����.
			 productList=ps.productUpdate(productList);
			 break;
		 case 4:
			 //��ǰ���� :��ǰ��ȣ�� �Է��ϸ� �ش� ��ǰ�� ������ �� ����.
			 productList=ps.productDelete(productList);
			 break;
			
			 
		 }
		}
	}

}
