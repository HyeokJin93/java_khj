package day15;

public class ExbFinallyEx1 {

	public static void main(String[] args) {
		exceptionTest();
		

	}
	public static void exceptionTest() {
		int num = 1, num2 = 0 ;
		try {
			int res = num / num2;
			System.out.println(res);
		}catch(Exception e) {
			System.out.println("예외 처리");
			return; // 리턴으로 메소드가 중단되는 상황에도 finally안의 실행문은 실행됨
		}finally {
			System.out.println("파이널리");
		}
		System.out.println("메소드 마지막");
	}
}
