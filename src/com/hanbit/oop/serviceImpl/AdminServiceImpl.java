package com.hanbit.oop.serviceImpl;

import com.hanbit.oop.domain.MemberBean;
import com.hanbit.oop.service.AdminService;

public class AdminServiceImpl implements AdminService{

	int count;
	MemberBean member;
	MemberBean[] list;
	
	public AdminServiceImpl(int limit){
		count=0;
		member = new MemberBean();
		list = new MemberBean[limit];
	}

	@Override
	public void addMember(MemberBean member) {
		list[count]=member;
		for(int i=0;i<(count+1);i++){
			System.out.println(list[i].toString());
		}
		count++;
	}
	
	@Override
	public MemberBean[] getMembers() {
		return list;
	}
	
	@Override
	public int countMembers() {
		return count;
	}

	@Override
	public MemberBean findById(String id) {
		member= new MemberBean();
		for(int i=0; i<list.length;i++){
			if(id.equals(list[i].getId())){
				member=list[i];
			}
		}
		System.out.println(member.toString());
		return member;
	}

	@Override
	public MemberBean[] findByName(String name) {
		int x=0;
		for(int i=0;i<list.length;i++){
			if(name.equals(list[i].getName())){
				x++;
			}
		}
		MemberBean[] members=new MemberBean[x];
		int j=0;
		for(int i=0;i<list.length;i++){
			if(name.equals(list[i].getName())){
				members[j]=list[i];
				j++;
			}
			if(j==x){
				break;
			}
		}
		return members;
	}

	@Override
	public void updatePass(MemberBean bean) {
		findById(bean.getId());
		System.out.println("바뀔 아이디: "+bean.getId());
		System.out.println("새로운 비밀번호: "+bean.getPw());
		System.out.println("기존 아이디: "+member.getId());
		System.out.println("기존 SSN: "+member.getSsn());
		System.out.println("기존 정보: "+member.toString());
		member.setPw(bean.getPw());
		
		
	}
}
