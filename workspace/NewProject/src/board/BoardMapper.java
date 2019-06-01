package board;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

public interface BoardMapper {
	@Select("select * from board_tb")
	public List<BoardContent> selectBoards();
	
	@Select("select * from QnA_tb")
	public List<QnAContent> selectQnAs();
	
	@Select("select * from notice_tb")
	public List<NoticeContent> selectNotices();
	
	@Insert("insert into board_tb(title, body, writer) values(#{title}, #{body}, #{writer})")
	public void InsertBoard_tb(BoardContent board);
	
	@Insert("insert into QnA_tb(title, body, writer) values(#{title}, #{body}, #{writer})")
	public void InsertQnA_tb(QnAContent QnA);
	
	@Insert("insert into notice_tb(title, body, writer) values(#{title}, #{body}, #{writer})")
	public void InsertNotice_tb(NoticeContent notice);
	
	
}
