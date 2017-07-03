package com.hanbit.inheritance;

public class AndroidPhone extends IPhone{
	// BRAND = 갤럭시 노트가 된다.
	// data = 오버라이딩해서 카톡메세지라고 출력해봅시다.
	private String size, appl;
	public final static String BRAND="갤럭시 노트";
	
	public void setSize(String size){
		this.size=size;
	}
	public String getSize(){
		return size;
	}
	
	public void setAppl(String appl){
		this.appl=appl;
	}
	public String getAppl(){
		return appl;
	}
	
	@Override
	public String toString(){
		//스마트 폰이기 때문에 이동가능한 상태로 홍길동에게 010 번호로
		//갤럭시 노트 6인치를 사용해서 안녕이라고 카톡메세지를 전송했다.
		//사이즈는 외부에서 입력을 받겠습니다 ex) 사이즈가 무엇입니까?
		return String.format("%s 이기 때문에 %s상태로 %s 에게 %s 번호로  %s %s 를 사용해서 %s라고 %s메세지를 보냈다.", 
				KIND, getMove(), name, phoneNo, BRAND,size,data,appl);
	}
}
