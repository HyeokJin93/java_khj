package day9;

import java.util.Scanner;

public class ClassScoreEx1 {

	public static void main(String[] args) {
		/* 국어, 영어, 수학 성적을 관리하기 위한 클래스를 만들고 
		 * 학생 5명의 성적을 관리하기 위한 배열을 만드세요 
		 * 기능:
		 * 멤버 변수 : int kor, int eng, int math 
		 * 멤버메소드 : 
		 * */
		Score score[] = new Score[5]; // 5명의 학생 정보를 저장할 공간을 생성
		Scanner scan = new Scanner(System.in);		
		for(int i = 0 ; i < score.length ; i++) {
			System.out.print("이름 : ");
			String name = scan.next();
			System.out.print("국어 : ");
			int kor = scan.nextInt();
			System.out.print("영어 : ");
			int eng = scan.nextInt();
			System.out.print("수학 : ");
			int math = scan.nextInt();
			score[i] = new Score(kor,eng,math,name); // new를 통해 학생 정보를 생성하고, 생성자로 초기화
		}
		for(Score tmp : score) {
			tmp.printInfo();
		}
		scan.close();
		
	}
}

class Score{
	//1. 멤버변수
	int kor, eng, math;
	private String name;
	
	//2.getter와 setter
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//3. 기본 생성자
	public Score() {}
	//4. 생성자 오버로딩
	public Score(int kor, int eng, int math, String name) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.name = name;
	}
	//5. 학생 정보를 출력하는 메소드
	public void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor);
		System.out.println("영어 : " + eng);
		System.out.println("수학 : " + math);

	}
}