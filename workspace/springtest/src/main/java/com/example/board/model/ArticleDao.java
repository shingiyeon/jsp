package com.example.board.model;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;


public class ArticleDao {
	
	@Autowired
	DataSource dataSource;
	
	public void DBtest() {
		try {
			Connection conn = dataSource.getConnection();
			
			System.out.println("connection : " + conn.toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
