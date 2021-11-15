package day14;

import java.util.Random;

public class ExbMathEx1 {

	public static void main(String[] args) {
		/* Math 클래스는 수학 관련 클래스(p.309)
		 * Math 클래스에 있는 모든 메소드는 클래스 메소드로 되어있고, 2개의 상수가 있다
		 * static붙은 메소드는 클래스 메소드
		 * 그러므로 모두 앞에 static을 붙여야 함.
		 */
		  
		  
		// double abs(double a) : 절대값
			System.out.println("-2의 절대값 : " + Math.abs(-2));
			System.out.println("-2의 절대값 : " + abs(-2));
		//double ceil(double a) : a를 소수점 자리에서 올림(소수점 자리가 000이 아니면 정수에서 올림)
			System.out.println("3.1의 올림 : " + Math.ceil(3.1));
			System.out.println("-3.1의 올림 : " + Math.ceil(-3.1));
		//double floor(double a) : a를 소수점 자리에서 내림
			System.out.println("3.1의 내림 : " + Math.floor(3.1));
			System.out.println("-3.1의 내림 : " + Math.floor(-3.1));
		//int max(int a, int b) : a와 b 중 큰 수를 알려줌	
		System.out.println("1과 5중 큰 수 : " + Math.max(1, 5));

		/* double pow(double a, double b) : 제곱
		 * long round round(double a) : 반올림
		 * double sqrt(double a) : 루트
		 * */


		
	}
	public static int abs(int a) {
		return a >= 0 ? a : -a;
}
}
