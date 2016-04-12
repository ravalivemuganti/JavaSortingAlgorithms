/**
 * 
 */
package com.java.sorting;

/**
 * @author Ravali
 *
 */
public class InsertionSort {
	
	public static void insertion(int numbers[]){
		int temp, index;
		for(int i=0;i<numbers.length;i++){
			temp=numbers[i];
			index=i;
			while(index>0 && numbers[index-1]>temp){
				numbers[index]=numbers[index-1];
				index=index-1;
				numbers[index]=temp;	
			}
			
		}
	}
public static void display(int numbers[]){
	
	for(int i: numbers){
		System.out.println(i);
	}
}

public static void main(String args[]){
	
	int[] numbers= new int[5];
	
	numbers[0]=23;
	numbers[1]=3;
	numbers[2]=43;
	numbers[3]=63;
	numbers[4]=32;
	display(numbers);
	insertion(numbers);
	System.out.println("sorted");
	display(numbers);
	
	
	
}
}