package telran.text.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.text.Strings;

class StringsClassTests {

	private static final int N_RUNS = 10000;
	private static final int N_STRINGS = 10000;

	@Test
	void deepCompareTest() {
		String str1 = "123,tT89";
		String str2 = "123,tT89";
		String str3 = "19";
		String str5 = "98Tt,321";
		String str4 = "kugy";
		int expected1[] = {8, 0};
		int expected2[] = {1, 1};
		int expected3[] = {0, 8};
		int expected4[] = {0, 0};
		assertArrayEquals(expected1, Strings.deepNoRepeatedCompare(str1, str2));
		assertArrayEquals(expected2, Strings.deepNoRepeatedCompare(str1, str3));
		assertArrayEquals(expected3, Strings.deepNoRepeatedCompare(str1, str5));
		assertArrayEquals(expected4, Strings.deepNoRepeatedCompare(str1, str4));
	}

	@Test
	void isAnagramTests() {
		String str1 = "Hello";
		String str2 = "Helll";
		String str3 = "eloHl";
		String str4 = "Helo";
		assertTrue(Strings.isAnagram(str1, str3));
		assertFalse(Strings.isAnagram(str1, str2));
		assertFalse(Strings.isAnagram(str1, str4));
		assertTrue(Strings.isAnagram(str1, str1));
	}
	
	@Test 
	void joinTest() {
		String array[] = {"Hello", "Vasya"};
		String expected = "Hello Vasya";
		assertEquals(expected,Strings.join(array, " "));
	}
    @Test
    void joinPerformanceTest() {
    	String array[] = getBigArray();
    	for(int i = 0; i < N_RUNS; i++) {
    		Strings.join(array, " ");
    	}
    }

	private String[] getBigArray() {
		String res[] = new String[N_STRINGS];
		for(int i = 0; i < res.length; i++) {
			res[i] = "Hello";
		}
		return res;
	}	
		@Test
		void matchesTest() {
            String match = "match";
            String noMatch = "no match";
			String name1 = "David";
			String name2 = "david";
			String name3 = "John F";
			String name4 = "John Fitzgerald";
			String name5 = "John K";
			String name6 = "John Fitzgerald";
			String name7 = "Anna Maria Magdalena";
			String name8 = "Anna Magdalena";
			String name9 = "Maria Magdalena";
			String name10 = "Anna Maria Roberta";
			String name11 = "Anna Magdalena Roberta";
			String name12 = "Anna Magdalena Maria";
			assertEquals(match,Strings.matches(name1, name2));
			assertEquals(match,Strings.matches(name3, name4));
			assertEquals(noMatch,Strings.matches(name5, name6));
			assertEquals(match,Strings.matches(name7, name8));
			assertEquals(match,Strings.matches(name7, name9));
			assertEquals(noMatch,Strings.matches(name7, name10));
			assertEquals(noMatch,Strings.matches(name7, name11));
			assertEquals(noMatch,Strings.matches(name7, name12));
		}
		@Test
		void sortStringsAsNumbersTest() {
			
			String[] ar = {"9", "250", "50", "123", "23", "9", "123", "50"} ;
			String expected[] =  {"9", "9", "23", "50", "50", "123", "123", "250"} ;
			Strings.sortStringsAsNumbers(ar);
			assertArrayEquals(expected, ar);
			}
		}

