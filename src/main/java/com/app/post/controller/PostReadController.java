package com.app.post.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.PostDAO;
import com.app.post.Action;
import com.app.post.Result;

public class PostReadController implements Action{
@Override
public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
	PostDAO postDAO = new PostDAO();
	Result result = new Result();
	
	req.setAttribute("post", postDAO.select(Long.parseLong(req.getParameter("id"))).orElseThrow(() -> {
		throw new RuntimeException();
	}));
	
	result.setPath("read.jsp");
	
	return result;
}
}
