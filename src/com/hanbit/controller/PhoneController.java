package com.hanbit.controller;

import javax.swing.JOptionPane;

import com.hanbit.inheritance.AndroidPhone;
import com.hanbit.inheritance.CellPhone;
import com.hanbit.inheritance.IPhone;
import com.hanbit.inheritance.Phone;

public class PhoneController {
	public static void main(String[] args) {
		Phone cp=new Phone();
		CellPhone nokia=new CellPhone();
		IPhone iphone=new IPhone();
		AndroidPhone android=new AndroidPhone();
		
		while(true){
			switch(JOptionPane.showInputDialog("0.Stop 1.Call 2.휴대폰 3. 아이폰 4.안드로이드")){
			case "0" :
				JOptionPane.showMessageDialog(null, "bye");
					return;
					
			case "1" :
				cp.setName(JOptionPane.showInputDialog("name?"));
				cp.setPhoneNo(JOptionPane.showInputDialog("phone Number?"));
				cp.setBrand(JOptionPane.showInputDialog("phone Brand?"));
				
				cp.setCall(JOptionPane.showInputDialog("phone Call Message?"));
				JOptionPane.showMessageDialog(null, cp.toString());
				break;
				
			case"2": 
				
				nokia.setName(JOptionPane.showInputDialog("name?"));
				nokia.setPhoneNo(JOptionPane.showInputDialog("phone Number?"));
				nokia.setBrand(JOptionPane.showInputDialog("phone Brand?"));
				nokia.setPortable(true);
				nokia.setCall(JOptionPane.showInputDialog("phone Call Message?"));
				JOptionPane.showMessageDialog(null, nokia.toString());
				
				break;
				
			case"3": 
				
				iphone.setName(JOptionPane.showInputDialog("name?"));
				iphone.setPhoneNo(JOptionPane.showInputDialog("phone Number?"));
				//iphone.setBrand(JOptionPane.showInputDialog("phone Brand?"));
				iphone.setData(JOptionPane.showInputDialog("phone Message?"));
				JOptionPane.showMessageDialog(null, iphone.toString());
				
				break;
				
			case"4": 
				
				android.setName(JOptionPane.showInputDialog("name?"));
				android.setPhoneNo(JOptionPane.showInputDialog("phone Number?"));
				android.setSize(JOptionPane.showInputDialog("phone Size?"));
				android.setAppl(JOptionPane.showInputDialog("What kind of Application?"));
				android.setData(JOptionPane.showInputDialog("phone Message?"));
				JOptionPane.showMessageDialog(null, android.toString());
				
				break;
			}
		}
	}
}
