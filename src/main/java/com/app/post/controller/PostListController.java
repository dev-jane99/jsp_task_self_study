package com.app.post.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.PostDAO;
import com.app.post.Action;
import com.app.post.Result;
import com.app.vo.PostVO;

public class PostListController implements Action{
@Override
public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
	PostDAO postDAO = new PostDAO();
	PostVO postVO = new PostVO();
	Result result = new Result();
	

	req.setAttribute("posts", postDAO.selectAll ());
	result.setPath("list.jsp");
	
	
	
	return result;
	}
}
