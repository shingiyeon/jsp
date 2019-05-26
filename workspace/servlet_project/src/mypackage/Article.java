package mypackage;


public class Article {
	private int ArticleNo;
	private String ArticleTitle;
	private String ArticleBody;
	private String ArticleWriter;
	
	private Article() {
	}
	
	public static Article newArticle() {
		return new Article();
	}
	
	public static Article newArticle(int ArticleNo, String ArticleTitle, String ArticleBody, String ArticleWriter) {
		Article newArticle = new Article();
		newArticle.setArticleNo(ArticleNo);
		newArticle.setArticleTitle(ArticleTitle);
		newArticle.setArticleBody(ArticleBody);
		newArticle.setArticleWriter(ArticleWriter);
		return newArticle;
	}

	public int getArticleNo() {
		return ArticleNo;
	}

	public void setArticleNo(int articleNo) {
		ArticleNo = articleNo;
	}

	public String getArticleTitle() {
		return ArticleTitle;
	}

	public void setArticleTitle(String articleTitle) {
		ArticleTitle = articleTitle;
	}

	public String getArticleBody() {
		return ArticleBody;
	}

	public void setArticleBody(String articleBody) {
		ArticleBody = articleBody;
	}

	public String getArticleWriter() {
		return ArticleWriter;
	}

	public void setArticleWriter(String articleWriter) {
		ArticleWriter = articleWriter;
	}
}
