import ContentController.*;

import java.io.IOException;
import java.util.List;

import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.BoardContent;
import board.BoardDao;
import board.NoticeContent;

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
		String uri = request.getRequestURI();
		String patterns[] = uri.split("/");
		String pattern = "";
		if(patterns.length == 0 || patterns.length == 1) {
			pattern = "home";
		} else {
			pattern = patterns[1];
		}
		
		if(pattern.equals("home") || pattern.equals("home.do")) {
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/home.jsp");
			dispatcher.forward(request,  response);
		}else if(pattern.equals("notice")) {
			NoticeContentController controller = new NoticeContentController();
			try {
				controller.execute(patterns[2], request, response);
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else if(pattern.equals("board")) {
			BoardContentController controller = new BoardContentController();
			try {
				controller.execute(patterns[2], request, response);
			} catch (NamingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}else if(pattern.equals("QnA")){
			QnAContentController controller = new QnAContentController();
			try {
				controller.execute(patterns[2], request, response);
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
