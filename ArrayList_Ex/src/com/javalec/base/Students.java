package com.javalec.base;

public interface Students {

	public String student;
	int koreanPoint;
	int englishPoint;
	int mathPoint;
	int totalPoint;
	
	//constructor
	public Students() {
	}
	
	//method
	
	public String getStudents() {
		return student;
	}

	public void setStudent(String student) {
		this.student = student;
	}

	public int getKoreanPoint() {
		return koreanPoint;
	}

	public void setKoreanPoint(int koreanPoint) {
		this.koreanPoint = koreanPoint;
	}

	public int getEnglishPoint() {
		return englishPoint;
	}

	public void setEnglishPoint(int englishPoint) {
		this.englishPoint = englishPoint;
	}

	public int getMathPoint() {
		return mathPoint;
	}

	public void setMathPoint(int mathPoint) {
		this.mathPoint = mathPoint;
	}

	public int getTotalPoint() {
		return totalPoint;
	}

	public void setTotalPoint(int totalPoint) {
	}
		this.totalPoint = totalPoint;
	
	
	
	
}
