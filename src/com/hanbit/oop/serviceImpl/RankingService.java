package com.hanbit.oop.serviceImpl;

import java.util.Scanner;
public class RankingService{
	public String ranking(int[] scores, String[] names){
		int[] scoreRanking=new int[3];// scoreRanking[0],scoreRanking[1],scoreRanking[2]
		String [] nameRanking=new String[3]; //nameRanking[0], nameRanking[1], nameRanking[2]
		
		if(scores[0] > scores[1] && scores[0] > scores[2]) {
				scoreRanking[0]=scores[0];
				nameRanking[0]=names[0];
				if(scores[1] > scores[2]){
					scoreRanking[1]=scores[1];
					nameRanking[1]=names[1];
					scoreRanking[2]=scores[2];
					nameRanking[2]=names[2];
				}else{
					scoreRanking[1]=scores[2];
					nameRanking[1]=names[2];
					scoreRanking[2]=scores[1];
					nameRanking[2]=names[1];
					}
				
			}else if(scores[1]>scores[0] && scores[1]>scores[2]) {
				scoreRanking[0]=scores[1];
				nameRanking[0]=names[1];
				if(scores[0]>scores[2]){
					scoreRanking[1]=scores[0];
					nameRanking[1]=names[0];
					scoreRanking[2]=scores[2];
					nameRanking[2]=names[2];
				}else{
					scoreRanking[1]=scores[2];
					nameRanking[1]=names[2];
					scoreRanking[2]=scores[0];
					nameRanking[2]=names[0];
				}
				
			}else {
				scoreRanking[0]=scores[2];
				nameRanking[0]=names[2];
				if(scores[0]>scores[1]){
					scoreRanking[1]=scores[0];
					nameRanking[1]=names[0];
					scoreRanking[2]=scores[1];
					nameRanking[2]=names[1];
				}else{
					scoreRanking[1]=scores[1];
					nameRanking[1]=names[1];
					scoreRanking[2]=scores[0];
					nameRanking[2]=names[0];
				}
			}
		String result=scoreRanking[0]+","+ scoreRanking[1]+","+ scoreRanking[2];
			//System.out.print(String.format("1등 %s의 점수: %d, 2등 %s의 점수: %d, 3등 %s의 점수: %d ",names[0], scores[0],names[1], scores[1], names[2], scores[2]));
			//System.out.print("1등:"+scoreRanking[0]+"점 \t 2등: "+scoreRanking[1] + "점 \t 3등: "+scoreRanking[2]+"점");
			return result;
	}
}

/*
System.out.print(String.format("    %s    %d    %s \n",name,((17-year)>=0)?2017-(year+2000)+1:age=2017-(year+1900)+1,gender));
		가장 큰 값부터 작은 순으로 나열하는 statement를 완성하시오
		예를 들어, a=4, b=7, c=1을 입력했다면... 7,4,1이 되겠습니다.
		*/