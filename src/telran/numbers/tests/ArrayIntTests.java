package telran.numbers.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.numbers.ArrayInt;

class ArrayIntTests {

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

}
