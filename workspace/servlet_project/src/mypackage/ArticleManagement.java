package mypackage;


import java.util.*;


public class ArticleManagement {
	private static List<Article> Articles = new ArrayList<Article>();
	
	private ArticleManagement(){
	}
	
	public static ArticleManagement GenerateArticleManagement() {
		
		ArticleManagement AnArticleManagement = new ArticleManagement();
		return AnArticleManagement;
	}
	
	public void initialArticle() {
		Articles.add(Article.newArticle(1, "Number 1", "AAAAAAAAAAA", "SGY1"));
		Articles.add(Article.newArticle(2, "Number 2", "BBBBBBBBBBB", "SGY2"));
		Articles.add(Article.newArticle(3, "Number 3", "CCCCCCCCCCC", "SGY3"));
		Articles.add(Article.newArticle(4, "Number 4", "DDDDDDDDDDD", "SGY4"));
		Articles.add(Article.newArticle(5, "Number 5", "EEEEEEEEEEE", "SGY5"));
	}
	
	public Article getArticle(int num) {
		for(int i=0; i<Articles.size(); i++) {
			if(Articles.get(i).getArticleNo() == num) {
				return Articles.get(i);
			}
		}
		return null;
	}
	
	public List<Article> getArticles(){
		return Articles;
	}
}
