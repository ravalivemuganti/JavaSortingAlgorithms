/**
 * 
 */
package com.java.sorting;

/**
 * @author Ravali
 *
 */
public class BubbleSort {


	public static void bubble(int numbers[]){
		int temp;
		for(int i=0;i<numbers.length;i++){
			for(int j=0;j<numbers.length-1;j++){
				if(numbers[j]>numbers[j+1]){
					temp=numbers[j];
					numbers[j]=numbers[j+1];
					numbers[j+1]=temp;
					
				}
			}
		}
	}


	public static void display(int numbers[]){

		for(int i: numbers){
			System.out.println(i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers= new int[7];

		numbers[0]=23;
		numbers[1]=3;
		numbers[2]=1;
		numbers[3]=43;
		numbers[4]=63;
		numbers[5]=32;
		numbers[6]=12;

		//display(numbers);
		bubble(numbers);
		//System.out.println("sorted");
		display(numbers);



	}

}
