package study.exam.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework01 {

	public static void main(String[] args) {
		List<Map<String, String>> mList = new ArrayList<>();

		Map<String, String> m = new HashMap<>();
		m.put("name", "김길동");
		m.put("grade", "3");
		m.put("point", "70");
		mList.add(m);
		m = new HashMap<>();
		m.put("name", "김철수");
		m.put("grade", "3");
		m.put("point", "60");
		mList.add(m);
		m = new HashMap<>();
		m.put("name", "우길동");
		m.put("grade", "2");
		m.put("point", "65");
		mList.add(m);
		m = new HashMap<>();
		m.put("name", "최길동");
		m.put("grade", "2");
		m.put("point", "90");
		mList.add(m);
		m = new HashMap<>();
		m.put("name", "임꺽정");
		m.put("grade", "1");
		m.put("point", "80");
		mList.add(m);
		m = new HashMap<>();
		m.put("name", "임꺽정");
		m.put("grade", "1");
		m.put("point", "75");
		mList.add(m);
		
		Collections.sort(mList, new Comparator<Map<String, String>>() {

			@Override
			public int compare(Map<String, String> left, Map<String, String> right) {
				Integer leftGrade = Integer.parseInt(left.get("grade"));
				Integer rightGrade = Integer.parseInt(right.get("grade"));
				if(leftGrade > rightGrade) {
					return 1;
				}
				if(leftGrade < rightGrade) {
					return -1;
				}
				Integer leftPoint = Integer.parseInt(left.get("point"));
				Integer rightPoint = Integer.parseInt(right.get("point"));
				if(leftPoint > rightPoint) {
					return 1;
				}
				if(leftPoint < rightPoint) {
					return -1;
				}
				return 0;
			}
			
		});
		
		System.out.println(mList);
		
	}

}
