/**
 * 
 */
package edu.cpp.cs.cs331;

import java.util.Random;
import java.util.Scanner;

/**
 * @author tarikrajper
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter an Integer: ");		//User input
		int n = scan.nextInt();
		scan.close();
		Random rand = new Random();
		int[] array = new int[n]; 					//Fills array one
		for (int i = 0; i < n; i++) {
			int x = rand.nextInt(100) + 1;
			array[i] = x;
		}
		
		int[] array2 = new int[n];					//Fills array two
		for (int i = 0; i < n; i++) {
			int x = rand.nextInt(100) + 1;
			array2[i] = x;
		}
		
		int[] array3 = new int[n];					//Fills array 3
		for (int i = 0; i < n; i++) {
			int x = rand.nextInt(100) + 1;
			array3[i] = x;
		}											//Three arrays to avoid sorting already sorted arrays
		
		ExchangeSort es = new ExchangeSort();
		long eStart = System.currentTimeMillis();
		es.exchangeSort(array);
		long eEnd = System.currentTimeMillis();
		System.out.println("Exchange sort took: " + (eEnd - eStart) / 1 + " Milliseconds to sort");		//Calls Exchange sort and calculates running time
		printArray(array);
		System.out.println();
		System.out.println("----------------------------");
		
		MergeSort ms = new MergeSort();
		long mStart = System.currentTimeMillis();
		ms.mergeSort(array2);
		long mEnd = System.currentTimeMillis();
		System.out.println("Merge sort took: " + (mEnd - mStart) / 1 + " Milliseconds to sort");			//Calls Merge sort and calculates running time
		printArray(array2);
		System.out.println();
		System.out.println("----------------------------");
		
		QuickSort qs = new QuickSort();
		long qStart = System.currentTimeMillis();
		qs.quickSort(array3, 0, n - 1);
		long qEnd = System.currentTimeMillis();
		System.out.println("Quick sort took: " + (qEnd - qStart) / 1 + " Milliseconds to sort");			//Calls Quick sort and calculates running time
		printArray(array3);
		System.out.println();
		System.out.println("----------------------------");
		
		
	}
	
	public static void printArray(int[] arr) {			//Prints array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + ", ");
		}
	}
	
	

}
