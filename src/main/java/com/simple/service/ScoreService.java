package com.simple.service;

import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.stereotype.Service;

import com.simple.command.ScoreVO;

public interface ScoreService {
	public void regist(ScoreVO vo);
//	public void regist(HashMap<String, String> map);
	public ArrayList<ScoreVO> getList();
	public void delete(int num);
}
