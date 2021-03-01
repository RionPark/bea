package homework01.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import homework01.entity.Student;

public class Homework01 {

	public static void main(String[] args) {
		List<Map<String,String>> mList = new ArrayList<>();

		Map<String,String> m = new HashMap<>();
		m.put("name","김길동");
		m.put("grade","3");
		m.put("point","70");
		mList.add(m);
		 m = new HashMap<>();
		m.put("name","김철수");
		m.put("grade","3");
		m.put("point","60");
		mList.add(m);
		 m = new HashMap<>();
		m.put("name","우길동");
		m.put("grade","2");
		m.put("point","65");
		mList.add(m);
		 m = new HashMap<>();
		m.put("name","최길동");
		m.put("grade","2");
		m.put("point","90");
		mList.add(m);
		 m = new HashMap<>();
		m.put("name","임꺽정");
		m.put("grade","1");
		m.put("point","80");
		mList.add(m);
		 m = new HashMap<>();
		m.put("name","임꺽정");
		m.put("grade","1");
		m.put("point","75");
		mList.add(m);
		
		List<Student> students = new ArrayList<>();
		for(Map<String, String> map : mList) {
			students.add(new Student(map));
		}
		Collections.sort(students);
		System.out.println(students);
	}

}
