package TEST;

import java.util.*;

public class ProductMain {

	public static void main(String[] args) {

		//T1.상품관리 프로그램개발
		
		Scanner scan=new Scanner(System.in);
		
		List<ProductDTO>productList=new ArrayList<ProductDTO>();
		boolean run=true;
		ProductDTO product=null;
		ProductService ps=new ProductService();
		
		while(run) {
		 System.out.println("----------------------------------------------");
		 System.out.println("1.상품등록 | 2.전체상품조회 | 3.상품정보수정 | 4.상품삭제");
		 System.out.println("----------------------------------------------");
		 System.out.println("선택>");
		 int select =scan.nextInt();
		 
		 switch (select) {
		 
		 case 1:
			 //상품등록 : 상품명, 상품가격, 재고량을 입력하고 상품번호는 자동으로 입력되게함.
			 int pNumber =productList.size()+1;
			 System.out.print("상품명 :");
			 String pName=scan.next();
			 System.out.print("상품가격 :");
			 int pPrice=scan.nextInt();
			 System.out.print("재고량 :");
			 int pStock=scan.nextInt();
			 product= new ProductDTO(pNumber,pPrice,pStock,pName);
			 productList.add(product);
			 break;
			 
		 case 2:
			 //전체상품조회 : 전체상품을 출력.
			 ps.productList(productList);
			 break;
		 case 3:
			 //상품정보수정 : 상품가격, 재고량을 수정할 수 있음.
			 productList=ps.productUpdate(productList);
			 break;
		 case 4:
			 //상품삭제 :상품번호를 입력하면 해당 상품을 삭제할 수 있음.
			 productList=ps.productDelete(productList);
			 break;
			
			 
		 }
		}
	}

}
