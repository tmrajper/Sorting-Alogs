/**
 * 
 */
package edu.cpp.cs.cs331;

/**
 * @author tarikrajper
 *
 */
public class ExchangeSort {

	private int pointer;		//Index that compares value to i
		
	public ExchangeSort() {
		pointer = 0;
	}
	
	public void exchangeSort(int sortExchange[]) {
		while (pointer != sortExchange.length) {		//Checks if pointer is out of bounds
			for (int i = 0; i < sortExchange.length; i++) {		//loops through the index
				if (sortExchange[pointer] < sortExchange[i]) {	//checks if pointer is smaller than the index pointer
					int temp = sortExchange[pointer];		//temp variable to swap
					sortExchange[pointer] = sortExchange[i];	//swapping the values
					sortExchange[i] = temp;	//places larger value in correct place
				}
			}
			pointer++;	//increments pointer
		}
		
	}

}
