/**
 * 
 */
package edu.cpp.cs.cs331;

/**
 * @author tarikrajper
 *
 */
public class QuickSort {
		
	public QuickSort() {
	}
	
	public int partition(int[] arr, int low, int high) {
		int pivot = arr[high];				//Sets pivot to the high, or the farthest right of the array
		
		int i = low - 1;						//Sets counter at beginning of array		
		
		for (int j = low; j < high; j++) {	//Loops through array, from left
			
			if (arr[j] <= pivot) {			//if counter is less than or equal to pivot, increment i, swap i value with j value
				i++;	
			
				int temp = arr[i];		//Swap method
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		int temp = arr[i + 1];			//Swaps i value with the value at the end of the array, new pivot
		arr[i + 1] = arr[high];
		arr[high] = temp;
		
		return i + 1;				//returns pivot
		
	}
	
	public void quickSort(int[] array, int low, int high) {
		
		if (low < high) {
			
			int partitionIndex = partition(array, low, high);			//Finds index to partition array
			
			quickSort(array, low, partitionIndex - 1);				//sorts, or partitions, left half of array
			quickSort(array, partitionIndex + 1, high);				//sorts, or partitions, right half of array
			
		}
		
	}
	
}
