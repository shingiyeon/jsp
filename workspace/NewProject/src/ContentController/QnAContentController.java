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
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/MakeContent.jsp");
			dispatcher.forward(request, response);
		}
	}
}
