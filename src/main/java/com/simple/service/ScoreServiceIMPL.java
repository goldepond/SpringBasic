package com.simple.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;
import com.simple.dao.scoreDAO;
import com.simple.mapper.ScoreMapper;


@Service("xxx")
public class ScoreServiceIMPL implements ScoreService {
//	
//	@Autowired
//	@Qualifier("yyy")
//	private scoreDAO scoreDAO;
	
	@Autowired
	private ScoreMapper scoreMapper;
	
	@Override
	public void regist(ScoreVO vo) {
//		scoreDAO.regist(vo);
//		scoreMapper.regist(vo);
		
		HashMap<String, String>map = new HashMap<>();
		map.put("name",vo.getName());
		map.put("kor",vo.getKor());
		map.put("math",vo.getMath());
		
		scoreMapper.regist(map);
		
	}


	@Override
	public ArrayList<ScoreVO> getList() {
		System.out.println("dddd");
//		return scoreDAO.getList();
		return scoreMapper.getList();
	}


	
	
	
	@Override
	public void delete(int num) {
//		scoreDAO.delete(num);
		System.out.println(num);
		scoreMapper.delete(num);
	}


	
}
