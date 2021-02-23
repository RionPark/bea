package exam.ch1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortTest {

	public static void main(String[] args) {
		/*
		 * Collection Frameworks 이란
		 * List, Map, Set <--이런애들을 말함.
		 * 1.8미만에서는
		 * interface에서 method의 body를 선언할 수 없었음.
		 * 1.8이상에서는 static과 default에서는 method의 body를 선언할 수 있음.
		 */
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(10);
		list.add(5);
		Collections.sort(list);
		System.out.println(list);
	}
}
