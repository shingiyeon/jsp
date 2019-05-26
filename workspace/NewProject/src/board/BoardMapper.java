package board;

import java.util.List;
import org.apache.ibatis.annotations.Select;

public interface BoardMapper {
	@Select("select * from board_tb")
	public List<BoardContent> selectBoards();
	@Select("select * from QnA_tb")
	public List<QnAContent> selectQnAs();
	@Select("select * from notice_tb")
	public List<NoticeContent> selectNotices();
}
