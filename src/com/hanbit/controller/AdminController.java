package com.hanbit.controller;

import javax.swing.JOptionPane;
import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.AdminService;
import com.hanbit.oop.serviceImpl.AdminServiceImpl;

public class AdminController {

	public static void main(String[] args) {
		MemberBean member=null;  
		// member에 들어있는 값은 스택에 저장된다.area가 끝나면 자동적으로 사라진다
		//선언만하고, 초기화를 안한꼴이지, null값으로 초기화를 한것은	
		//여기다 놓으면 마지막 회원정보만 출력 왜?
		// instance(주소+값)주소값을 공유하기 떄문입니다.
		// 여기서는 그러면 주소지를 한개만 줌
		// call by value : 현찰
		// call by reference : 계좌이체
		
		String sList="";
		
		String count=JOptionPane.showInputDialog("관리자님 총회원수를 입력해주세요");
		int limit=Integer.parseInt(count);
		AdminService service= new AdminServiceImpl(limit);
		
		while(true){
			switch(JOptionPane.showInputDialog("0.exit 1.add 2.count 3.list 4.findById 5.findByName 6.updatePass")){
			case "0":
				JOptionPane.showMessageDialog(null, "stop");
				return;
			case "1":
				member=new MemberBean();	//값을 바로 전달해주는 것.
				//while loop안에서 해줘야한다.
				
				//String spec=(JOptionPane.showInputDialog("Name?/ID/PASS/SSN"));
				String[] arr=(JOptionPane.showInputDialog("Name / ID / PASS / SSN ")).split("/");
				member.setName(arr[0]);
				member.setId(arr[1]);
				member.setPw(arr[2]);
				member.setSsn(arr[3]);
				service.addMember(member);
				JOptionPane.showMessageDialog(null, "Sucess Join");
				break;
				
			case "2":
				JOptionPane.showMessageDialog(null, service.countMembers());
				break;
				
			case "3":
				MemberBean[] list = service.getMembers();
				
				//JOptionPane.showMessageDialog(null, service.getMembers());
				//JOptionPane.showMessageDialog(null, "1번째"+list[0]);
				//JOptionPane.showMessageDialog(null, "2번째"+list[1]);
				//JOptionPane.showMessageDialog(null, "3번째"+list[2]);
				
				for(int i=0;i<list.length;i++){
					sList+=list[i].toString()+"\n";
				}
				JOptionPane.showMessageDialog(null, "리스트 \n"+sList);
				break;
				
			case "4":
				JOptionPane.showMessageDialog(null,service.findById(JOptionPane.showInputDialog("조회하려는 id를 입력하세요")).toString());
				break;
				
			case "5": 
				String name=JOptionPane.showInputDialog("조회하려는 이름을 입력하세요");
				MemberBean[] members= service.findByName(name);
				String result="";
				if(members.length==0){
					result="조회할 아이디가 없습니다.";
				}else{
					for(int i=0;i<members.length;i++){
						result+=members[i].toString()+"\n";
					}
				}
				JOptionPane.showMessageDialog(null, result);
				break;
				
			case "6":
				MemberBean bean=new MemberBean();
				bean.setId(JOptionPane.showInputDialog("아이디를 입력해주세요."));
				bean.setPw(JOptionPane.showInputDialog("변경할 비번을 입력하세요"));
				service.updatePass(bean);
				JOptionPane.showMessageDialog(null, "비밀번호 변경완료");
				break;
				
			}
		}
	}
}

