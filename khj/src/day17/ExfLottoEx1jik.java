package day17;

import java.util.*;

import day17.ExeBaseballEx1;

public class ExfLottoEx1jik {

	public static void main(String[] args) {
		/*로또 프로그램을 day17 패키지의 야구게임을 활용하여 만드세요 */
		//1. 로또 당첨 번호 6개숫자 + 보너스 번호 1개 숫자 생성
		
		int min = 1, max = 45;
		int count = 6;
		Scanner scan = new Scanner(System.in);
		ArrayList winningNumber = new ArrayList();
		ArrayList bonusNumber = new ArrayList();
		ArrayList userNumber = new ArrayList();
		ExeBaseballEx1.createRandomList(winningNumber, min, max, count);
		ExeBaseballEx1.createRandomList(bonusNumber, min, max, 1);
		System.out.println("당첨번호 : " + winningNumber + " 보너스 번호 : " + bonusNumber);
		//2. 사용자가 숫자 6개 입력
		System.out.println("번호를 입력하세요(예 : 1 3 13 24 26 28 ) : ");
		int inputResult = ExeBaseballEx1.inputList(userNumber, min, max, count, scan);
		switch(inputResult) {
		case -1 : 
			System.out.println("중복된 값을 입력했습니다.");
			break;
		case 1 : 
			System.out.println("잘못된 범위의 정수를 입력했습니다.");
			break;
		}
	
		
		//3. 등수 확인( 3개 - 5등 , 4개 - 4등 , 5개 - 3등 , 5개 + 보너스번호 - 2등 , 6개 - 1등 )
		
		//4. 
		
		
		
		
		
		
		
		
	} // main
	public static int getNum(List<Integer>list1, List<Integer>list2) {
		int luck = 0;
		for(int i = 0 ; i < list1.size() ; i++) {
			if(list1.get(i).equals(list2.get(i))) {
				luck++;
			}
		}
		return luck;
	}
	
	
	
	
	
	
	
	
	
}//public class ExaLottoEx1
