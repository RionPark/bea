package com.homework.service.impl;

import java.util.List;
import java.util.Map;

import com.homework.dao.HomeworkDAO;
import com.homework.dao.impl.HomeworkDAOImpl;
import com.homework.service.HomeworkService;

public class HomeworkServiceImpl implements HomeworkService{
	
	private HomeworkDAO homeworkDAO = new HomeworkDAOImpl();
	
	@Override
	public List<Map<String, String>> getList() {
		return homeworkDAO.getList();
	};

}
