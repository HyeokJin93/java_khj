package day4;

public class ForLCMEx1 {

	public static void main(String[] args) {
		/*두 정수의 최소 공배수를 구하는 코드를 for문을 이용하여 작성하세요.
		 *a의 배수 : 어떤 정수를 a로 나누었을 때 나머지가 0인 수 들
		 *4의 배수 : 4 8 12 16 20 ...
		 *6의 배수 : 6 12 18 24 30 ...
		 *공배수 : 두 정수의 배수 중 공통으로 있는 배수들
		 *4와 6의 공배수 : 12 24 36 48 ...
		 *최소 공배수는 : 두 정수의 공배수 중 가장 작은 수
		 *4와 6의 최소 공배수 : 12
		 *흰트
		 *방법1 : 무조건 1부터 시작하기 때문에 num1과 num2가 크면 반복횟수가 많아진다.
		 *num는 2의 배수 => num % 2 == 0
		 *반복횟수 : i는 1부터 시작해서 num1*num2까지 1씩 증가
		 *규칙성  : i가 num1의 배수이고 i가 num2의 배수이면 i를 출력하고 반복문을 종료
		 * */
		
		int num1=3;
		int num2=6;
		int i;
		for(i=1 ; i <= num1 * num2 ; i++ ) {
			if(i % num1 == 0 && i % num2 == 0 ) {
				break;	
			}
		}
		System.out.println(num1 + "과 " + num2 + "의 최소공배수는 " + i + "입니다.");
			
		/*방법2 : num1부터 시작해서 num1 * num2 까지 num1씩 증가
		 *반복횟수 : num1부터 시작해서 num1 * num2 까지 num1씩 증가
		 *규칙성 : i가 num2의 배수이면 i를 출력하고 반복문을 종료
		 *num1 == 100000 num2 == 200000
		 * */
		
		for(i=num1;i <=num1 * num2; i += num1) {
			if(i % num2 == 0 ) {
				break;	
			}	
		}
		System.out.println(num1 + "과 " + num2 + "의 최소공배수는 " + i + "입니다.");

		
	}

}
