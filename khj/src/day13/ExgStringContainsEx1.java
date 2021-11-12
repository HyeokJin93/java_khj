package day13;

public class ExgStringContainsEx1 {

	public static void main(String[] args) {
	/* boolean contains(CharSequence s) : s가 포함되어있으면 true 없으면 false
	 * */	
		String str1 = "Hello World";
		System.out.println(str1.contains("Wo"));
		System.out.println(str1.contains("wo"));

	}
}
