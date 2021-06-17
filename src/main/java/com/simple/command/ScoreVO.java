package com.simple.command;

public class ScoreVO {
	private String name;
	private String kor;
	private String math;
	
	public ScoreVO() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "ScoreVO [name=" + name + ", kor=" + kor + ", math=" + math + "]";
	}

	public ScoreVO(String name, String kor, String math) {
		super();
		this.name = name;
		this.kor = kor;
		this.math = math;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKor() {
		return kor;
	}

	public void setKor(String kor) {
		this.kor = kor;
	}

	public String getMath() {
		return math;
	}

	public void setMath(String math) {
		this.math = math;
	}
	
	
}
