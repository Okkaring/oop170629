package com.hanbit.oop.service;

public class BmiService {

	private double height, weight, bmi;
	private String result;
		
	public void setHeight(double height){
		this.height=height;
	}
	public void setWeight(double weight){
		this.weight=weight;
	}
		
	public double getHeight(){
		return this.height;
	}
	public double getWeight(){
		return this.weight;
	}
	public double setBmi(){
		return this.bmi=weight/(height*height);
	}
	public double getBmi(){
		return bmi;
	}
	public void setResult(){
		
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
	}
	
	public String getResult(){
	return result;
	}
}