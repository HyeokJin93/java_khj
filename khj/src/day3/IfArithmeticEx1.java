package day3;

import java.util.Scanner;

public class IfArithmeticEx1 {

	public static void main(String[] args) {
		
		/* 두 정수와 산술연산자를 입력하면 이에 맞는 결과값을 하고, 산술연산자가 아니면 산술연산자가 아닙니다 라고 출력하는 코드를 작성
		 * 예시 )
		 * 두 정수와 산술 연산자를 입력하세요 (예: 1 + 2) : 1 + 2
		 * 1 + 2 = 3
		 * 예시 )
		 * 두 정수와 산술 연산자를 입력하세요 (예: 1 + 2) : 1 / 2
		 * 1 + 2 = 3
		 * 
		 * 1. 두 정수와 산술연산자를 입력 : Scanner를 통해
		 * 2. 조건문
		 * */
	
		Scanner scan = new Scanner(System.in);
		
		System.out.print("두 정수와 산술연산자를 입력하세요(예: 1 + 2)");
		int num1 = scan.nextInt();
		char operator = scan.next().charAt(0);
		int num2 = scan.nextInt();
		System.out.println("" + num1 + " " + operator + " " + num2);

		if(operator == '+') {
			System.out.println("" + num1 + " " + operator + " " + num2 + " = " + (num1 + num2));
		}
		else if(operator == '-') {
			System.out.println("" + num1 + " " + operator + " " + num2 + " = " + (num1 - num2));
			}
		else if(operator == '*') {
			System.out.println("" + num1 + " " + operator + " " + num2 + " = " + (num1 * num2));
			}
		else if(operator == '/') {
			System.out.println("" + num1 + " " + operator + " " + num2 + " = " + ((double)num1 / num2));
			}
		else if(operator == '%') {
			System.out.println("" + num1 + " " + operator + " " + num2 + " = " + (num1 % num2));
		}
		else{
			System.out.println(operator + "는 산술연산자가 아닙니다.");
		}
		
		scan.close();
	}

}

