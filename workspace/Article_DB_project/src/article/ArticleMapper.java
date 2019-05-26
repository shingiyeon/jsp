package article;

import java.util.List;
import org.apache.ibatis.annotations.Select;

public interface ArticleMapper {
	
	@Select("select * from test_tb")
	public List<Article> selectArticles();
}
