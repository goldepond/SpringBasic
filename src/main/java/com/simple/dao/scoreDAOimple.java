package com.simple.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.simple.command.ScoreVO;

@Repository("yyy")
public class scoreDAOimple implements scoreDAO {

	@Autowired
	private DataSource dataSource;

	@Override
	public void regist(ScoreVO vo) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "insert into T_score values(T_score_seq.nextval,?,?,?)";
		try {

			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getName());
			pstmt.setString(2, vo.getKor());
			pstmt.setString(3, vo.getMath());
			pstmt.executeUpdate();
		} catch (Exception e) {
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstmt != null)
					pstmt.close();

			} catch (Exception e) {
			}
		}
	}

	@Override
	public ArrayList<ScoreVO> getList() {
		ArrayList<ScoreVO> list = new ArrayList<>();
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String sql = "select * from T_score";

		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				ScoreVO vo = new ScoreVO();
				vo.setBno(rs.getInt("bno"));
				vo.setName(rs.getString("name"));
				vo.setKor(rs.getString("kor"));
				vo.setMath(rs.getString("math"));

				list.add(vo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (conn != null)
					conn.close();
				if (pstmt != null)
					pstmt.close();

			} catch (Exception e) {
			}
		}
		
		return list;
	}

	@Override
	public void delete(int num) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		String sql = "delete from T_score where bno =? ";
		try {
			conn = dataSource.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1,num);
			pstmt.executeUpdate();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
	}

}
