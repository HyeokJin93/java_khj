package day5;

public class ArrayEx2 {

	public static void main(String[] args) {
		/*
		 * */
		int arr[] = new int[5];
		//배열 arr의 0번지에 1을 저장
		arr[0] = 1;
		System.out.println("0번지의 값 : " + arr[0]);
		arr[1] = 2;
		System.out.println("1번지의 값 : " + arr[1]);
		arr[2] = 3;
		System.out.println("2번지의 값 : " + arr[2]);
		arr[3] = 4;
		System.out.println("3번지의 값 : " + arr[3]);
		arr[4] = 5;
		System.out.println("4번지의 값 : " + arr[4]);
		
		
		System.out.println("----------------");
		int num = 0;
		
		for(num=0 ; num<=4 ; num++) {
			arr[num] = num + 1;
			System.out.println(num + "번지의 값 : " + arr[num]);
		}
	}

}
