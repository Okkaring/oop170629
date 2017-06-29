package com.hanbit.oop.service;

public class GradeService{

		//field
		private int kor,eng,math,total,avg;
		private String grade, name, major;
		
		public void setKor(int kor){
			this.kor=kor;
		}
		public void setEng(int eng){
			this.eng=eng;
		}
		public void setMath(int math){
			this.math=math;
		}
		
		public int getKor(){
			return this.kor;
		}
		public int getEng(){
			return this.eng;
		}
		public int getMath(){
			return this.math;
		}
		
		public void setTotal() {
			this.total=kor+eng+math;
		}
		
		public int getTotal(){
		return total;
		}
		
		public void setAvg(){
			this.avg=total/3;
		}
		
		public void setGrade() {
			setTotal();
			setAvg();
			
			switch(avg/10) {
            case 10 : case 9 :
            	grade="장학금 대상입니다";	
				break;
            case 8 :
            	grade="3학점 이수";
				break;
            case 7 :
            	grade="2학점 이수";
				break;
            case 6 :
            	grade="2학점 이수";
				break;
			case 5 :
				grade="재수강";
				break;
            default :
            	grade="학사 경고";
				break;
        } 
		}
		
	public String getGrade() {
		return grade;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	
	public void setMajor(String Major){
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
				+name+"/t"+major+"\t"+grade+"\n"
				+"======================================";
	}
	
}