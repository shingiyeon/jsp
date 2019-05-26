
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class servlet_example2
 */
@WebServlet("/exam")
public class servlet_example2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArticleManagement am = ArticleManagement.GenerateArticleManagement();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public servlet_example2() {
        super();
    	am.initialArticle();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String action = request.getParameter("action");
		String num = request.getParameter("num");
		response.setContentType("text/html; charset=UTF-8"); 
		PrintWriter out = response.getWriter();
		if(action.equals("index")) {
			response.sendRedirect("/jsp/index.jsp");
		}
		else if(action.equals("gugudan")) {
			response.sendRedirect("/jsp/gugudan.jsp");
		}
		else if(action.equals("article")) {
			if(num!=null) {
				Article article = am.getArticle(Integer.parseInt(num));
				out.printf("title: " + article.getArticleTitle() + "<br>");
				out.printf("body: " + article.getArticleBody() + "<br>");
				out.printf("writer: " + article.getArticleWriter() + "<br>");
				out.printf("articleNo: " + article.getArticleNo() + "<br>");
			}
			else {
				for(int i=1; i<=5; i++) {
					Article article = am.getArticle(i);
					out.printf("title: " + article.getArticleTitle() + "<br>");
					out.printf("body: " + article.getArticleBody() + "<br>");
					out.printf("writer: " + article.getArticleWriter() + "<br>");
					out.printf("articleNo: " + article.getArticleNo() + "<br>");
				}
			}
		}
		else if(action.equals("Login")) {
			String correctedID = "nuclear852";
			String correctedPW = "1234";
			String ID = request.getParameter("ID");
			String PW = request.getParameter("PW");
			
			if(ID == null || PW == null) {
				out.println("아이디와 비밀번호를 입력하여 주십시오.");
			}
			
			if(correctedID.equals(ID) && correctedPW.equals(PW)) {
				for(int i=1; i<=5; i++) {
					Article article = am.getArticle(i);
					out.printf("title: " + article.getArticleTitle() + "<br>");
					out.printf("body: " + article.getArticleBody() + "<br>");
					out.printf("writer: " + article.getArticleWriter() + "<br>");
					out.printf("articleNo: " + article.getArticleNo() + "<br>");
				}
			}
			else if(correctedID.equals(ID)) {
				out.printf("PW가 틀렸습니다.<br>");
			}
			else if(correctedPW.equals(PW)) {
				out.printf("ID가 틀렸습니다.<br>");
			}
			else {
				out.printf("ID와 PW를 확인하여주세요.");
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

