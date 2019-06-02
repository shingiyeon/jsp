package ContentController;

import java.io.IOException;
import java.util.List;

import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.BoardContent;
import board.BoardDao;
import board.NoticeContent;

public class NoticeContentController {
	public void execute(String pattern, HttpServletRequest request, HttpServletResponse response) throws NamingException, ServletException, IOException {
		if(pattern.equals("list")) {
			BoardDao dao;
			try {
				dao = new BoardDao();
				List<NoticeContent> notices = dao.getNotices();
				request.setAttribute("datas", notices);
				RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/notice.jsp");
				dispatcher.forward(request,  response);
				
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(pattern.equals("make")) {
			request.setAttribute("where", "Notice");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/MakeContentFolder/MakeContent.jsp");
			dispatcher.forward(request, response);
		}else if(pattern.equals("MakeComplete")) {
			BoardDao dao;
			dao = new BoardDao();
			NoticeContent notice = new NoticeContent();
			notice.setTitle(request.getParameter("title"));
			notice.setBody(request.getParameter("body"));
			notice.setWriter(request.getParameter("writer"));
			dao.putNotice(notice);
			response.sendRedirect("/notice/list");
			
		}
	}
}
