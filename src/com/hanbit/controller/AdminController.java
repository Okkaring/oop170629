package com.hanbit.controller;

import javax.swing.JOptionPane;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.AdminService;
import com.hanbit.oop.serviceImpl.AdminServiceImpl;

public class AdminController {
	public static void main(String[] args) {
		String sCount=JOptionPane.showInputDialog("관리자님 총회원수를 입력해주세요");
		MemberBean bean=new MemberBean();
		
		AdminService service= new AdminServiceImpl(sCount);
		
		//int count=Integer.parseInt(sCount);
		
		int i=0;
		
		
		
		while(i<Integer.parseInt(sCount)+1){
			switch(JOptionPane.showInputDialog("0.exit 1.Add 2.Count 3.List")){
			case "0":
				JOptionPane.showInputDialog("stop");
				return;
			case "1":
				
				bean.setName(JOptionPane.showInputDialog("Name?"));
				bean.setSsn(JOptionPane.showInputDialog("SSN?"));
				bean.setId(JOptionPane.showInputDialog("ID?"));
				bean.setPw(JOptionPane.showInputDialog("PassWord?"));
				service.addMember(bean);
				JOptionPane.showMessageDialog(null, "Sucess Join");
				break;
			case "2":
				JOptionPane.showMessageDialog(null, service.countMembers());
				break;
			case "3":
				JOptionPane.showMessageDialog(null, service.getMembers());
				break;
				
			}
			i++;
		}
	}
}
