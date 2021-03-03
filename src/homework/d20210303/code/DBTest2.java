package study.exam.ch3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import study.exam.vo.StudentVO;

public class DBTest2 {
	
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver"); /// 코드랑 익셉션을 강제한다.
			System.out.println("나 실행되면 드라이버 제대로 로드 한거임!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			StudentVO st = new StudentVO();
			st.setStNum(1);
			st.setStName("이름");
			/*
			 * 번호, 이름, 아이디 중에 3개 모두 검색할 수도 2개만 검색할 수도 1개만 검색할 수 도 있음.
			 */
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/study", "root", "1234");
			String sql = "SELECT st_num, st_id, st_pwd, st_name, st_desc FROM student";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery(sql);
			/*
			 * list로 완성해 올것
			 */
			List<StudentVO> students = new ArrayList<>();
			while(rs.next()) {
				StudentVO student = new StudentVO();
				student.setStNum(rs.getInt("st_num"));
				student.setStId(rs.getString("st_id"));
				student.setStpwd(rs.getString("st_pwd"));
				student.setStName(rs.getString("st_name"));
				student.setStDessc(rs.getString("st_desc"));
				students.add(student);
			}
			for(StudentVO student : students) {
				System.out.println(student);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if(rs != null) {
					rs.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
			try {
				if(ps != null) {
					ps.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
			try {
				if(rs != null) {
					rs.close();
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
}
