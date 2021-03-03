package exam.ch3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import exam.vo.StudentVO;

public class DBTest2 {

	public static void main(String[] args) {

		try {
			Class.forName("org.mariadb.jdbc.Driver");
			System.out.println("나 실행되면 드라이버 제대로 로드 한거임!");
		} catch (ClassNotFoundException e) {
			e.printStackTrace(); 
		}
		
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			StudentVO st = new StudentVO();
			st.setStNum(1);
			st.setStName("이름");;
			/*
			 * 번호,이름, 아이디 중에 3개 모두 검색할수도 2개만 검색할 수도 1개만 검색할수 도 있음.
			 * 단 검색조건은 무조건 1개 이상
			 */
			
			con = DriverManager.getConnection("jdbc:mariadb://localhost:3306/ys","root","r1r2r3r4");
			String sql = "select st_num, st_id, st_pwd, st_name, st_desc from student WHERE 1=1";
			int cnt = 0;
			if(st.getStNum() != null) {
				sql += " and st_num = ?";
				cnt++;
			}
			
			if(st.getStName() != null) {
				sql += " and st_name = ?";
				cnt++;
			}
			
			if(st.getStId() !=null) {
				sql += " and st_name = ?";
				cnt++;
			}
			
			ps = con.prepareStatement(sql);
			if(st.getStId()!=null) {
				ps.setString(cnt--, st.getStId());
			}

			if(st.getStName()!=null) {
				ps.setString(cnt--, st.getStName());
			}

			if(st.getStNum()!=null) {
				ps.setInt(cnt--, st.getStNum());
			}
			
			rs = ps.executeQuery(sql);
			/*
			 * List<Student> 구조로 완성해서
			 */
			while(rs.next()) {
				StudentVO student = new StudentVO();
				student.setStNum(rs.getInt("st_num"));
			}
			/*
			 * 여기서 향상된 포문으로 출력하면 됩니다.
			 */
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBTest.close(con,ps,rs);
		}
	}
}
