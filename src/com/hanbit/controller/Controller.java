package com.hanbit.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import com.hanbit.oop.service.BmiService;
import com.hanbit.oop.service.CalcService;
import com.hanbit.oop.service.GradeService;
import com.hanbit.oop.service.RankingService;
import com.hanbit.oop.service.SecTimeService;
import com.hanbit.oop.service.TaxCalculService;
import com.hanbit.oop.service.BigNumberService;

import javafx.scene.control.Tab;

public class Controller {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		CalcService calcService = new CalcService();
		SecTimeService secTime = new SecTimeService();
		TaxCalculService taxCalcul = new TaxCalculService();
		RankingService ranking= new RankingService();
		GradeService g = new GradeService();
		BmiService bm= new BmiService();
		BigNumberService bigNum = new BigNumberService();
		
		while (true) {
			System.out.println("0.stop 1.Bmi 2.grade 3.- 4.bigNumber 5.secTime 6.taxCalcul 7.leapYear");
			switch (s.next()) {
			case "0":
				System.out.println("end");
				return;

			case "1":
				System.out.println("height? ");
				double height=s.nextDouble();
				System.out.println("weight? ");
				double weight=s.nextDouble();
				
				bm.setWeight(weight);
				bm.setHeight(height);
				bm.setBmi();
				bm.setResult();
				
				System.out.println(bm.getResult());
				break;
				
			case "2":
				System.out.print("이름?\n");
				String name=s.next();
				g.setName(name);
				
				System.out.print("전공?\n");
				String major=s.next();
				g.setMajor(major);
				
				System.out.print("국어점수?\n");
				int kor=s.nextInt();
				g.setKor(kor);

				System.out.print("영어점수?\n");
				int eng=s.nextInt();
				g.setEng(eng);

				System.out.print("수학점수?\n");
				int math=s.nextInt();
				g.setMath(math);
				
				g.setGrade();
				
				System.out.println(g.toString());
				break;
				
			case "3":
				
			case "5":
				System.out.print("A 값을 입력하세요");
				int a = s.nextInt();

				System.out.print("B 값을 입력하세요");
				int b = s.nextInt();

				System.out.print("C 값을 입력하세요");
				int c = s.nextInt();

				String result1 = bigNum.execute(a, b, c);
				System.out.println(result1);
				break;
				
			case "6":
				System.out.print("초(second) 입력 : \n");
				int second = s.nextInt();

				String secTimeResult = secTime.execute(second);
				break;
/*
			case "7":
				System.out.println("이름을 입력 하시오");
				String name = s.next();
				System.out.println("연봉 입력 하시오(단위: 만원)");
				int salary = s.nextInt();
				String[] taxCalculResult = taxCalcul.execute(name, salary);

				System.out.print("*******************************************\n");
				System.out.print("이름 | 연봉 |  세율  |  납부할 세금  \n");
				System.out.print("------------------------------------------\n");
				System.out.print(name + salary + taxCalculResult[1] + taxCalculResult[0] + "\n");
				System.out.print("연봉%" + salary + "만원을 받으시는" + name + "님께서 납부할 세금은" + taxCalculResult[0] + "만원입니다.");
				break;

			case "8":
				System.out.println("연도를 입력 하세요.");
				int year = s.nextInt();
				
				System.out.print("leapYearResult");
				break;

			case "9":
				System.out.println("###### 성적 랭킹 ######");
				int[] scores=new int[3]; 
				String[] names=new String[3];
				for (int i = 0; i < 3; i++) {
					System.out.println("이름를 입력하세요.");
					names[i] = s.next();
					System.out.println("점수를 입력하세요.");
					scores[i] = s.nextInt();
				}
				String rankingResult=ranking.ranking(scores,names);
				int firstScore=Integer.parseInt(rankingResult.split(",")[0]);
				System.out.println(firstScore+"\n");
				int secondScore=Integer.parseInt(rankingResult.split(",")[1]);
				System.out.println(secondScore+"\n");
				int thirdScore=Integer.parseInt(rankingResult.split(",")[2]);
				System.out.println(thirdScore+"\n");
				System.out.print(String.format("1등 %s의 점수: %d, 2등 %s의 점수: %d, 3등 %s의 점수: %d \n",names[0], firstScore,names[1], secondScore, names[2], thirdScore));
				//System.out.println(rankingResult);
				//System.out.print("1등:"+scoreRanking[0]+"점 \t 2등: "+scoreRanking[1] +"점 \t 3등: "+scoreRanking[2]+"점");
				break;
		/*	case "10":
				//input
				System.out.print("Enter Name: \n");
				String yourName=s.next();		
				System.out.print("Enter korean: \n");
				int kor=s.nextInt();
				System.out.print("Enter english: \n");
				int eng=s.nextInt();
				System.out.print("Enter math: \n");
				int math=s.nextInt();
				int total=0, avg=0;
				
				String gradeReportResult = gradeReport.execute(yourName,kor,eng,math);
				System.out.print("***********************************\n");
				System.out.print("이름     총점      평균   등급  \n");
				System.out.print("-----------------------------------\n");
				System.out.print(String.format("| %s | %d  |  %d  |  %s \n",yourName,total,avg,gradeReportResult));
				System.out.print("***********************************");
				
				System.out.print(gradeReportResult);
				*/
			}
		}
	}
}
