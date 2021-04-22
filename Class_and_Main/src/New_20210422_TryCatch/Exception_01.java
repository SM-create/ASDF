package New_20210422_TryCatch;

public class Exception_01 {

	public static void main(String[] args) {

		/*
		 * 예외(Exception)처리
		 * Try Catch 형식
		 * 
		 * try{
		 * 실행할 내용
		 * 
		 * }catch(익셉션 이름 e) {
		 * 	해당 예외 (익셉션)가 발생할 경우 실행할 내용
		 * }
		 */
		
		
		try {
			int[] num=new int [3];
			
			num[3]=10; //임의로 정한 오류가 발생할 위치	
			
			System.out.println("try 마지막줄");
			
		} catch (Exception e) {
			System.out.println("배열크기 초과"); //오류가 발생하더라도 중단되지 않도록 방지
			e.printStackTrace(); // 예외의 종류 파악을 도와줌
		} finally {
			System.out.println("예외가 나든 안나든 finally는 무조건 나옵니다.");
		}
		
		
//			int[] num=new int [3];
//			
//			num[3]=10;

			System.out.println("try catch 끝");
		
	}

}

