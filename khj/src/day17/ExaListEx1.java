package day17;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import day16.ExbStudent;

public class ExaListEx1 {

	public static void main(String[] args) {
		ArrayList<ExbStudent> stdList = new ArrayList<ExbStudent>();
		Scanner scan = new Scanner(System.in);
		int menu;
		
		do {
			//메뉴 출력.
			printMenu();
			//메뉴 선택
			menu = scan.nextInt();
			//선택된 메뉴에 따라 동작 실행
			switch(menu) {
			//학생 정보 추가 기능
			case 1:	inputStudent(scan, stdList);	break;
			//전체 학생 정보 출력 기능
			case 2:	printStudentList(stdList);		break;
			//특정 학생 정보 삭제
			case 3:
				if(deleteStudent(stdList, scan)) {
					System.out.println("학생 정보를 삭제했습니다.");
				}else {
					System.out.println("일치하는 학생 정보가 없습니다.");
				}
				break;
				//특정 학생 정보 수정 : 
					//이름 성적만 수정, 맘대로
			case 4:
				if(modifyStudent(scan, stdList)) {
					System.out.println("학생 정보를 수정했습니다.");
				}else {
					System.out.println("일치하는 학생 정보가 없습니다.");
				}
			
			
			

			case 5:	break;
			default:
				System.out.println("잘못된 메뉴입니다.");
			}
		}while(menu != 5);
		
		System.out.println("프로그램을 종료합니다.");
		
		scan.close();
	}
	
	public static ExbStudent inputStudent(Scanner scan) {
		System.out.println("학생 정보를 입력하세요.");
		System.out.print("학년 : ");
		int grade = scan.nextInt();
		System.out.print("학반 : ");
		int classNum = scan.nextInt();
		System.out.print("번호 : ");
		int num = scan.nextInt();
		System.out.print("이름 : ");
		scan.nextLine();
		String name = scan.nextLine();
		System.out.println("성적을 입력하세요.");
		System.out.print("국어 : ");
		int kor = scan.nextInt();
		System.out.print("영어 : ");
		int eng = scan.nextInt();
		System.out.print("수학 : ");
		int math = scan.nextInt();
		ExbStudent std 
			= new ExbStudent(grade, classNum, num, name, kor, eng, math);
		return std;
	}
	public static void inputStudent(Scanner scan, ArrayList<ExbStudent> stdList) {
		ExbStudent std = inputStudent(scan);
		stdList.add(std);
	}
	public static void printStudentList(ArrayList<ExbStudent> stdList) {
		Iterator<ExbStudent> it = stdList.iterator();
		while(it.hasNext()) {
			ExbStudent tmp = it.next();
			System.out.println(tmp);
		}
	}
	public static void printMenu() {
		System.out.println("메뉴");
		System.out.println("1. 학생 정보 추가");
		System.out.println("2. 전체 학생 정보 출력");
		System.out.println("3. 학생 정보 삭제");
		System.out.println("4. 학생 정보 수정");
		System.out.println("5. 프로그램 종료");
		System.out.print("메뉴를 선택하세요 : ");
	}

	public static boolean deleteStudent(ArrayList<ExbStudent> 
							stdList, Scanner scan) {
		System.out.println("삭제할 학생 정보를 입력하세요");
		System.out.print("학년 : ");
		int grade = scan.nextInt();
		System.out.print("학반 : ");
		int classNum = scan.nextInt();
		System.out.print("번호 : ");
		int num = scan.nextInt();
		//방법1
		//삭제할 학생 정보가 몇번지에 있는지 확인하는 작업을 위해
		//ExbStudent클래스의 equals를 오버라이딩 해야함
		//리스트에 특정 객체가 있는지 확인할 때 사용하는 메소드 : contains, indexOf
		ExbStudent std 
			= new ExbStudent(grade, classNum, num, "", 0, 0, 0);
		/*
		int index = stdList.indexOf(std);
		//있으면 해당 번지에 있는 학생 정보를 삭제
		if(index >= 0 ) {
			stdList.remove(index);
			//System.out.println("학생 정보를 삭제했습니다.");
			return true;
		}else {
			//System.out.println("일치하는 학생 정보가 없습니다.");
			return false;
		}
		*/
		//방법2
		//학생 정보를 삭제했을 때 해당 학생 정보가 있으면 삭제되었습니다
		//없으면 삭제할 학생 정보가 없습니다를 출력
		return stdList.remove(std);
	}
	
	/* 기능 : Scanner를 이용하여 수정할 학생 정보와 성적, 이름을 입력받고,
	 * 		 입력받은 학생 정보를 주어진 리스트에서 수정하여 수정 됐는지 안됐는지 알려주는 메소드
	 * 매개변수 : Scanner scan, ArrayList<ExbStudent> stdList
	 * 리턴타입 : 수정됐는지 안됐는지 : boolean
	 * 메소드명 : modifyStudent*/
	public static boolean modifyStudent(Scanner scan, ArrayList<ExbStudent> stdList) {
		//특정 학생 정보 입력
		System.out.println("학생 정보를 입력하세요.");
		System.out.print("학년 : ");
		int grade = scan.nextInt();
		System.out.print("학반 : ");
		int classNum = scan.nextInt();
		System.out.print("번호 : ");
		int num = scan.nextInt();
		
		
		//해당 학생이 있으면 이름, 성적을 입력 받음
		//해당 학생 정보의 번지가 0이상이면 이름, 성적을 입력받음
		ExbStudent std = new ExbStudent(grade, classNum, num, "", 0, 0, 0);
		int index = stdList.indexOf(std);
		if(index >= 0) {
			System.out.print("이름 : ");
			scan.nextLine();
			String name = scan.nextLine();
			System.out.println("성적을 입력하세요.");
			System.out.print("국어 : ");
			int kor = scan.nextInt();
			System.out.print("영어 : ");
			int eng = scan.nextInt();
			System.out.print("수학 : ");
			int math = scan.nextInt();		
			//학생정보 수정
			//방법1. get()
			//리스트에서 학생 정보를 가져와서 이름과 성적만 수정
			
			/*std = stdList.get(index);
			std.setName(name);
			std.setKor(kor);
			std.setEng(eng);
			std.setMath(math);*/
		//방법2. set()
		//입력받은 학생 정보와 이름, 성적을 하나의 객체로 만들어서
		//리스트에 수정하는 방법
			std = new ExbStudent(grade, classNum, num, name, kor, eng, math);
			stdList.set(index, std);
			return true;
		
		}
		//없으면 끝
		return false;
	}
}


