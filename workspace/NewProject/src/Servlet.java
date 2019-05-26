

import java.io.IOException;
import java.util.List;

import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.*;

/**
 * Servlet implementation class Servlet
 */
@WebServlet("/")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("to");
		
		if(action.equals("notice.jsp")) {
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
		}else if(action.equals("board.jsp")) {
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
			
		}else if(action.equals("QnA.jsp")){
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
			
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
