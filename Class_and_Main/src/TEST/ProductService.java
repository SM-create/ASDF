package TEST;

import java.util.List;
import java.util.*;

public class ProductService {

	Scanner scan= new Scanner(System.in);
	
	public void productList(List<ProductDTO>productList) {
		
		//case 2
		for (int i=0; i<productList.size(); i++) {
			System.out.println(productList.get(i));
		}
	}
	
	//case 3
	public List <ProductDTO>productUpdate(List<ProductDTO>productList) {
		System.out.print("��ǰ���� �Է��ϼ��� :");
		String pName=scan.next();
		for (int i=0; i<productList.size(); i++) {
			if(pName.equals(productList.get(i).getpName())) {
				System.out.println("��ǰ���� :");
				int pPrice=scan.nextInt();
				System.out.println("��� :");
				int pStock=scan.nextInt();
				productList.get(i).setpPrice(pPrice);
				productList.get(i).setpStock(pStock);
				
			}else {
				System.out.println("��ϵ������� ��ǰ�Դϴ�.");
			}
		}
		
		return productList;
	}
	
	//case 4
	
	public List<ProductDTO>productDelete(List<ProductDTO>productList){
		System.out.println("��ǰ��ȣ :");
		int pNumber =scan.nextInt();
		for(int i=0; i<productList.size(); i++) {
			if(pNumber==productList.get(i).getpNumber()) {
				productList.remove(i);
			}else {
				System.out.println("��ϵ������� ��ȣ�Դϴ�.");
			}
		}
		return productList;
	}

    
}