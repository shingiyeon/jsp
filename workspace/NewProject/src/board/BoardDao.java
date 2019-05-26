package board;
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

public class BoardDao {
	SqlSessionFactory sqlsessionFactory;
	public BoardDao() throws NamingException {
		Context initContext = new InitialContext();
		Context envContext  = (Context)initContext.lookup("java:/comp/env");
		DataSource ds = (DataSource)envContext.lookup("jdbc/boardDB");
	
		TransactionFactory transactionFactory = new JdbcTransactionFactory();
		Environment environment = new Environment("myEnv", transactionFactory, ds);
		Configuration configuration = new Configuration(environment);
		configuration.addMapper(BoardMapper.class);
		sqlsessionFactory = new SqlSessionFactoryBuilder().build(configuration);
	}
	
	public List<BoardContent> getBoards() {
		SqlSession session = sqlsessionFactory.openSession();
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		List<BoardContent> boards = mapper.selectBoards();
		return boards;
	}
	
	public List<NoticeContent> getNotices() {
		SqlSession session = sqlsessionFactory.openSession();
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		List<NoticeContent> notices = mapper.selectNotices();
		return notices;
	}
	
	public List<QnAContent> getQnAs() {
		SqlSession session = sqlsessionFactory.openSession();
		BoardMapper mapper = session.getMapper(BoardMapper.class);
		List<QnAContent> QnAs = mapper.selectQnAs();
		return QnAs;
	}
}
