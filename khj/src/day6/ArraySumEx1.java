package day6;

public class ArraySumEx1 {

	public static void main(String[] args) {
		/*2부터 10사이의 짝수들을 배열에 저장하고, 배열에 저장된 값의 합을 출력하는
		 * 코드를 작성하세요.
		 * */
		
		//int arr[] = new int[5];
		//arr[0] = 2;
		//arr[1] = 4;
		//arr[2] = 6;
		//arr[3] = 8;
		//arr[4] = 10;
		
		int arr[] = new int[5];
		int i;
		for(i = 0 ; i<5 ; i++ ) {
				arr[i] = 2*i +2; //불가능
		}

		
		
		//int sum = 0;
		//sum = sum + arr[0];
		//sum = sum + arr[1];
		//sum = sum + arr[2];
		//sum = sum + arr[3];
	//	sum = sum + arr[4];
	//	System.out.println("2부터 10까지 짝수의 합 : " + sum);
		
		int sum = 0;
		i = 0;
		for(i=0 ; i<5 ; i++) {
			sum = sum + arr[i]; //가능
		}
		System.out.println("2부터 10까지 짝수의 합 : " + sum);
	}

}
