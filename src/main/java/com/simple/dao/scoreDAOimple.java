package com.simple.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.simple.command.ScoreVO;

@Repository("yyy")
public class scoreDAOimple implements scoreDAO {

	private ArrayList<ScoreVO> list = new ArrayList<>();
	@Override
	public void regist(ScoreVO vo) {
		list.add(vo); //DB에 저장.
		System.out.println(vo.getName());
		System.out.println(vo.getKor());
		System.out.println(vo.getMath());

		System.out.println(list);
	}
	@Override
	public ArrayList<ScoreVO> getList() {
		return list;
	}
	@Override
	public void delete(int num) {
		list.remove(num);
		
	}

}
