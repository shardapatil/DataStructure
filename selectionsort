package com.sortingtech.SelectionSort;

public class SelectionSort {
	/*
 	Create an array & insert the elements like 26 54 93 17 77 31 44 55 20 sort the
	array in assenting order using Selection sort and display the result.
	*/
	
	public static void selectioSort(int arr[])
	{
		for(int i=0; i< arr.length-1;i++)
		{
			int smallest = i;
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j] < arr[smallest])
				{
					smallest = j;
				}
			}
			 int temp = arr[i];  //26
			 arr[i] = arr[smallest];	// 17
			 arr[smallest] = temp;	//26
		}
	}
	
	public static void printArray(int arr[])
	{
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		int arr[] = {26,54,93,17,77,31,44,55,20};
		
		selectioSort(arr);
		printArray(arr);
	}
}
