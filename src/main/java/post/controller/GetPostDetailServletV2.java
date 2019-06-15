package post.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import post.model.PostBean;
import post.model.RecordBean;
import post.service.PostService;
import post.service.RecordService;
import post.service.impl.PostServiceImpl;
import post.service.impl.RecordServiceImpl;

@WebServlet("/GetPostDetailServletV2")
public class GetPostDetailServletV2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("GetPostDetailServletV2");
		request.setCharacterEncoding("UTF-8");
		
		String postNo = request.getParameter("postNo");
		try {
			ServletContext  sc = getServletContext();
			WebApplicationContext ctx = WebApplicationContextUtils.getWebApplicationContext(sc);
			PostService postservice = ctx.getBean(PostService.class);
			
			PostBean pdb = postservice.getPostDetailBean(postNo);
			request.setAttribute("postDetailBean", pdb);
			RecordService recordservice = ctx.getBean(RecordService.class);
			
			List<RecordBean> recordList = recordservice.getRecordList(postNo);
			request.setAttribute("recordList", recordList);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher rd = request
				.getRequestDispatcher("/player/getPost.jsp");
		// 請容器代為呼叫下一棒程式
		rd.forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}



}
