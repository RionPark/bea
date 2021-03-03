package exam.ch3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import exam.vo.StudentVO;

public class DBTest {
	static void close(Connection con) {
		if(con!=null) {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	static void close(Statement st) {
		if(st!=null) {
			try {
				st.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	static void close(ResultSet rs) {
		if(rs!=null) {
			try {
				rs.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
	static void close(Connection con, Statement st) {
		close(st);
		close(con);
	}
	static void close(Connection con, Statement st,ResultSet rs) {
		close(rs);
		close(con,st);
	}
	
	public static void main(String[] args) {
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("나 실행되면 드라이버 제대로 로드 한거임!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); 
		}
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		/*
		 * 접속경로(전화번호)
		 * 보안을 위한 username(아이디)
		 * 유저를 이증할 password(비밀번호)
		 */
		try {
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/ys","root","r1r2r3r4");
			stmt = con.createStatement();
			String sql = "select st_num, st_id, st_pwd, st_name, st_desc from student";
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				StudentVO student = new StudentVO();
				student.setStNum(rs.getInt("st_num"));
				/*
				 * 다음시간까지 완성해서 깃에 커밋해주세요~
				 */
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(con,stmt,rs);
		}
		
		
	}
}
