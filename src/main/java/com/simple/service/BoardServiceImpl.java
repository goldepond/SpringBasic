package com.simple.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simple.command.BoardVO;
import com.simple.dao.BoardDAO;
@Service("BoardService")
public class BoardServiceImpl implements BoardService {

	@Autowired
	@Qualifier("BoardDAO")
	private BoardDAO boarddao;
	
	@Override
	public void boardRegist(BoardVO vo) {
		
		boarddao.boardRegist(vo);
	}

	@Override
	public ArrayList<BoardVO> getList() {
		return boarddao.getList();
	}

	@Override
	public void boardDelete(int num) {
		boarddao.boardDelete(num);

	}

}
