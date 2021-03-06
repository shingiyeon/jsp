

import java.io.IOException;

import javax.naming.NamingException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import article.ArticleDao;

/**
 * Servlet implementation class DB_Servlet
 */
@WebServlet("/DB_Servlet")
public class DB_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DB_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String action = request.getParameter("action");
		if(action.equals("DB")) {
			response.sendRedirect("/jsp/db.jsp");
		}
		else if(action.equals("article")) {
			ArticleDao dao;
			try {
				dao = new ArticleDao();
				dao.getArticles();
				request.getRequestDispatcher("/");
				
			} catch (NamingException e) {
				e.printStackTrace();
			}
			request.setAttribute("aaa", 123);
			response.sendRedirect("/jsp/index.jsp");
			// sendRedirect request의 data를 넘길 필요가 없을때
			RequestDispatcher dispatcher = request.getRequestDispatcher("/jsp/index.jsp");
			dispatcher.forward(request,  response);
			// dispatcher forward는 data를 넘길 필요가 있을때
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
