package com.gao.jee.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class TestServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		//System.out.println("TestServlet is accessable");
		resp.setContentType("text/html;charset=UTF-8");
		HttpSession session = req.getSession(false);
		if(session == null || session.getAttribute("user_name") == null){
			resp.sendRedirect("../pages/login.html");
		}else{
			resp.getWriter().write(session.getAttribute("user_name")+"有权限访问此界面!"+"<a href='/TestLogin/index.html'>back to index</a>");
		}
	}

}
