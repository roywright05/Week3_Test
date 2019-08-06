package com.question.three.twoDstring;

public class TwoDimenStringArray {

	public static void main(String[] args) {
		
		String [][] myStringArr = 
			{{"hey", "now"}, {"hey", "ya"}, {"bam", "ya"}, {"go", "stop"}, {"stop", "ya", "woo"}};
		
		stringArray(myStringArr);
		
		System.out.println(myStringArr.length);
		System.out.println(myStringArr[4].length);
		
		

	}
	
	public static void stringArray(String [][]array) {
		
			System.out.print("{"); 
			
			for(int i = 0; i < array.length; i++) {
				
				for(int j = i; j < array[i].length; j++) {
					
					if(array[i][i].equals(array[0][0])) {
						
						System.out.print(i + ", " + j);
					}
				} 
			}
			
			
			
			System.out.println("}");
		
	}

}
