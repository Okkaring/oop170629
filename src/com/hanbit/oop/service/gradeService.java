package com.hanbit.oop.service;

import com.hanbit.oop.domain.GradeBean;
import com.hanbit.oop.domain.MemberBean;

public class GradeService{
		GradeBean g=new GradeBean();      //이상해..
		
		public int calcTotal(GradeBean g){
			return g.getKor()+g.getEng()+g.getMath();
		}
		public int calcAvg(int total){
			return total/3;
		}
		
		public String getGrade(int avg){
			String grade="";
			switch(avg/10) {
            case 10 : case 9 :
            	grade= "장학금 대상입니다 \n";
				break;
            case 8 :
            	grade= "3학점 이수";
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
            	grade= "학사 경고";
				break;
        }
			return grade; 
	}
}
