package com.hanbit.oop.service;

import com.hanbit.oop.domain.MemberBean;

public interface MemberService {
	public String getGender(MemberBean memberB);
	public String getAge(MemberBean memberB);
	public String join(MemberBean memberB);
	public String login(MemberBean memberB);
	
}		//MemberService는 유저의 입장에서 회원 가입하고 로그인 하는 기능을 갖고있다.
		//회원의 목록을 만들어서 , 회원의 목록을 관리하는 녀석이 따로 있지..it's Admin

