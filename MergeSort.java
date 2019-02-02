/**
 * 
 */
package edu.cpp.cs.cs331;

/**
 * @author tarikrajper
 *
 */
public class MergeSort {
	
	public MergeSort() {
		}
	
	public void merge(int[] arr, int[] leftArr, int[] rightArr) {
		int leftSize = leftArr.length;	//size of left sub array	
		int rightSize = rightArr.length;	//size of right sub array
		
		int i = 0;	//left sub array pointer
		int j = 0;	//right sub array pointer
		int pos = 0;	//original array pointer
		
		while (i < leftSize && j < rightSize) {	//checks if either pointer reaches the end of the sub array
			if (leftArr[i] <= rightArr[j]) {	//checks if value in left array is smaller than value in right sub array
				arr[pos] = leftArr[i];	//sets the smaller value in original array
				i++;		//increments left sub array pointer
				pos++;	//increments original array pointer
			} else {
				arr[pos] = rightArr[j];	//if right sub array value is bigger, sets its value in original array
				j++;		//increments right sub array pointer
				pos++;	//increments pointer of original array
			}
		}
		
		while (i < leftSize) {	//if left sub array has not reached the end, empties the array
			arr[pos] = leftArr[i];	//sets the rest of the values into the original array
			i++;		//increments left sub array pointer
			pos++;	//increments index of original array
		}
		
		while (j < rightSize) {	//if right sub array has not reached the end, empties the array
			arr[pos] = rightArr[j];	//sets the rest of the values into the original array
			j++;		//increments the right sub array pointer
			pos++;	//increments the original array pointer
		}
		
	}
	
	public void mergeSort(int[] array) {		//sorts the array
		int arrSize = array.length;	//keeps track of the size of the array
		if (arrSize < 2) {		//returns the array if there is only one value in it
			return;
		}
		
		int middle = arrSize / 2;	//find the middle index of the array
		
		int left = middle;	//size of the left sub array
		int right = arrSize - middle;	//size of the right sub array
		
		int[] leftArr = new int[left];	//left sub array
		int[] rightArr = new int[right];		//right sub array
		
		for (int i = 0; i < middle; i++) {	//fills the left sub array with half of the original array's values
			leftArr[i] = array[i];
		}
		for (int i = middle; i < arrSize; i++) {		//fills the right sub array with half of the original array's values
			rightArr[i - middle] = array[i];
		}
		
		mergeSort(leftArr);	//divides the array in half
		mergeSort(rightArr);		//divides the rest of the array in half
		
		merge(array, leftArr, rightArr);		//merges the two sub arrays into one sorted array
	}
	
	
	
	
	
	
	

}
