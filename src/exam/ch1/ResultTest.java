package exam.ch1;

import java.util.ArrayList;
import java.util.List;

class Result{
	private List<String> list = new ArrayList<>();
	private int idx = 0;
	public Result() {
		list.add("길동");
		list.add("꺽정");
		list.add("청이");
	}
	public boolean next() {
		return list.size()>idx++;
	}
	public String getString() {
		return list.get(idx-1);
	}
}
public class ResultTest {
	public static void main(String[] args) {
		Result rs = new Result();
		while(rs.next()) {
			System.out.println(rs.getString());
		}
	}
}
