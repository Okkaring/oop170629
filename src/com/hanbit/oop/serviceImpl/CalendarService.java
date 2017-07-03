package com.hanbit.oop.serviceImpl;

/*
To. 개발자님
연도를 4로 나눈값이 0 이라면 윤년일 수 있다.

그러나 해당 연수가 100으로 나누어 떨어지면 평년이다.

2000년은 4로 나눈값이 0 이라서 윤년일 수 있는데..
다시 이 값이 100으로 나눠 떨어지면 평년이다.

평년이라 해도 다시 400으로 나눠 떨어지는 연도는 윤년이다.

예시) 2000년과 2016년을 입력하면 윤년으로 나옴
*/

public class CalendarService{
	
	private int year,month,date,day;//필드에 property에는 값을 할당하지 않는다. 선언만한다. 참조변수.	
	
	public void setYear(int year){
		this.year=year;
	}
	public int getYear(){
		return this.year;
	}
	public void setMonth(int year){
		this.month=month;
	}
	public int getMonth(){
		return this.month;
	}
	public void setDate(int date){
		this.date=date;
	}
	public int getDate(){
		return this.date;
	}
	public void getDay(){
		this.day=day;
	}
	public int setDay(int day){
		return this.day;
	}
	public String execute(int year){
	
		String result="";
	
		int num1=year%4;
		int num2=year%100;
		int num3=year%400;
		
		if(year%400==0){
			result="윤년입니다";
		}else if(year%100==0){
			result="평년입니다";
		}else {
			result="윤년입니다";
		}
		
		if(num1==0 && num2 !=0){
			result="윤년";
		}else if(num1==0 && num3==0){
			result="윤년";
		}else{
			result="평년";
		}
		
		return result;
	}
}