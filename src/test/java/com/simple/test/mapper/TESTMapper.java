package com.simple.test.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TESTMapper {
	public String getTEST(); //xml파일에서 사용해야되는 메서드
}
