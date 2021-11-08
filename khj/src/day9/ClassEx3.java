package day9;

public class ClassEx3 {

	public static void main(String[] args) {
		//고등학교 학생 정보를 관리하기 위한 클래스를 생성하고, 테스트 해보세요.
		//그린고등학교에 다니는 1학년 1반 1번 홍길동 학생 객체를 생성하고,
		//학생 정보를 출력해보세요.
		
		High std1 = new High("그린고등학교", "홍길동" , 1, 1, 1);
		std1.printInfo();
	}

}

/* 클래스 : 고등학교 학생 정보를 관리하기 위한 클래스
 * 멤버변수 : 학교명, 학년, 반, 번호, 이름 등
 * 멤버메소드 
 * -정보 출력 기능
 * */
 
class High {
	String schoolName, name;
	int grade, classNum, num;

	
	public High() {
		this("고등학교","",1,1,1);
		System.out.println("this()");
		//schoolName = "고등학교", name = "";
		//grade = 1; classNum = 1; num = 1;
		
	}
		High(String schoolName, String name, int grade, int classNum, int num) {
		super();
		this.schoolName = schoolName;
		this.name = name;
		this.grade = grade;
		this.classNum = classNum;
		this.num = num;
	}

		public void printInfo(){
			System.out.println("학교명 : " + schoolName);
			System.out.println("이름 : " + name);
			System.out.println("학년 : " + grade);
			System.out.println("반 : " + classNum);
			System.out.println("번호 : " + num);
			
			System.out.println(schoolName + " " + grade +"학년 " + classNum +"반 " + num + "번 " + name);
			
		}

	
}
