package day5;

public class PrimeNumEx1 {

	public static void main(String[] args) {
		/*2부터 100이하의 모든 소수를 출력하는 예제
		 * 소수 판별 예제 참고.
		 * */
		int num = 2;
		int i =1, count = 0;
		while(num<=100) { // num = 2
			i=1;       // 약수는 1부터 num까지 확인해야하므로 변수 초기화
			count=0;   // 변수 초기화 기억하기
			while(i<=num) { // 참이면 아래 실행문으로
				if(num % i==0) {
					count++;
				} // i<=num이 거짓일때 마무리.
				i++;
			}
			if(count==2) {
				System.out.print(num + " ");
			}
		num++;
		}
	}

}
