package com.hanbit.controller;

import com.hanbit.oop.domain.GradeBean;
import com.hanbit.oop.service.GradeService;
import javax.swing.*;

public class GradeController {
	public static void main(String[] args) {
		GradeService g = new GradeService();
		GradeBean gb= new GradeBean();
		
		while (true) {
			switch (JOptionPane.showInputDialog("0.Stop, 1.Grade")) {
			case "0":
				System.out.println("end");
				return;
			case "1":
				
				gb.setName((JOptionPane.showInputDialog("Name? ")));
				gb.setMajor((JOptionPane.showInputDialog("Major? ")));
				gb.setKor(Integer.parseInt((JOptionPane.showInputDialog("Korean?"))));
				gb.setEng(Integer.parseInt((JOptionPane.showInputDialog("English?"))));
				gb.setMath(Integer.parseInt((JOptionPane.showInputDialog("Math?"))));
				JOptionPane.showMessageDialog(null, g.getGrade(g.calcAvg(g.calcTotal(gb))));
				break;
			}
		}
	}
}
