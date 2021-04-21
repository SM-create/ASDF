package day17_20210422_01;

public class ClientDTO {
	private int clientNumber;
	private String name;
	private String phone;

	public ClientDTO() {

	}

	public ClientDTO(int clientNumber, String name, String phone) {
		this.clientNumber = clientNumber;
		this.name = name;
		this.phone = phone;
	}

	public int getClientNumber() {
		return clientNumber;
	}

	public void setClientNumber(int clientNumber) {
		this.clientNumber = clientNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "ClientDTO [clientNumber=" + clientNumber + ", name=" + name + ", phone=" + phone + "]";
	}

}
