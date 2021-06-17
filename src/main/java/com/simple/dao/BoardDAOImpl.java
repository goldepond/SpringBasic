package com.simple.dao;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.simple.command.BoardVO;
@Repository("BoardDAO")
public class BoardDAOImpl implements BoardDAO {

	private ArrayList<BoardVO> list = new ArrayList<BoardVO>();
	@Override
	public void boardRegist(BoardVO vo) {
		System.out.println(vo.getTitle());
		list.add(vo);
	}

	@Override
	public ArrayList<BoardVO> getList() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public void boardDelete(int num) {
		list.remove(num);

	}

}
