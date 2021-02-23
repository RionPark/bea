package exam.ch1;

import java.util.HashMap;
import java.util.Map;

public class MapTest2 {

	static void setMap(Map<String,String> map) {
		map = new HashMap<>();
		map.put("name", "Rion");
	}
	public static void main(String[] args) {
		Map<String,String> m = new HashMap<>();
		m.put("name", "123");
		setMap(m);
		System.out.println(m);
	}
}
