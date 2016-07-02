package com.gao.jee.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ShowCookieServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("访问成功！");
		Cookie[] cookies = req.getCookies();
		StringBuilder sb = new StringBuilder("有以下"+cookies.length+"个Cookie：<br/>");
		for(Cookie c:cookies){
			sb.append(c.getName()).append("  --> ").append(c.getValue()).append("<br/>");
		}
		
		resp.setContentType("text/html;charset=UTF-8");
		resp.getWriter().write(sb.toString());
	}
}
