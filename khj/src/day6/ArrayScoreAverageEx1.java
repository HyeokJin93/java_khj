package day6;

import java.util.Scanner;

public class ArrayScoreAverageEx1 {

	public static void main(String[] args) {
		/*배열을 이용하여 5명의 학생의 국어 성적을 입력받아 평균을 구하는 코드를작성하세요.
		 * 단, 성적을 배열에 저장해야 하고, 성적은 정수
		 
		 * */
		
		Scanner scan = new Scanner(System.in);
		
		//5개짜리 정수형 배열을 생성
		int arr[] = new int[5];
		
		//배열에 성적을 입력
		for(int i=0 ; i<5 ; i++) {
			System.out.print("학생" + (i+1) + "의 국어 점수를 입력하세요 : ");
			arr[i] = scan.nextInt();
		}
		
		/*
		arr[0] = num1;
		arr[1] = num2;
		arr[2] = num3;
		arr[3] = num4;
		arr[4] = num5;
		*/
		
		//배열의 합을 구함
		int sum = 0;
		int i = 0;
		for(i=0 ; i<5 ; i++) {
			sum = sum + arr[i];
		}
		
		//합을 이용하여 평균을 구한 후 출력
		double average = sum / 5.0;
		System.out.println("5명 학생의 평균은 : " + average + "점");

		
		scan.close();
		
	}

}
