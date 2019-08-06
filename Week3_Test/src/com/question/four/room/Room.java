package com.question.four.room;

import java.util.Random;

public class Room {
	
	public final boolean isInfected; 
	public boolean visited = false;
	
	Room(boolean infected) {
		isInfected = infected; 
		}
	
	
	public static Room [][] createFacility() {
		
		Random random = new Random();
		int isInfected;
		Room [][] facility = new Room [10][10];
		
		for(int i = 0; i < facility.length; i++) {
			
			for (int j = 1; j < facility.length; j++) {
				isInfected = random.nextInt(2);
				
				if(isInfected > 0) {
					facility[i][j] = new Room(true);
					
				}else {
					
					facility[i][j] = new Room (false);
				}
				
				
			}
			
		}
		
		return facility;
	}
	
	public static boolean isOutbreak(Room [][]floor) {
		
		Random random = new Random();
		
		int number = random.nextInt(10);
		
		if (number > 7) {
			
			return false;
		}else {
			
			
			return true;
		}
		
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(isOutbreak(createFacility()));
		
		
	}

}


/*
 * 
 * 
 * Room [][] verticalTrue = {
				
				{new Room(false), new Room (false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
				{new Room(true), new Room (false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false)},
				{new Room(false), new Room (false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
				{new Room(false), new Room (true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false)},
				{new Room(false), new Room (false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false)},
				{new Room(false), new Room (false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(true), new Room(true), new Room(false), new Room(false)},
				{new Room(true), new Room (false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false)},
				{new Room(false), new Room (true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false)},
				{new Room(false), new Room (false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
				{new Room(false), new Room (false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false)}
				
		};
		
		Room [][] horizontalTrue = {
				
				{new Room(false), new Room (false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false)},
				{new Room(false), new Room (false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false)},
				{new Room(false), new Room (true), new Room(true), new Room(true), new Room(true), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false)},
				{new Room(false), new Room (false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false)},
				{new Room(false), new Room (false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false)},
				{new Room(false), new Room (false), new Room(true), new Room(true), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false)},
				{new Room(false), new Room (false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false)},
				{new Room(false), new Room (true), new Room(false), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false)},
				{new Room(false), new Room (false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false)},
				{new Room(false), new Room (false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false)}
				
		};
		
		Room [][] safety = {
				
				{new Room(false), new Room (false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false)},
				{new Room(true), new Room (false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false)},
				{new Room(false), new Room (false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
				{new Room(false), new Room (false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false)},
				{new Room(false), new Room (true), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(true), new Room(false), new Room(true)},
				{new Room(false), new Room (false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false)},
				{new Room(true), new Room (false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
				{new Room(false), new Room (false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(true), new Room(false), new Room(false), new Room(true)},
				{new Room(true), new Room (false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false), new Room(false), new Room(false)},
				{new Room(false), new Room (false), new Room(false), new Room(false), new Room(false), new Room(false), new Room(true), new Room(false), new Room(false), new Room(false)}
				
		};
		
		
 * 
 * 
 * 
 * 
 * */


