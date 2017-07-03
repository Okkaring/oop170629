package com.hanbit.oop.serviceImpl;

/*
클라이언트에서 프로그램 개발 요청이 왔습니다.
이름과 연봉을 입력받아서
연봉 ***만원을 받으시는 xxx님께서 납부할 세금은???만원입니다.
로 출력하는 프로그램을 만들어 주세요.
현재는 세율이 9.7프로라고 합니다.

이번 개정으로 과세표준이
1천 200만원까지는 8%,
1천 200만원 초과 ~ 4천 600만원 이하 17%,
4천 600만원 초과~ 8천 800만원 이하 26%,
8천 800만원 초과 35% 등으로 조정된다.

수정해라.
*/


public class TaxCalculService{
	public String[] execute(String name, int salary){
	double taxRate=0.0;
	int tax=0;
	
	if(salary<1200){ 
		taxRate=0.08;
	}else if(salary<=4600){
		taxRate=0.17;
	}else if(salary<=8800){
		taxRate=0.26;
	}else{
		taxRate=0.35;
	}

	tax=(int)(salary*taxRate);
	String sTax=tax+"";//int형 tax값을 sTax라고 다시 String형으로 선언한 것
	String sTaxRate=taxRate+"";
	
	String[] taxCalculResult=new String[2];
	taxCalculResult[0]=sTax;
	taxCalculResult[1]=sTaxRate;
	
	return taxCalculResult;
	}
}