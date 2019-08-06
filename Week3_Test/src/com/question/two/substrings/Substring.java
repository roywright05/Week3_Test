package com.question.two.substrings;

import com.question.four.room.Room;

public class Substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String name = "Pocahontas";
		
		System.out.println(name.length());
		System.out.println(name.substring(1, name.length()));
		
		subString(name);

	}
	
	public static void subString(String yourString) {
		
		int length = yourString.length();
		
		
		for(int i = 0; i < length; i ++) {
			for(int j = i; j < length; j++) {
				
				System.out.println(yourString.substring(i,j));
			}
		}
//		for(int i = 0; i < length; i++) {
//			
//			System.out.println(yourString.substring(i,length));
//		}
		
		
		
	}

}
