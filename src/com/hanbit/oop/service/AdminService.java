package com.hanbit.oop.service;

import com.hanbit.oop.domain.MemberBean;

//관리자의 회원목록(list,array로 지금은 하자)
//지금은 목록을 가져오는 기능을 설정하는 것이다.

public interface AdminService {
	public void addMember(MemberBean member);			//set , member의 속성값을 갖고오는 기능
	public MemberBean[] getMembers();					//get , member의 속성값을 구하고, 보내주는 기능
	public int countMembers();							//get , member의 속성값을 구함, 멤버 수를 구해주는 기능
	
	
	//MemberBean[] getMembers=new MemberBean[];
	//선언 하는 법; MemberBean[] list=new MemberBean[]; ->[]여기에  숫자값을 넣어야하는데... 그건 회원수가 되겠지
}
