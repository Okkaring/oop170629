package com.hanbit.oop.service;

public class CalcService{
	public String calcBMI(double height, double weight){

		double bmi=weight/(height*height);
		String result=null;
		
		if(bmi<=18.5){
			result="lowWeight";
		}else if(18.5<bmi){
			result="normalWeight";
		}else if(bmi<=25){
			result="normalWeight";
		}else if(25.0<=bmi){
			result="overWeight";
		}else if(bmi<=30.0){
			result="overWeight";
		}else{
			result="obesity";
		}
		return result;	
	}
	public String calcPlus(String num1, String num2){
		return String.valueOf(Integer.parseInt(num1)+Integer.parseInt(num2));
	}
	public String calcMinus(String num1, String num2){
		return String.valueOf(Integer.parseInt(num1)+Integer.parseInt(num2));
	}
	public String calcMulti(String num1, String num2){
		return String.valueOf(Integer.parseInt(num1)+Integer.parseInt(num2));
	}
	public String calcDivide(String num1, String num2){
		return String.valueOf(Integer.parseInt(num1)+Integer.parseInt(num2));
	}
	
}