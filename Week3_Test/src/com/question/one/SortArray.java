package com.question.one;

public class SortArray {

	public static void main(String[] args) {
		
		int array [] = {10, 9, 8, 7, 6, 11};
		
		bubbleSort(array, array.length);
		

	}
	
public static void bubbleSort(int [] array, int length) {
		
		int temp;
		
		
			for(int i=0; i<array.length; i++) {
				
				boolean flag = false;
				
				for(int j = 0; j < array.length-1-i; j++) {
					
					if(array[j]>array[j+1]) {
						
						temp=array[j];
						array[j]= array[j+1];
						array[j+1]=temp;
						flag=true;
					}
					
					
				}//End second for loop
					
					if(!flag) {
						
						break;
					}
					
			}//End first for loop
						
				
			for(int i = 0; i < array.length; i++) {
				
				System.out.print(array[i] + " ");
			}
			System.out.println();
		
	}//end method

}
