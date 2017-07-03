package com.hanbit.inheritance;

public class CellPhone extends Phone{
	protected boolean portable;					//property가 boolean형이면 기본적으로 이렇게 세팅을 합니다 
	private String move;
	public final static String KIND="휴대폰"; 					//final 은 상수를 만들고, static 은 한녀석 지금은 final만 만들겠다는 뜻입니다.
	
	public void setMove(String move){
		this.move=move;
	}
	
	public String getMove(){
		return move;
	}
	public void setPortable(boolean portable){
		if(portable){
			this.setMove("이동 가능");
		}
		else{
			this.setMove("이동 불가능");
		}
		this.portable=portable;
	
	}
	public boolean isPortable(){
		return portable;
	}
	
	@Override
	public String toString(){
		return String.format("%s 이기 때문에 %s 상태로 %s 에게 %s 번호로  %s %s를 사용해서 %s라고 통화했다.", 
				KIND, move, name, phoneNo, brand, KIND, call);
				
				
				//super.name, super.phoneNo, super.brand, KIND, super.call);
		
	}			//오버라이드 + 부모에게 똑같은 기능 = 부모의 기능을 죽이고, 내가 그 내용을 덮어 쓰겠다는 것이다.
}
