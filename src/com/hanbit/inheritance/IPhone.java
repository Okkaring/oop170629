package com.hanbit.inheritance;

public class IPhone extends CellPhone{
	protected String data;
	// KIND는 스마트폰 이라고 오버라이딩..
	// BRAND는 아이폰 이라고 오버라이딩..
	public final static String BRAND="아이폰";
	public final static String KIND="스마트폰";

	public void setData(String data){
		this.data=data;
		setPortable(true);
	}
	public String getData(){
		return data;
	}
	// 여기서 true를 뗴려버립시다. 감쳐버립시다 portable

	public String toString(){
		//아이폰은 스마트폰이기 때문에 이동가능한 상태로 홍길동에게 010번호로
		return String.format("%s 이기 때문에 %s상태로 %s 에게 %s 번호로  %s 를 사용해서 %s라고 메세지를 보냈다.", 
				KIND, getMove() , name, phoneNo, BRAND, data);
	}
}