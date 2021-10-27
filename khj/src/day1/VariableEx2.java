package day1;

public class VariableEx2 {
	//변수명 작성 규칙과 관례 예제
	public static void main(String[] args) {

		int num1 = 0; // 가능
		//int 1num = 0; //에러발생. 숫자로 시작할수없음
		//int num1 = 0; //에러발생. 중복 불가
		//int _; //에러발생. _단독 사용 불가
		int abc_; //가능
		//int abc#; //에러발생. _와 $를 제외한 특수문자 사용 불가능
		int 변수; //한글 가능하지만 잘 사용하지 않음
		//int int; //에러발생. 키워드 사용 불가
		int Num1 = 0; //가능. 대소문자 구분. 일반적으로 첫글자는 소문자로.
		
	}

}
