package day17;

import java.util.*;

public class ExcSetEx1 {

	public static void main(String[] args) {
		Set<Integer> set1 = new HashSet<Integer>();
		HashSet<Integer> set2 = new HashSet<Integer>();
		set1.add(1); set1.add(2); set1.add(3); set1.add(1);
		System.out.println(set1); // => 중복 허용x이므로 마지막 1은 추가되지 않음, 순서 기억 못함
		int min = 1, max = 9;
		while(set2.size() < 3) {
			int r = (int)(Math.random()*(max-min+1)+min);
			set2.add(r);
		}
		System.out.println(set2);
		Iterator<Integer> it = set2.iterator();
		while(it.hasNext()	) {
			Integer tmp = it.next();
			System.out.println(tmp + " ");
		}
	}

}
