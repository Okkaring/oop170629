//로그인 회원가입 해야한다. 
//Welcome 홍길동 (남)
//회원 가입 조건 name, id, pw, ssn

package com.hanbit.oop.service;

public class MemberService {
	private String id, pw, loginId, loginPw, ssn, gender, name, login, age;
	
	public void setId(String id){
		this.id = id;
	}
	public String getId(){
		return id;
	}
	
	public void setPw(String pw){
		this.pw = pw;
	}
	public String getPw(){
		return pw;
	}
	
	public void setLoginId(String loginId){
		this.loginId = loginId;
	}
	public String getLoginId(){
		return loginId;
	}
	
	public void setLoginPw(String loginPw){
		this.loginPw = loginPw;
	}
	public String getLoginPw(){
		return loginPw;
	}
	
	public void setSSN(String ssn){
		this.ssn = ssn;
	}
	public String getSSN(){
		setAge();
		setGender();
		return ssn;
	}
	
	public void setName(String name){
		this.name = name;
	}
	public String getName(){
		return name;
	}
	
	
	public void setAge(){
		
		//String sYear=this.ssn.substring(0,2); //(*인덱스 index , *count )
		int year=Integer.parseInt(ssn.substring(0, 2));
		
		if(17-year>=0){
			this.age=String.valueOf(2017-(year+2000)+1);
		}else{
			this.age=String.valueOf(2017-(year+1900)+1);
		}
	}
	public String getAge(){
		return age;
	}
	public void setGender(){
		switch(ssn.charAt(7)) {
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
	}
	public String getGender(){
		return gender;
	}
	
	public void setLogin(String loginId, String loginPw){
	
		if(!loginId.equals(this.id)){
			login = "아이디 달라";
		}else if(!loginPw.equals(this.pw)){	
			login = "달라";
		}else{
			login = toString();
		}
	}
	public String getLogin(){
		return login;
	}

	public String toString(){
		return 	"Welcome"+name+"("+gender+")"+","+age+"세";
	//	return "Welcome"+name;
	}
}
