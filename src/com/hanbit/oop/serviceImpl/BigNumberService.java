package com.hanbit.oop.serviceImpl;

//3개의 값을 입력받고 내림차순으로 정렬

public class BigNumberService{
	public String execute(int a, int b, int c){
		
		String result1="";
		int max=0, mid=0, min=0;
		
		if(a>b){
			if(a>c){
				max = a;
				if(b>c){
					mid = b;
					min = c;
					result1="a>b>c";
				}else{
					mid = c;
					min = b;
					result1="a>c>b";
				}
			}else{
				max = c;
				mid = a;
				min = b;
				result1="c>a>b";
			}
		}else{
			if(b>c){
				max = b;
				if(a>c){
					mid = a;
					min = c;
					result1="b>a>c";
				}else{
					mid = c;
					min = a;
					result1="b>c>a";
				}
			}else{
				max = c;
				mid = b;
				min = a;
				result1="c>b>a";
			}
		}
		return result1;
	}
}