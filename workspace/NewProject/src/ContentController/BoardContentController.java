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

public class BoardContentController {
	public void execute(String pattern, HttpServletRequest request, HttpServletResponse response) throws NamingException, ServletException, IOException {
		if(pattern.equals("list")) {
			BoardDao dao;
			try {
				dao = new BoardDao();
				List<BoardContent> boards = dao.getBoards();
				request.setAttribute("datas", boards);
				RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/board.jsp");
				dispatcher.forward(request,  response);
				
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(pattern.equals("make")) {
			request.setAttribute("where", "Board");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/MakeContentFolder/MakeContent.jsp");
			dispatcher.forward(request, response);
		}else if(pattern.equals("MakeComplete")) {
			BoardDao dao;
			dao = new BoardDao();
			BoardContent board = new BoardContent();
			board.setTitle(request.getParameter("title"));
			board.setBody(request.getParameter("body"));
			board.setWriter(request.getParameter("writer"));
			dao.putBoard(board);
			response.sendRedirect("/board/list");
			
		}
	}
}
