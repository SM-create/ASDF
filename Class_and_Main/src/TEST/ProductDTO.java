package TEST;

public class ProductDTO {

	
	private int pNumber;
	private int pPrice;
	private int pStock;
	private String pName;
	
	public ProductDTO() {
		
	}
	
	public ProductDTO(int pNumber,int pPrice, int pStock, String pName) {
		this.pName=pName;
		this.pNumber=pNumber;
		this.pPrice=pPrice;
		this.pStock=pStock;
	}

	public int getpNumber() {
		return pNumber;
	}

	public void setpNumber(int pNumber) {
		this.pNumber = pNumber;
	}

	public int getpPrice() {
		return pPrice;
	}

	public void setpPrice(int pPrice) {
		this.pPrice = pPrice;
	}

	public int getpStock() {
		return pStock;
	}

	public void setpStock(int pStock) {
		this.pStock = pStock;
	}

	public String getpName() {
		return pName;
	}

	public void setpName(String pName) {
		this.pName = pName;
	}

	@Override
	public String toString() {
		return "ProductDTO [pNumber=" + pNumber + ", pPrice=" + pPrice + ", pStock=" + pStock + ", pName=" + pName
				+ "]";
	}
	
	
}
