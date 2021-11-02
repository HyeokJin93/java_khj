package day5;

public class khjD5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*while문
 * 
	while(조건식){
    	실행문;
	}
	1.초기화;
	while(2.조건식){
		3.실행문;
		4.증감식;
		}
		
	for문은 조건식이 생략되도 가능 => 무조건 참
	while문은 조건식을 생략할 수 없음
	
	while문과 for문은 언제 쓸까(강사는)?
		반복문 횟수가 정해져 있고, 증가하는 양이 정해져 있으면 for문
		반복횟수가 정해져 있지 않을 때, 증가하는 상황이 일정하지 않을 때 while문
		
continue문
	반복문에서 실행문안에서 쓰이고, 항상 if문과 같이 나옴.
	if문과 같이 안나오고 혼자 나오면 continue 밑에 있는 코드가 의미가 없어진다.
	skip과 같은 역할 => 특정위치로 위치
	for문에서는 증감식 위치로, while문에서는 조건식
	향상된 for문
	배열을 배운 후 살펴봄
	
do while문
	for문, while문과 동작 방식이 다름
	for문, while문은 상황에 따라 한번도 동작하지 않을 수 있다(O)
	do while문 조건식에 상관없이 무조건 1번은 실행된다.(1번 do => 조건식)
	
		do{
			실행문;
		}while(조건식);                  <--- ();의 대표적인 예
		
	최소 1번은 실행되어야 하는 경우
	
이중 반복문
	반복문 안에 반복문이 들어가 있는 형태
	
	for ( ; ; ) {
		for( ; ; ) {
		
		}
	}
	
	또는
	
	while(){
		while(){
		
		}
	}
	
이중반복문 사용시 주의사항
	괄호 실수 조심
	증감식 쓸 때 조심. 다른 반복문에서 사용하는 변수를 잘못 증가 or 감소 시키면 무한루프에 빠질 수 있음
	
	
조건문과 반복문 괄호 생략
	실행문이 1줄인 경우 {}를 생략할 수 있다.
	하지만 숙달되기 전 까지는 귀찮아도 쓰는게 낫다.
	

	
	
배열과 문자열 (p.102)

배열
	30명 학생의 수학 성적을 관리하려 한다.
		30개의 변수를 선언하면, 반복문을 이용할 수 없다. 변수 관리가 비효율적
	같은 자료형 변수를 모아놓은 것

	배열 선언 방법
		자료형 [] 배열명;
		자료형 배열명 [];
		
	배열 생성 방법
		자료형 [] 배열명 = new 자료형[배열크기];
		자료형 배열명 [] = new 자료형[배열크기];
		
	모든 변수는 기본 자료형 변수이거나 참조변수이다.
		기본 자료형 변수 : 실제 값을 저장하는 변수
		참조 변수 : 주소를 저장하는 변수
	
	배열은 참조변수
	배열은 번지를 이용하여 접근함. 시작번지는 0번지부터 배열크기 -1번지까지 있음
	
	//배열에 값을 저장
	 배열명[]번지 = 값;
	//변수 num에 배열의 값을 저장
	 num = 배열명[번지];
	
 * */
	}

}
