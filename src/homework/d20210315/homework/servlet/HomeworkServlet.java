package com.homework.servlet;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;
import com.homework.service.HomeworkService;
import com.homework.service.impl.HomeworkServiceImpl;

@WebServlet(value = "/homework/*")
public class HomeworkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private HomeworkService homeworkService = new HomeworkServiceImpl();
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json;chatset=UTF-8");
		List<Map<String, String>> list = homeworkService.getList();
		Gson gson = new Gson();
		String responseData = gson.toJson(list);
		response.getWriter().write(responseData);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
