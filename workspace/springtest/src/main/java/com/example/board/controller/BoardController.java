package com.example.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.board.model.ArticleDao;

@Controller
public class BoardController {

	@RequestMapping("/list.do")
	public String hello() {
		ArticleDao dao = new ArticleDao();
		dao.DBtest();
		return "index";
	}
	
}
