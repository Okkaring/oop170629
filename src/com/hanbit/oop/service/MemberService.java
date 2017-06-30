//비지니스 Logic 여기서Service는 get,set을 쓰지말자

package com.hanbit.oop.service;
import com.hanbit.oop.domain.MemberBean;

public class MemberService{
	MemberBean session;		 	//43번 참고 / 인스턴스변수를 초기화하는 단계 //Ca적으로 Ram은 연산을 하지 않기 때문에 Cpu에서 연산한것을 갖고와야 하기 때문이지.
	public MemberService(){		//1.생성자는 리턴타입이 없다
		session=new MemberBean();
	}// session 생성자의 클래스이름은 memberService클라스이름과 같다.
	public String getAge(MemberBean memberB){
		String age="";
		int year=Integer.parseInt(memberB.getSsn().substring(0, 2));
		if(17-year>=0){
			age=String.valueOf(2017-(year+2000)+1);
		}else{
			age=String.valueOf(2017-(year+1900)+1);
		}
		return age;
	}

	public String getGender(MemberBean memberB){ 
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
	
	public String join(MemberBean memberB) {
							//property들의 형태가 같다.
		session=memberB;  	//session bean에 들어있는 정보가 들어있다고 초기화되었다.
							//session이 member와 같다는 뜻은 MemberBean의 값을
							//지금 이클라스, join이 시작할때 파라미터로 받기때문에, Bean의 set,get을 거친 id값을받고있음을 알려준다.
		
		//session에다가 회원가입시 입력한 정보를 저장하는 소스를 적어야한다. 답은 한줄
		return "환영합니다";
	}
	public String login(MemberBean memberB){
		//1.String id="",pw="",login=""; 여기서 의문점을 갖자. 잘못된 부분이 있다. id와 pw의 값은 여기서 선언하고 bean에서 갖고올 수 없지요.
		//2.즉, id를 pw를 연산된 정보와 비교를 해야하니까 먼저 이 클라스안에서 id를  filed에서 선언해준다.
		
		/*
		String login="";
		if(!session.getId().equals(session.getId())){
			login = "Diffrent Id!!";
		}else if(!session.getPw().equals(session.getPw())){	
			login = "Diffrent PassWord!!";
		}else{
			login = "Welcome\t"+memberB.getName()+"\t("+getAge(memberB)+",세"+getGender(memberB)+"\n";
		}
		return login;
		*/

		return (session.getId().equals(memberB.getId()) && session.getPw().equals(memberB.getPw())?
				"Login Success		"+session.getName()+"("+getAge(session)+")세"+getGender(session)
				:"Login Failed");
		
	}
}
