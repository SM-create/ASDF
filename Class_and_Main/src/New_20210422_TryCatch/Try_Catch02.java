package New_20210422_TryCatch;


public class Try_Catch02 {

	public static void main(String[] args) {

		// 나눗셈을 할때
		// a/b에서 b가 0이면 발생하는 예외를 확인하고
		// 예외처리를 할 수 있는 코드를 작성해보세요
		// 예외가 발생하는 경우 "0으로 나눌수없습니다." 를 출력


	

		try {
			int a = 5;
			int b = 0		;
			System.out.println(a / b);

		} catch (ArithmeticException e) {
			System.out.println("0으로 나눌수없습니다.");
		} catch (Exception e) {
			System.out.println("다른 예외");
		}


	}

}
