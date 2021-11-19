package day18;

import java.util.*;

import day16.ExbStudent;

public class ExfBoardEx2 {

	public static void main(String[] args) {
		/* 게시글을 관리하는 프로그램을 만드세요
		 배열x, 리스트O*/
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		//게시글 리스트 생성
		List<ExfBoard> list = new ArrayList<ExfBoard>();
		String [] strMenu = {
				"1. 게시글 등록",
				"2. 게시글 확인",
				"3. 게시글 수정",
				"4. 게시글 삭제",
				"5. 게시글 종료",
		};
		try {
			do{	
				printMenu(strMenu);
				menu = scan.nextInt();
				switch(menu){
					case 1 : // 1. 게시글 등록(글 번호, 조회수, 제목, 내용, 날짜, 작성자)
						register(list, scan);
						break;
					case 2 : //2. 게시글 확인(전체)
						diplay(list);
						break;
					case 3 : modify(list, scan);;// 3. 게시글 수정
						//수정할 게시글 정보를 입력
								
						break;
					case 4 : delete(list, scan); // 4. 게시글 삭제
						//삭제할 게시글 번호 입력 받기
						
						break;
					case 5 : // 5. 프로그램 종료
						break;
						default : System.out.println("메뉴를 잘못 선택했습니다.");
				}
			}while(menu!=5);
			System.out.println("프로그램을 종료합니다.");
		}
		catch(InputMismatchException e) {
			System.out.println("예외발생!!!! 잘못 입력했습니다.");
			e.printStackTrace();
			bar();
			scan.nextLine();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}//main		
	
	
	
	public static void bar() {
		System.out.println("===========");
	}

	// 메뉴출력
	public static void printMenu(String []strMenu) {
		System.out.println("메뉴");
		for(String tmp : strMenu) {
			System.out.println(tmp);
		}
		bar();
		System.out.println("메뉴 선택 : ");
	}
	
	// 게시글 등록
	public static void register(List<ExfBoard> list, Scanner scan) {
		System.out.println("==게시글등록==");
		scan.nextLine(); 
		System.out.print("제목 : ");
		String title = scan.nextLine(); 
		System.out.print("내용 : ");
		String contents = scan.nextLine();
		System.out.print("작성자 : ");
		String writer = scan.nextLine();
		ExfBoard board = new ExfBoard(title, contents, writer); 
		list.add(board);
	}
	
	public static void diplay(List<ExfBoard> list) {
		for(ExfBoard tmp : list) {
			bar();
			System.out.println(tmp);
			bar();
		}
	}
	
	public static void modify(List<ExfBoard> list, Scanner scan) {
		System.out.println("게시글을 수정합니다.");
		System.out.println("수정할 게시글 번호 : ");
		int num = scan.nextInt();
		scan.nextLine();
		System.out.println("제목 : ");
		String title = scan.nextLine();
		System.out.println("내용 : ");
		String contents = scan.nextLine();
		ExfBoard tmp = new ExfBoard();
		tmp.setNum(num);
		int index = list.indexOf(tmp);
		if(index >= 0) {
			list.get(index).modify(title, contents);
			System.out.println("게시글이 수정되었습니다.");
			bar();
		}else {
			System.out.println("해당 게시글이 없습니다.");
			bar();
		}		
	}
	
	public static void delete(List<ExfBoard>list, Scanner scan) {
		System.out.println("게시글을 삭제합니다.");
		System.out.print("삭제할 게시글 번호 : ");
		int num = scan.nextInt();
		ExfBoard tmp1 = new ExfBoard();
		tmp1.setNum(num);
		int index = list.indexOf(tmp1);				
		if(index >= 0) {
			list.remove(index);
			System.out.println("게시글이 삭제되었습니다.");
			bar();
		}else {	
			System.out.println("해당 게시글이 없습니다.");
			bar();
		}
	}
	
	
}//end

