package com.hanbit.oop.domain;


// 	MemberBean은 콩알이 들어가는 콩깍지와 같다!
//	property를 정의하는 Bean
public class MemberBean {

		private String id, pw, ssn, name;
		
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
		public void setSsn(String ssn){
			this.ssn = ssn;
		}
		public String getSsn(){
			return ssn;
		}
		public void setName(String name){
			this.name = name;
		}
		public String getName(){
			return name;
		}
		public String toString() {
			return "회원: "+"이름 : "+name+"아이디: "+id+"패스워드: "+pw+"주민번호 : "+ssn;
		}
}