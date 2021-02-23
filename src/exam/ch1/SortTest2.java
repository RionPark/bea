package exam.ch1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Cat implements Comparable<Cat>{
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Cat [name=" + name + ", age=" + age + "]";
	}
	@Override
	public int compareTo(Cat o) {
		if(o.getAge()>age) {
			return -1;
		}
		if(o.getAge()<age) {
			return 1;
		}
		return 0;
	}
}
public class SortTest2 {

	public static void main(String[] args) {
		List<Cat> cats = new ArrayList<>();
		Cat c = new Cat();
		c.setName("동동이");
		c.setAge(5);
		cats.add(c);
		c = new Cat();
		c.setName("나비");
		c.setAge(1);
		cats.add(c);
		c = new Cat();
		c.setName("냐옹이");
		c.setAge(3);
		cats.add(c);
		Collections.sort(cats);
		System.out.println(cats);
		
	}
}
