package com.hanbit.oop.serviceImpl;
/* 초를 시간과 분으로 바꾸어 주는 프로그램입니다.
초를 입력해주세요.
60000
60000초 =16시간 40분 0초
*/
 
public class SecTimeService {
 public String execute (int second) {
	String secTimeResult="";
	int hour=second/3600;
	int minuite=second%3600/60;
  second=second%3600%60;
  
  secTimeResult="hour시간 minute분 second초";
  
  System.out.print(String.format("%d 시간 %d분 %d초 ",hour,minuite,second));
 
  return secTimeResult;
 }
}
 
 
/*
    min=sec/60; // 입력받은 sec를 60으로 나누면 분(min)
    hour=min/60; // min의 값을 60으로 나누면 시(hour)
    sec=sec%60; // 시분초로 바꿔주는 것이므로, sec를 60으로 나눠 그 나머지가 남은 초
    min=min%60; // 12줄과 마찬가지로, min을 60으로 나눠 그 나머지가 남은 분
*/
