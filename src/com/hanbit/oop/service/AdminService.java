package com.hanbit.oop.service;

import com.hanbit.oop.domain.MemberBean;

//관리자의 회원목록(list,array로 지금은 하자)
//지금은 목록을 가져오는 기능을 설정하는 것이다.

public interface AdminService {
	public void addMember(MemberBean member);			//set 
	//member는 오픈 불가능 속성이니까 일부러 은닉화해서 매개체로 보내주는 것
	public MemberBean[] getMembers();					//get 
	public int countMembers();							//get
	public MemberBean findById(String id);	
	//보안상 id는 공개되도 되는 속성값 그러니까 여기다 써줄수있는 것입니다.
	public MemberBean[] findByName(String name); //리턴타입이 복수형이니까 배열로 잡아준 것입니다....
	public void updatePass(MemberBean bean);
}
