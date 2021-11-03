package day6;

import java.util.Arrays;

public class ArraySortEx2 {

	public static void main(String[] args) {

		//다음과 같은 배열이 있을 때 정렬하는 코드를 작성하세요.
		int num [] = {1, 10, 9, 3, 6, 2, 3, 4};
		/*버블정렬 : 옆에 있는 값과 비교하여 정렬하는 방법
		 *1, 10, 9, 3, 6, 2, 3, 4
		 *하나씩 옆 숫자와 비교. 
					//두 값을 바꿈
			//		int tmp = num[j];    ///// 중요!!!!!!!!!!!!
			//		num[j] = num[j+1];   ///// 중요!!!!!!!!!!!!
			//		num[j+1] = tmp;      ///// 중요!!!!!!!!!!!!
			  */
			 //Arrays.sort(num);// 오름차순
		Arrays.sort(num, 0, 5); // 0번지부터 5번지까지 오름차순으로 정렬
		for(int tmp :num) {
			System.out.print(tmp + " ");
		}
	}

}
