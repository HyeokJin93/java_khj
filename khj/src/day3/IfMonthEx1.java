package day3;

import java.util.Scanner;

public class IfMonthEx1 {

	public static void main(String[] args) {
		/*월을 입력받아 입력받은 월의 마지막 일을 출력하는 코드를 작성하세요.
		 * 단, 2월은 28일
		 * 31 : 1 3 5 7 8 10 12
		 * 30 : 4 6 9 11 
		 * */
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("월을 입력하세요(1~12) : ");
		
		int num = scan.nextInt();
		
		if(num == 1 || num == 3 || num == 5 || num == 7 || num == 8 || num == 10 || num == 12) {
			System.out.println(num + "월의 마지막 일은 31일 입니다.");
		}
		else if(num == 4 || num == 6 || num == 9 || num == 11) {
			System.out.println(num + "월의 마지막 일은 30일 입니다.");
		}
		else if(num ==2) {
			System.out.println(num + "월의 마지막 일은 28일 입니다.");
		}
		
		else {
			System.out.println("입력을 잘못했습니다.");
		}
	
		
		
		
		
		scan.close();
	}

}
