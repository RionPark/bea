package com.homework.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.homework.dao.HomeworkDAO;
import com.test.conn.ComDB;

public class HomeworkDAOImpl implements HomeworkDAO{
	
	@Override
	public List<Map<String, String>> getList() {
		List<Map<String, String>> list = new ArrayList<>();
		Connection con = ComDB.getCon();
		String sql = "SELECT st_id, st_name FROM student";
		try(PreparedStatement ps = con.prepareStatement(sql)) {
			try(ResultSet rs = ps.executeQuery()) {
				while(rs.next()) {
					Map<String, String> map = new HashMap<String, String>();
					map.put("name", rs.getString("st_name"));
					map.put("id", rs.getString("st_id"));
					list.add(map);
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	};

}
