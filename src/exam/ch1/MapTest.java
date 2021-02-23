package exam.ch1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest {
	public static void main(String[] args) {
		List<Map<String,String>> mList = new ArrayList<>();
		Map<String,String> map = new HashMap<>();
		for(int i=1;i<=3;i++) {
			map.put("age",i+"");
			mList.add(map);
		}
		System.out.println(mList.get(0));
		System.out.println(mList.get(1));
		System.out.println(mList.get(2));
			
	}
}
