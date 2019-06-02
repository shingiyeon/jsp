package com.example.demo.board.model;

import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;


public class ArticleDao {
	
	@Autowired
	SqlSessionFactory sqlSessionFactory;
	
	public void DBtest() {
		try {
			SqlSession session = sqlSessionFactory.openSession();
			
			
			System.out.println("Session : " + session.toString());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
