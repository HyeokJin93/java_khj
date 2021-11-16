package day15;

import java.util.*;


public class ExeListEx4 {

	public static void main(String[] args) {
		/*오늘의 할일을 5개 입력받아 출력하는 코드를 작성하세요, 단 list를 이용
		 * 방법1. 오늘의 할일을 String으로 관리하는 방법
		 * 방법2. 오늘의 할일을 ToDo클래스로 관리하는 방법*/
		//방법2.
		ArrayList<ExeToDo> todoList = new ArrayList<ExeToDo>();
		Scanner scan = new Scanner(System.in);
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("시간 : ");
			String time = scan.nextLine();
			System.out.println("할일 : ");
			String todo = scan.nextLine();
			//ExeToDo todoObj= new ExeToDo(time, todo);
			//todoList.add(todoObj);
			todoList.add(new ExeToDo(time, todo));
		}
		
		System.out.println(todoList);
	}
	
}



class ExeToDo{
	String time;		//멤버변수
	String toDo;
	
	public ExeToDo(String time, String toDo) { //생성자
		super();
		this.time = time;
		this.toDo = toDo;
	}

	@Override
	public String toString() {
		return "\n할일 [시간 = " + time + ", 내용 = " + toDo + "]\n" ;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExeToDo other = (ExeToDo) obj;
		if (time == null) {
			if (other.time != null)
				return false;
		} else if (!time.equals(other.time))
			return false;
		if (toDo == null) {
			if (other.toDo != null)
				return false;
		} else if (!toDo.equals(other.toDo))
			return false;
		return true;
	}
	
	
}