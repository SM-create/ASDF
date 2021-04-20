
public class Bank_Service {

	// 필드선언
	private int in = 0;
	private int out = 0;
	private int sum = 0;

	// 생성자

	public Bank_Service() {

	}

	public Bank_Service(int in, int out, int sum) {

		this.in = in;
		this.out = out;
		this.sum = sum;

	}

	public int getIn() {
		return in;
	}

	public void setIn(int in) {
		this.in = in;
	}

	public int getOut() {
		return out;
	}

	public void setOut(int out) {
		this.out = out;
	}

	public int getSum() {
		return sum;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	@Override
	public String toString() {
		return "Bank_Service [in=" + in + ", out=" + out + ", sum=" + sum + "]";
	}

}
