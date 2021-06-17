package com.simple.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;
import com.simple.dao.scoreDAO;


@Service("xxx")
public class ScoreServiceIMPL implements ScoreService {
	
	@Autowired
	@Qualifier("yyy")
	private scoreDAO scoreDAO;
	
	
	@Override
	public void regist(ScoreVO vo) {
		scoreDAO.regist(vo);
		
	}


	@Override
	public ArrayList<ScoreVO> getList() {
		System.out.println("dddd");
		return scoreDAO.getList();
	}


	
	
	
	@Override
	public void delete(int num) {
		scoreDAO.delete(num);
	}
	
}
