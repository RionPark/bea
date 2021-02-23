package exam.ch1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Result2 {
	private List<Map<String,String>> datas = new ArrayList<>();
	Result2(){
		for(int i=0;i<5;i++) {
			Map<String,String> map = new HashMap<>();
			map.put("name", "하이" + i);
			map.put("age", "" + i);
			datas.add(map);
		}
	}
	private int idx = 0;
	public boolean next() {
		return datas.size()>idx++;
	}
	
	public String getString(String key) {
		return datas.get(idx-1).get(key);
	}
}
public class ResultTest2 {
	public static void main(String[] args) {
		Result2 rs = new Result2();
		while(rs.next()) {
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("age"));
		}
	}
}
