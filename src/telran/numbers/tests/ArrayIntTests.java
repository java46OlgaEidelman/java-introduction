package telran.numbers.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import telran.numbers.ArrayInt;

class ArrayIntTests {

	private static final int SMALL_N_NUMBERS = 100;
	private static final int LARGE_N_NUMBERS = 1_000_00;
	private static final int N_RUNS = 1000;
	@Test
	void referenceTests() {
		int arr[] = {1, 2, 3, 4};
		int arr1[] = arr;
		arr1[1] = 100;
		assertEquals(100, arr[1]);
	}
	@Test
	void addNumberTest() {
		int expected[] = {1, 2, -10, 20};
		int arr[] = {1, 2, -10};
		assertArrayEquals(expected, ArrayInt.addNumber(arr, 20));
	}
	@Test
	void insertNumberTest() {
		int expected[] = {1, 2, -10, 20};
		int arr[] = {1, 2, 20};
		assertArrayEquals(expected, ArrayInt.insertNumber(arr, 2, -10));
	}
	@Test
	void removeNumberTest() {
		int expected1[] = {1, 20};
		int expected2[] = {2, 20};
		int expected3[] = {1, 2};
		int arr[] = {1, 2, 20};
		assertArrayEquals(expected1, ArrayInt.removeNumber(arr, 1));
		assertArrayEquals(expected2, ArrayInt.removeNumber(arr, 0));
		assertArrayEquals(expected3, ArrayInt.removeNumber(arr, 2));
	}
	@Test
	void indexOfTest() {
		int ar[] = {1, 2, 20, 2};
		assertEquals(1, ArrayInt.indexOf(ar, 2));
		assertEquals(0, ArrayInt.indexOf(ar, 1));
		assertEquals(-1, ArrayInt.indexOf(ar, 10));
	}
	@Test
	void sortSmallTest() {
		int arr[] = new int[SMALL_N_NUMBERS];
		fillRandomNumbers(arr);
		ArrayInt.sort(arr);
		runSortTest(arr);
	}
	@Test
	void sortLargeTest() {
		int arr[] = new int[LARGE_N_NUMBERS];
		fillRandomNumbers(arr);
		Arrays.sort(arr);
		ArrayInt.sort(arr);
		runSortTest(arr);
	}
	@Test
	void binarySearchTest(){
		int arr[] = {1, 5, 100, 200, 350, 500};
		assertEquals(0, ArrayInt.indexOf(arr,1));
		assertEquals(2, ArrayInt.indexOf(arr,100));
		assertEquals(5, ArrayInt.indexOf(arr,500));
		assertTrue(ArrayInt.binaryIndexOf(arr,150) < 0);
		//Tests for HW #4
		assertEquals(-1, ArrayInt.binaryIndexOf(arr, -10));
		assertEquals(-4, ArrayInt.binaryIndexOf(arr, 150));
		assertEquals(-7, ArrayInt.binaryIndexOf(arr, 600));
		int arr1[] = {1,1,1,1,1};
		assertEquals(0, ArrayInt.binaryIndexOf(arr1, 1));
	}
	@Test
	void indexOfPerfomance() {
		int arr[] = new int[LARGE_N_NUMBERS];
		for(int i = 0; i < N_RUNS; i++) {
			assertTrue(ArrayInt.indexOf(arr, 1) < 0);
		}
	}
	@Test
	void binaryIndexOfPerfomance() {
		int arr[] = new int[LARGE_N_NUMBERS];
		for(int i = 0; i < N_RUNS; i++) {
			assertTrue(ArrayInt.binaryIndexOf(arr, 1) < 0);
		}
	}
	
	private void runSortTest(int[] arr) {
		for(int i = 1; i < arr.length; i++) {
			assertTrue(arr[i - 1] <= arr[i]);
		}
		
	}
	private void fillRandomNumbers(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * Integer.MAX_VALUE);
		}
		
	}

}
