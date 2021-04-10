package com.javalec.base;

public class Student {

	//field       //DB와 필드는 매칭되야한다.
	
	String name;
	int score;
	
	
	
	//constructor
	public Student() {
		
	}

	public Student(String name, int score) {   // 한번에 두개 데이터를 넣기 위해서!! 필드에도 저거 써서 여기에 만들어준거임
		super();
		this.name = name;
		this.score = score;
	}

	//method         // Source -> Generate Getter n Setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	
	
	
	
	
	
	
	
	
}
