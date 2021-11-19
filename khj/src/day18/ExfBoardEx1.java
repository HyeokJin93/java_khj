package day18;

import java.util.*;

import day16.ExbStudent;

public class ExfBoardEx1 {

	public static void main(String[] args) {
		/* 게시글을 관리하는 프로그램을 만드세요
		 배열x, 리스트O*/
		int menu = 0;
		Scanner scan = new Scanner(System.in);
		//게시글 리스트 생성
		List<ExfBoard> list = new ArrayList<ExfBoard>();
		
		do{	
			
			// 메뉴 출력
			System.out.println("============");
			System.out.println("메뉴");
			System.out.println("1. 게시글 등록");
			System.out.println("2. 게시글 확인");
			System.out.println("3. 게시글 수정");
			System.out.println("4. 게시글 삭제");
			System.out.println("5. 프로그램 종료");
			System.out.println("============");
		   	// 메뉴 입력
			System.out.print("메뉴를 선택하세요 : ");
			menu = scan.nextInt();
			switch(menu){
			 
				case 1 : System.out.println("==게시글등록==");
				scan.nextLine(); // @@@@위에 엔터 작업
				System.out.print("제목 : ");
				String title = scan.nextLine(); 
				System.out.print("내용 : ");
				String contents = scan.nextLine();
				System.out.print("작성자 : ");
				String writer = scan.nextLine();
				ExfBoard board = new ExfBoard(title, contents, writer); 
				list.add(board);
				System.out.println("게시글이 등록되었습니다.");
				System.out.println("============");;// 1. 게시글 등록(글 번호, 조회수, 제목, 내용, 날짜, 작성자)
					break;
				case 2 : //2. 게시글 확인(전체)
					for(ExfBoard tmp : list) {
						System.out.println("========");
						System.out.println(tmp);
						System.out.println("========");
					}
					break;
				case 3 : // 3. 게시글 수정
					//수정할 게시글 정보를 입력
					System.out.println("게시글을 수정합니다.");
					System.out.println("수정할 게시글 번호 : ");
					int num = scan.nextInt();
					scan.nextLine();
					System.out.println("제목 : ");
					title = scan.nextLine();
					System.out.println("내용 : ");
					contents = scan.nextLine();
					//리스트에서 수정할 게시글 정보를 가져옴
					ExfBoard tmp = new ExfBoard();
					tmp.setNum(num);
					int index = list.indexOf(tmp);
					
					//수정할 게시글이 있으면 수정 후 안내문구 출력
					if(index >= 0) {
						list.get(index).modify(title, contents);
						System.out.println("게시글이 수정되었습니다.");
					}else {//수정할 게시글이 없으면 게시글이 없다는 안내문구 출력
						System.out.println("해당 게시글이 없습니다.");
					}				
					break;
				case 4 : // 4. 게시글 삭제
					//삭제할 게시글 번호 입력 받기
					System.out.println("게시글을 삭제합니다.");
					System.out.print("삭제할 게시글 번호 : ");
					num = scan.nextInt();
					//리스트에 해당 게시글이 있는지 확인 @@@@이해 필요
					ExfBoard tmp1 = new ExfBoard();
					tmp1.setNum(num);
					index = list.indexOf(tmp1);				
					//리스트에 게시글이 있으면 삭제 후 삭제되었습니다 라고 안내문구
					if(index >= 0) {
						list.remove(index);
						System.out.println("게시글이 삭제되었습니다.");
					}else {	//리스트에 게시글이 없으면 해당 게시글이 없습니다 라고 안내문구
						System.out.println("해당 게시글이 없습니다.");
					}
					break;
				case 5 : // 5. 프로그램 종료
					break;
					default : System.out.println("메뉴를 잘못 선택했습니다.");
			}
		}while(menu!=5);
		System.out.println("프로그램을 종료합니다.");
	}//main		
}

