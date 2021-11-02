package day5;

public class PrintAlphabetEx1 {

	public static void main(String[] args) {
		/*zyz...cba가 출력되도록 코드를 작성하세요.
		 * */
		for(int i =0 ; i < 26 ; i++) {
			System.out.print((char)('z' - i) + " ");
		}
			
		System.out.println();
		
		char ch;
		for(ch = 'z' ; ch>='a' ; ch--)
			System.out.print(ch + " ");
	}

}
