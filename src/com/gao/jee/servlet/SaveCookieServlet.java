package com.gao.jee.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SaveCookieServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.setCharacterEncoding("UTF-8");
		
		Cookie c1 = new Cookie("test1","test1 value");
		resp.addCookie(c1);
		
		Cookie c2 = new Cookie("test2","test2 value");
		c2.setPath("/TestLogin/tmp");
		resp.addCookie(c2);
		
		Cookie c3 = new Cookie("test3","test3 value");
		resp.addCookie(c3);
		
		System.out.println(" Cookies saved");
		resp.sendRedirect("index.html");
		
	}
}
