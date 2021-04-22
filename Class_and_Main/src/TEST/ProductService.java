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
		System.out.print("상품명을 입력하세요 :");
		String pName=scan.next();
		for (int i=0; i<productList.size(); i++) {
			if(pName.equals(productList.get(i).getpName())) {
				System.out.println("상품가격 :");
				int pPrice=scan.nextInt();
				System.out.println("재고량 :");
				int pStock=scan.nextInt();
				productList.get(i).setpPrice(pPrice);
				productList.get(i).setpStock(pStock);
				
			}else {
				System.out.println("등록되지않은 상품입니다.");
			}
		}
		
		return productList;
	}
	
	//case 4
	
	public List<ProductDTO>productDelete(List<ProductDTO>productList){
		System.out.println("상품번호 :");
		int pNumber =scan.nextInt();
		for(int i=0; i<productList.size(); i++) {
			if(pNumber==productList.get(i).getpNumber()) {
				productList.remove(i);
			}else {
				System.out.println("등록되지않은 번호입니다.");
			}
		}
		return productList;
	}

    
}