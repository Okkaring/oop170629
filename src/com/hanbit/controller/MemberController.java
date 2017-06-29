package com.hanbit.controller;


import java.util.Scanner;
import com.hanbit.oop.service.MemberService;

public class MemberController {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
	//Engine
		MemberService member=new MemberService();
		while(true){
			System.out.println("0.Stop 1.join 2.login");
			switch(s.next()){
			case "0": 
				System.out.println("Stop!!");
				return;
			case "1":
				System.out.println("Join");
				System.out.println("이름: ");
				String name = s.next();
				member.setName(name);
				System.out.println("ID: ");
				String id = s.next();
				member.setId(id);
				System.out.println("PW: ");
				String pw = s.next();
				member.setPw(pw);
				System.out.println("SSN");
				String ssn = s.next();
				member.setSSN(ssn);
				System.out.println("회원가입 성공!!");
				break;	
			case "2":
				System.out.println("Login");
				System.out.println("ID: ");
				String loginId = s.next();
				member.setLoginId(loginId);
				System.out.println("PW: ");
				String loginPw = s.next();
				member.setLoginPw(loginPw);
				System.out.println("ssn: "+member.getSSN());
				member.setLogin(loginId,loginPw);
				System.out.println("joing id: "+member.getId());
				System.out.println("joing pw: "+member.getPw());
				System.out.println(member.getLogin());
			break;
			
			}
		}
	}
}
