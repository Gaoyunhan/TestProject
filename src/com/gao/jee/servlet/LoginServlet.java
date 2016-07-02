package com.gao.jee.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.setCharacterEncoding("UTF-8");
		String name = req.getParameter("name");
		String psw = req.getParameter("psw");		
				
		if("admin".equals(name) && "123456".equals(psw)){
			
			//System.out.println("succcessful!");
			HttpSession session = req.getSession();
			session.setAttribute("user_name", name);
			resp.setContentType("text/html;charset=UTF-8");
			resp.getWriter().write("Welcome"+name+"!<br/>"+"<a href='index.html'>back to index</a>");
		}else{
			System.out.println("unsuccessful!");
			resp.sendRedirect("pages/login.html");
		}
	}
	
	
}
