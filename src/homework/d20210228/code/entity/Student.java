package homework.d20210228.code.entity;

import java.util.Map;

public class Student implements Comparable<Student> {
	
	private String name;
	private int grade;
	private int point;
	
	public Student() {
		
	}
	
	public Student(Map<String, String> map) {
		this.name = map.get("name");
		this.grade = Integer.parseInt(map.get("grade"));
		this.point = Integer.parseInt(map.get("point"));
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	public int getPoint() {
		return point;
	}
	
	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", point=" + point + "]";
	}

	@Override
	public int compareTo(Student o) {
		if(o.getGrade() > grade) {
			return -1;
		} else if(o.getGrade() < grade) {
			return 1;
		} else {
			if(o.getPoint() > point) {
				return -1;
			} else {
				return 1;
			}
		}
	}

}
