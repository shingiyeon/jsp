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
import board.QnAContent;

public class QnAContentController {
	public void execute(String pattern, HttpServletRequest request, HttpServletResponse response) throws NamingException, ServletException, IOException {
		if(pattern.equals("list")) {
			BoardDao dao;
			try {
				dao = new BoardDao();
				List<QnAContent> qnas = dao.getQnAs();
				request.setAttribute("datas", qnas);
				RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/QnA.jsp");
				dispatcher.forward(request,  response);
				
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(pattern.equals("make")) {
			request.setAttribute("where", "QnA");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/MakeContentFolder/MakeContent.jsp");
			dispatcher.forward(request, response);
		}else if(pattern.equals("MakeComplete")) {
			BoardDao dao;
			dao = new BoardDao();
			QnAContent qna = new QnAContent();
			qna.setTitle(request.getParameter("title"));
			qna.setBody(request.getParameter("body"));
			qna.setWriter(request.getParameter("writer"));
			dao.putQnA(qna);
			response.sendRedirect("/QnA/list");
			
		}
	}
}
