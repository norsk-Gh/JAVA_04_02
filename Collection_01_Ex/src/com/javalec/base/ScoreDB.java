package com.javalec.base;

public class ScoreDB {

	
	
	
	//Field
	String name;
	int scoreMath;
	int scoreEnglish;
	
	
	
	//Constructor
	
	public ScoreDB() {
		
	}

	public ScoreDB(String name, int scoreMath, int scoreEnglish) {
		super();
		this.name = name;
		this.scoreMath = scoreMath;
		this.scoreEnglish = scoreEnglish;
	}
	
	
	//Method
	



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScoreMath() {
		return scoreMath;
	}

	public void setScoreMath(int scoreMath) {
		this.scoreMath = scoreMath;
	}

	public int getScoreEnglish() {
		return scoreEnglish;
	}

	public void setScoreEnglish(int scoreEnglish) {
		this.scoreEnglish = scoreEnglish;
	}



	
	
	
	
	
	
	
	
	
	
	
}
