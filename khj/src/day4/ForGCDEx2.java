package day4;

public class ForGCDEx2 {

	public static void main(String[] args) {
		/*두 정수의 최대공약수를 출력하는 코드를 for문을 이용하여 작성하세요.
		 *반복횟수 : i는 1부터 num1까지 1씩 증가
		 *규칙성 : i가 num1의 약수이고, i가 num2의 약수이면 gcd변수에 i를 저장
		 *		=> num1을 i로 나누었을때 나머지가 0과 같고,
		 *		   num2를 i로 나누었을때 나머지가 0과 같으면
		 *		   gcd변수에 i를 저장
		 *		   반복문 종료 후 : gcd를 출력
		 * */
		int i;
		int gcd=0;
		int num1 = 8, num2 = 12;
		for(i = 1 ; i <= num1 ; i=i+1) {
			if(num1 % i == 0 && num2 % i == 0 ) {
		gcd = i;
			}
		}
		System.out.println(num1 + "과 " + num2 + "의 최대 공약수 : " + gcd);
		
	}

}
