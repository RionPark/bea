package homework01.entity;

import java.util.Map;

public class Student implements Comparable<Student> {
	
	private String name;
	private String grade;
	private String point;
	
	public Student() {
		
	}
	
	public Student(Map<String, String> map) {
		this.name = map.get("name");
		this.grade = map.get("grade");
		this.point = map.get("point");
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getGrade() {
		return grade;
	}
	
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	public String getPoint() {
		return point;
	}
	
	public void setPoint(String point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", point=" + point + "]";
	}

	@Override
	public int compareTo(Student o) {
		int compareGrade = Integer.parseInt(o.getGrade());
		int grade = Integer.parseInt(this.grade);
		if(compareGrade > grade) {
			return -1;
		} else if(compareGrade < grade) {
			return 1;
		} else {
			int comparePoint = Integer.parseInt(o.getPoint());
			int point = Integer.parseInt(this.point);
			if(comparePoint > point) {
				return -1;
			} else {
				return 1;
			}
		}
	}

}
