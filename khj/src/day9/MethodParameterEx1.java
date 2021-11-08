package day9;

public class MethodParameterEx1 {
	// 매개변수가 가변인자인 경우
	public static void main(String[] args) {
		System.out.println(sum());
		System.out.println(sum(1));
		System.out.println(sum(1,2));

	//	System.out.println(sum2()); // 에러 발생 : 매개변수가 없어서
		int arr[] = new int [] {1};
		System.out.println(sum2(new int[]{1}));
		System.out.println(sum2(new int[]{1,2}));
	
	// 
		printInfo(1,1,1,"홍길동","임꺽정","도둑","영웅");
	
		
		
	}
	/* 기능 : 정수가 주어지면 정수의 합을 알려주는 메소드
	 * 매개변수 : 정수(하나일수도, 여러개 일수도) = ? int ... nums
	 * 리턴타입 : 정수의 합 = > 정수 = > int
	 * 메소드명 : sum
	 * */
	
	public static int sum (int ... nums) {
		int sum=0;
		for (int i =0 ; i < nums.length; i++) {
			sum+=nums[i];
		}
		return sum;
	}
	
	public static int sum2(int []nums) {
		int sum=0;
		for (int i =0 ; i < nums.length; i++) {
			sum+=nums[i];
		}
		return sum;
	}
	
	
	/* 기능 : 학생 학년, 반, 번호, 이름, 별명들이 주어지면 학생 정보를 콘솔에 출력하는 메소드
	 * 매개변수 : 학년 반 번호 이름 별명(0~여러개)
	 * 			=> int grade, int classNum, int num, String name, String ...nickname
	 * 리턴타입 : 출력하는 = > 없음 => void
	 * 메소드명 : printInfo
	 * */
	//p.129 일반 매개변수와 가변 매개변수를 섞어 쓸 때 가변 매개변수를 마지막에 써야함
	public static void printInfo (int grade, int classNum, int num,
			String name, String ... nicknames) {
		System.out.println("학년 : " + grade);
		System.out.println("반 : " + classNum) ;
		System.out.println("번호 : " + num);
		System.out.println("이름 : " + name);
		System.out.println("별명 : ");
		for( int i =0 ; i<nicknames.length; i++){
			System.out.print(nicknames[i] + " ");
		}
		
	}
	//p.130 가변 매개변수는 여러개 쓸 수 없음
	//public static void printInfo(int ...grade, String ...strings names )
	
}
