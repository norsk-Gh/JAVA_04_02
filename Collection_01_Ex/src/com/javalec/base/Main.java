package com.javalec.base;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<ScoreDB> arrayScore = new ArrayList<ScoreDB>();
		
		arrayScore.add(new ScoreDB("James", 90, 100));
		arrayScore.add(new ScoreDB("Hyoeun", 100, 100));
		arrayScore.add(new ScoreDB("Jaewon", 80, 80));
		
		
		// 재원쓰 고치기
		arrayScore.set(2, new ScoreDB("Jaewon", 90, 90));
		
		// 효은이의 영어점수 불러오기
		System.out.println("효은이 영어 점수는? : " + arrayScore.get(1).getScoreEnglish());
		
		
		
		
		
	}

}
