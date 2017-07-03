package com.hanbit.controller;


import java.util.Scanner;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.MemberService;
import com.hanbit.oop.serviceImpl.MemberServiceImpl;

import javax.swing.*;

public class MemberController {
	public static void main(String[] args) {
	//Engine
		MemberService member=new MemberServiceImpl();
		MemberBean memberB=new MemberBean(); 				//s, member,memberB는 
		while(true){
			//System.out.println("0.Stop 1.join 2.login");
		//	String flag=JOptionPane.showInputDialog("0.Stop 1.join 2.login");
			//String flag=s.next();
			
			switch(JOptionPane.showInputDialog("0.Stop 1.join 2.login")){
			case "0": 
				System.out.println("Stop!!");
				return;
			case "1":
				System.out.println("Join");
				
				memberB.setName(JOptionPane.showInputDialog("name?"));
				memberB.setId(JOptionPane.showInputDialog("ID?"));
				memberB.setPw(JOptionPane.showInputDialog("PW?"));
				memberB.setSsn(JOptionPane.showInputDialog("SSN?"));
				JOptionPane.showMessageDialog(null, member.join(memberB));
				break;	
			case "2":
			//	memberB=new MemberBean(); // 멤버빈에있는 값을 초기화한다. 그러면 member는 지금 member에 있는 값.즉, 로그인단계에서 받는 값
				System.out.println("...Login...");
				
				memberB.setId(JOptionPane.showInputDialog("ID?"));
				memberB.setPw(JOptionPane.showInputDialog("PW?"));
				
				JOptionPane.showMessageDialog(null, member.login(memberB));
			break;
			}
		}
	}
}
