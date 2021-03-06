package article;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;

public class ArticleDao {
	SqlSessionFactory sqlsessionFactory;
	public ArticleDao() throws NamingException {
		Context initContext = new InitialContext();
		Context envContext  = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/userDB");
	
		TransactionFactory transactionFactory = new JdbcTransactionFactory();
		Environment environment = new Environment("myEnv1", transactionFactory, ds);
		Configuration configuration = new Configuration(environment);
		configuration.addMapper(ArticleMapper.class);
		sqlsessionFactory = new SqlSessionFactoryBuilder().build(configuration);
	}
	
	public List<Article> getArticles() {
		SqlSession session = sqlsessionFactory.openSession();
		ArticleMapper mapper = session.getMapper(ArticleMapper.class);
		List<Article> articles = mapper.selectArticles();
		for(Article a : articles) {
			System.out.println("title: " + a.getArticleTitle());
		}
		return articles;
	}
}
