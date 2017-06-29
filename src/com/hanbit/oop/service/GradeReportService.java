package com.hanbit.oop.service;

public class GradeReportService{
	public String execute(String yourName, int kor, int eng, int math){
		
		String gradeReportResult="";
		int total=kor+eng+math;
		int avg=total/3;
		
		
		switch(avg/10) {
            case 10 : case 9 :
			gradeReportResult="장학금 대상입니다";	
				break;
            case 8 :
			gradeReportResult="3학점 이수";
				break;
            case 7 :
			gradeReportResult="2학점 이수";
				break;
            case 6 :
			gradeReportResult="2학점 이수";
				break;
			case 5 :
			gradeReportResult="재수강";
				break;
            default :
			gradeReportResult="학사 경고";
				break;
        }  
	
		gradeReportResult="yourName,total,avg,gradeReportResult";
	return gradeReportResult; 
	}
}