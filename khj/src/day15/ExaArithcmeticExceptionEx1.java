package day15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExaArithcmeticExceptionEx1 {

	public static void main(String[] args) {
		/* 두 정수와 산술 연산자를 입력받아 산술 연산 결과를 출력하는 코드를 작성하세요
		 * 단, 메소드를 이용하고 예외 처리(throw이용)를 하세요.*/
		
		int num1, num2; 
		char op;
		double res = 0.0;
		Scanner scan = new Scanner(System.in);
		
		System.out.println("두 정수와 산술 연산자를 입력하세요(예 : 1 + 3 )");
		try{
			num1 = scan.nextInt();
			op = scan.next().charAt(0);
			num2 = scan.nextInt();
			res = arithmetic(num1, op, num2);
			System.out.println("" + num1 + op + num2 + " = " + res);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch(InputMismatchException e) {
			System.out.println("입력을 제대로 하세요.");
		}catch(Exception e) {
			//System.out.println(e.getMessage());
			e.printStackTrace();
		}
		scan.close();
	}
	public static double arithmetic(int num1, char op, int num2) throws Exception {
		double res = 0.0;
		switch(op) {
		case '+' : res = num1 + num2;			 break;
		case '-' : res = num1 - num2; 			 break;
		case '*' : res = num1 * num2;			 break;
		case '/' : res = num1 / (double)num2;	 break;
		case '%' : res = num1 % num2; 			 break;
		default  : throw new Exception("잘못된 연산자입니다."); 
		}
		return res;
	}
}
