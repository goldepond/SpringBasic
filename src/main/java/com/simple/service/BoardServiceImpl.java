package com.simple.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.simple.command.BoardVO;
import com.simple.dao.BoardDAO;
import com.simple.mapper.BoardMapper;
@Service("BoardService")
public class BoardServiceImpl implements BoardService {

//	@Autowired
//	@Qualifier("BoardDAO")
//	private BoardDAO boarddao;

	@Autowired
	private BoardMapper boardmapper;
	
	@Override
	public void boardRegist(BoardVO vo) {
//		scoreDAO.regist(vo);
//		scoreMapper.regist(vo);
//		boarddao.boardRegist(vo);
		boardmapper.boardRegist(vo);
	}

	@Override
	public ArrayList<BoardVO> getList() {
//		return boarddao.getList();
		return boardmapper.getList();
	}

	@Override
	public void boardDelete(int num) {
//		boarddao.boardDelete(num);
		boardmapper.boardDelete(num);

	}

}
