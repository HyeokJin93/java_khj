package day4;

public class ForAlphabetEx2 {

	public static void main(String[] args) {
		/*문자에 숫자를 더하면??
		 *문자와 숫자를 더하면 문자에 맞는 유니코드 값에서 1을 더한다.
		 *'a'는 코드값이 97이고, 'a'에 1을 더한 값은 98이 된다.
		 *이 값을 문자로 변환하면 해당 유니코드값에 맞는 문자 'b'가 된다.
		 * */


/* a부터 z까지 출력하는 코드를 for문을 이용하여 작성하세요.
 * 방법1
 * 반복횟수 : i는 0부터 26보다 작을때까지 1씩증가
 * 규칙성 : 문자 'a'+i를 출력
 * 
 * 방법2
 * 반복횟수 : ch는 'a'부터 'z'까지 1씩 증가
 * 규칙성 : ch를 출력
 * abcdefghijk...xyz*/

//방법1
int i=0;
for(;i<26;i++) {
	System.out.print((char)('a'+i) + " ");
}
System.out.println(" ");

//방법2
char ch = 'a';
for(;ch<='z';ch++) {
	System.out.print(ch + " ");
}


	}

}
