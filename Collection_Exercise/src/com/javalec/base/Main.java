package com.javalec.base;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		for (int i = 1; i<=100; i++) {
			if(i%2==0) {
				arrayList.add(i);
			}
		}//for
		
		
		int tot = 0;
		for(int i=0; i<arrayList.size(); i++) {
			tot += arrayList.get(i);
		}
			System.out.println(tot);
		

	}

}
