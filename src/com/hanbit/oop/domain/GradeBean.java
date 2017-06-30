package com.hanbit.oop.domain;

public class GradeBean {

	
	private int kor,eng,math;
	private String name, major;
	
	public void setKor(int kor){
		this.kor=kor;
	}
	public int getKor(){
		return this.kor;
	}
	public void setEng(int eng){
		this.eng=eng;
	}
	public int getEng(){
		return this.eng;
	}
	public int getMath(){
		return this.math;
	}
	public void setMath(int math){
		this.math=math;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public void setMajor(String major){
		this.major=major;
	}
	public String getMajor(){
		return major;
	}
	
	//toSring 결과 보여주는 메소드의 통용 이름 
		public String toString(){
			return "========================================\n"
					+"		이름		전공		성적		\n"
					+"------------------\n"
					+"======================================";
		}
}
