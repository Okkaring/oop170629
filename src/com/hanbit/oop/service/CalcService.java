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
	public String calcPlus(String plusNum1, String plusNum2){
		return String.valueOf(Integer.parseInt(plusNum1)+Integer.parseInt(plusNum2));
	}
	public String calcMinus(String MinusNum1, String MinusNum2){
		return String.valueOf(Integer.parseInt(MinusNum1)+Integer.parseInt(MinusNum2));
	}
	public String calcMulti(String MultiNum1, String MultiNum2){
		return String.valueOf(Integer.parseInt(MultiNum1)+Integer.parseInt(MultiNum2));
	}
	public String calcDivide(String DivideNum1, String DivideNum2){
		return String.valueOf(Integer.parseInt(DivideNum1)+Integer.parseInt(DivideNum2));
	}
	
}