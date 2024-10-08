package com.app.post.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.dao.PostDAO;
import com.app.post.Action;
import com.app.post.Result;
import com.app.vo.PostVO;


public class PostUpdateCheckController implements Action{
@Override
public Result execute(HttpServletRequest req, HttpServletResponse resp) throws IOException, ServletException {
	Result result = new Result();
	PostDAO postDAO = new PostDAO();
	PostVO postVO = new PostVO();
	
	postVO.setId(Long.parseLong(req.getParameter("id")));
	postVO.setPostTitle(req.getParameter("postTitle"));
	postVO.setPostContent(req.getParameter("postContent"));
	
	postDAO.update(postVO);
	
	result.setRedirect(true);
	result.setPath(req.getContextPath() + "/read.post?id=" + req.getParameter("id"));

	return result;
}
}
