package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.MemberService;

public class MemberServiceImpl implements MemberService{
		MemberBean session;		 	//43번 참고 / 인스턴스변수를 초기화하는 단계 //Ca적으로 Ram은 연산을 하지 않기 때문에 Cpu에서 연산한것을 갖고와야 하기 때문이지.
		public MemberServiceImpl(){		//1.생성자는 리턴타입이 없다
			session=new MemberBean();
		}
		
	@Override
	public String getAge(MemberBean memberB) {
		String age="";
		int year=Integer.parseInt(memberB.getSsn().substring(0, 2));
		if(17-year>=0){
			age=String.valueOf(2017-(year+2000)+1);
		}else{
			age=String.valueOf(2017-(year+1900)+1);
		}
		return age;
	}

	@Override
	public String getGender(MemberBean memberB) {
		String gender="";
		char ch = memberB.getSsn().charAt(7);
		switch(ch) { 
			case '1' : case '3' :
				gender="남";
				break;
			case '2' : case '4' :
				gender="여";
				break;
			case '5' : 
				gender="외국남";
				break;
			case '6' :
				gender="외국녀";
				break;
			default :
				gender="외계인";
				break;
		}
		return gender;
	}

	@Override
	public String join(MemberBean memberB) {
		session=memberB;  
		return "환영합니다";
	}

	@Override
	public String login(MemberBean memberB) {
		return (session.getId().equals(memberB.getId()) && session.getPw().equals(memberB.getPw())?
				"Login Success		"+session.getName()+"("+getAge(session)+")세"+getGender(session)
				:"Login Failed");
	}

}
