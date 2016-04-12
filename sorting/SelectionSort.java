/**
 * 
 */
package com.java.sorting;

/**
 * @author Ravali
 *
 */
public class SelectionSort {

	public static void selection(int numbers[]){
		int min,temp;
		for(int i=0;i<numbers.length;i++){
			//assuming first element is minimum
			min=i;
			//sort the rest of the elements
			for(int j=i+1;j<numbers.length;j++){
				if(numbers[j]<numbers[min]){
					min=j;
				}
				//swaping the min and element less than min
				if(min!=i){
					temp=numbers[i];
					numbers[i]=numbers[min];
					numbers[min]=temp;
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
		selection(numbers);
		//System.out.println("sorted");
		display(numbers);



	}

}


