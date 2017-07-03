package com.hanbit.inheritance;

public class Phone {
	protected String name, phoneNo, brand, call;			//protected는 상속관계에서의 속성값을 자식에게만 공유할때 쓰는 예약어입니다. 
	public final static String KIND="집전화";
	
	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setPhoneNo(String phoneNo){
		this.phoneNo=phoneNo;
	}
	public String getPhoneNo(){
		return phoneNo;
	}
	public void setBrand(String brand){
		this.brand=brand;
	}
	public String getBrand(){
		return brand;
	}
	
	public void setCall(String call){
		this.call=call;
	}
	public String getCall(){
		return call;
	}
	
	public String toString(){
		return String.format("%s에게 %s번호로 %s,%s를 사용해서 %s라고 통화했다.", name, phoneNo, brand, KIND, call);
	}
	
}

//집전화기를 생각해봅시다..