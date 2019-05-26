package board;

public class QnAContent {
	private int QnANo;
	private String title;
	private String body;
	private String writer;
	public int getQnANo() {
		return QnANo;
	}
	public void setQnANo(int qnANo) {
		QnANo = qnANo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
}
