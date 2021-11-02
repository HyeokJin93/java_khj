package day5;

public class WhileHelloEx1 {

	public static void main(String[] args) {
		/*Hello를 5번 출력하는 코드를 While문으로 작성하세요.
		 * 반복횟수 : i 는 1부터 5까지 1씩 증가
		 * 규칙성(실행문) : Hello를 출력
		 * */
		
		int i = 1 ; // 1. 초기화
		while(i<=5) { // 2. 조건식
			System.out.println("Hello"); // 3. 실행문
			i++; // 4. 증감식 

		}
		
	}

}
