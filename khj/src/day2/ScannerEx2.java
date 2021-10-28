package day2;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		/* 콘솔에서 두 정수를 입력받아 입력받은 정수들의 합을 구하는 코드를 작성하세요*/
		Scanner scan = new Scanner(System.in);
		int num1, num2;
		System.out.print(" 두 정수를 입력하세요 (예: 1 2) : ");		
		num1 = scan.nextInt();
		num2 = scan.nextInt();
		
		int res1 = num1 + num2;
		double res2 = num1 / (double)num2; // 앞뒤 둘 중 하나만 하면 된다.
		System.out.println(num1 + " + " + num2 + " = " + res1);
		System.out.println(num1 + " / " + num2 + " = " + res2);
	
	
		scan.close();
		
	
	}

}
