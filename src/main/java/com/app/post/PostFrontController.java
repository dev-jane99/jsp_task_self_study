package com.app.post;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.app.post.controller.PostDeleteController;
import com.app.post.controller.PostListController;
import com.app.post.controller.PostReadController;
import com.app.post.controller.PostUpdateCheckController;
import com.app.post.controller.PostUpdateController;
import com.app.post.controller.PostWriteCheckController;

public class PostFrontController extends HttpServlet{

		@Override
		protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			req.setCharacterEncoding("UTF-8");
			resp.setContentType("text/html; charset=utf-8");
			String target = req.getRequestURI().replace(req.getContextPath() + "/", "").split("\\.")[0];
			Result result = null;
		
			if(target.equals("write")) {
				result = new Result();
				result.setPath("write.jsp");
			}else if(target.equals("write-check")) {
				result = new PostWriteCheckController().execute(req, resp);
			}else if(target.equals("list")) {
				result = new PostListController().execute(req, resp);
			}else if(target.equals("read")) {
				result = new PostReadController().execute(req, resp);
			}else if(target.equals("update")) {
				result = new PostUpdateController().execute(req, resp);
			}else if(target.equals("update-check")) {
				result = new PostUpdateCheckController().execute(req, resp);
			}else if(target.equals("delete-check")) {
				result = new PostDeleteController().execute(req, resp);
			}else {
				
			}
		
			
			if(result != null) {
				if(result.isRedirect()) {
					resp.sendRedirect(result.getPath());
				}else {
					req.getRequestDispatcher(result.getPath()).forward(req, resp);
				}
			}
		}
			
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			doGet(req, resp);
		}
}
