package com.simple.controller;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.simple.test.mapper.TESTMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/config/root-context.xml")
public class MybatisTEST {

	//새션팩토리 빈 주입 확인
	@Autowired
	SqlSessionFactoryBean sqlSessionFactory;

	
	//매퍼파일 주입
	@Autowired
	TESTMapper testmapper;
	
	
	@Test
	public void MybatisTEST() {
		System.out.println(" 마이바티스 빈 : "+sqlSessionFactory);
		System.out.println(testmapper.getTEST());
	}
}
