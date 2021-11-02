package day5;

public class MultipleTableEx1 {

	public static void main(String[] args) {
		/*2단에서 9단까지 구구단을 출력하는 코드를 작성하세요.
		 * */
		
		int i = 1, num = 2;
		for(num=2 ; num<=9 ; num++) {
			for(i = 1; i<=9; i++) {
				System.out.println(num + " x " + i + " = " +  num*i);
			}
			System.out.println("");
		}
		int num2, j;
	
		j=1;
		num2 = 2;
		while(num2<=9) {
			while(j<=9) {
				System.out.println(num2 + " x " + j + " = " +  num2*j);
				j++;
			}
			num2++;
		}
		
		
	}
}
