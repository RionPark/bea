package study.exam.ch3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import study.exam.vo.StudentVO;

public class DBTest {

	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("나 실행되면 드라이버 제대로 로드 한거임!");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/study", "root", "1234");
			stmt = con.createStatement();
			String sql = "SELECT st_num, st_id, st_pwd, st_name, st_desc FROM student";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				StudentVO student = new StudentVO();
				student.setStNum(rs.getInt("st_num"));
				student.setStId(rs.getString("st_id"));
				student.setStpwd(rs.getString("st_pwd"));
				student.setStName(rs.getString("st_name"));
				student.setStDessc(rs.getString("st_desc"));
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
				if(stmt != null) {
					stmt.close();
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
