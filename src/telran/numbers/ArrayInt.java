package telran.numbers;

import java.util.Arrays;

public class ArrayInt {

	
public static int[] addNumber(int arr[], int number) {
	
	int[] res = Arrays.copyOf(arr, arr.length +1);
	res[arr.length] = number;

	return res;
	
}
/**
 * 
 * @param arr
 * @param index
 * @param number
 * @return new array containing number value at the given index
 */

public static int[] insertNumber(int arr[], int index, int number){
	
//	int[] res = Arrays.copyOf(arr, 4);
//	res[3] = number;
//	
//	int dest[] = new int[arr.length + 1];
//	for(int i = 0; i < arr.length; i++) {
//		dest[i] = arr[i];
//	}
//	dest[dest.length - 1] = 20;
//
//    System.arraycopy(res, 3, dest, index, 1);
//	return dest;
	int res[] = new int[arr.length + 1];
	System.arraycopy(arr, 0, res, 0, index);
	res[index] = number;
	System.arraycopy(arr, index, res, index + 1, arr.length - index);
	return res;
  } 
/**
 * 
 * @param arr
 * @param index
 * @return new array with removed number at the given index
 */


public static int[] removeNumber(int arr[], int index) {

  int res[] = new int[arr.length - 1];
  int remainingElements = arr.length - (index + 1);

  System.arraycopy(arr, 0, res, 0 , index);
  System.arraycopy(arr, index + 1, res, index , remainingElements);

	return res;
}

/**
 * 
 * @param arr
 * @param number
 * @return return if the given number exists in the given array then returns the index of first occurrence,
 *  otherwise returns -1
 */
  public static int indexOf(int arr[], int number) {
	  int res = -1;
	  for(int i = 0; i < arr.length; i++) {
		  if(arr[i] == number) {
			  res = i;
			  break;
		  }
	  }
	  return res;
  }
public static void sort(int[] arr) {
	boolean flSorted = true;
	int length = arr.length;
	do{
		flSorted = moveMaxToEnd(arr,length);
		length--;
	}while(!flSorted);
}
		
	
	//TODO
	//Improve algorithm with a proper move MaxToEnd method
private static boolean moveMaxToEnd(int[] arr, int length) {
	boolean flSorted = true;
	for(int i = 1; i < length; i++) {
		if (arr[i - 1] > arr[i]) {
			flSorted = false;
			swap(arr,i);
		} 
	}
	//TODO
	//Improve algorithm of moveMaxToEnd: (1)no compare of elements that already exist on the proper places
	//(think of additional parameter of the method with code update
	//(2) terminate algorithm once an array is already sorted( think of returning some value with code update
	return flSorted;
}
private static void swap(int[] arr, int index) {
	int tmp = arr[index-1];
	arr[index - 1] = arr[index];
	arr[index] = tmp;
	}
public static int binaryIndexOf(int[] arr, int number) {
	int left = 0;
	int right = arr.length - 1;
	int middle = arr.length / 2;
	while (left <= right && arr[middle] != number) {
		if(arr[middle] < number) {
			left = middle + 1;
		} else {
			right = middle - 1;
		}
		middle = (left + right) / 2;
	}
	return left > right ? -(left + 1) : getFirstIndex(arr,middle,number);
}
private static int getFirstIndex(int[] ar, int middle, int number) {
	while(middle >= 0 && ar[middle] == number) {
		middle--;
	}
	return middle + 1;
}



}
