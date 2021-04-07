package com.javalec.function;

public class Function {
	
//Field
	int num;
	
//Constructor
public Function(int num) {
	super();
	this.num = num;
}

//Method	
  //--Method (GuguOutPut)

	public void GuguOutput() {
		for(int i=1; i<=9; i++) {
			
			switch(i%2) {
			   case 0 : 
				   System.out.println(num + " X " + "*" + " = " +  num*i);
				   break;
				   
			   case 1 :    
				   System.out.println(num + " X " + i + " = " +  num*i);
				   break;
			}
		}//for
	}//GuguOutput
	
   //--Method (GuguOutPut)
	
	

}
