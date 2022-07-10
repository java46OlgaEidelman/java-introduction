package telran.text;

public class Strings {
	private static final int MAX_NUMBER = 999;
	/**
	 * 
	 * @param str1 ascii string with no repeated symbols
	 * @param str2 ascii string with no repeated symbols
	 * @return array with two numbers
	 *    first - number of the symbols of the str2 that exist in str1 at the same indexes
	 *    second - number of the symbols of the str2 that exist in str1 at different indexes
	 */
		public static int[] deepNoRepeatedCompare(String str1, String str2) {
        int res[] = new int[2];
     
//     helperImpl(str1, str2, res);
     indexOfImpl(str1, str2, res);
     
		return res;
	}
		private static void indexOfImpl(String str1, String str2, int[] res) {
		char str2Arr[] = str2.toCharArray();
		for(int i = 0; i < str2Arr.length; i++) {
			int index = str1.indexOf(str2Arr[i]);
			if(index >= 0) {
				res[index == i ? 0 : 1]++;
			}
		}
		
	}
		private static void helperImpl(String str1, String str2, int[] res) {
			int helper[] = new int [127];

			fillInitHelper(helper);
			fillHelperString1(str1, helper);
		    fillResult(helper, res, str2);
		
	}
		private static void fillResult(int[] helper, int[] res, String str2) {
			char str2Ar[] = str2.toCharArray();
			for (int i = 0; i < str2Ar.length; i++) {
				int index = helper[str2Ar[i]];
				if (index >= 0) {
					res[index == i ? 0 : 1]++;
				}
			}
			
		}
		private static void fillHelperString1(String str1, int[] helper) {
			char str1Ar[] = str1.toCharArray();
			for (int i = 0; i < str1Ar.length; i++) {
				helper[str1Ar[i]] = i;
			}
			
		}
		private static void fillInitHelper(int[] helper) {
			for(int i = 0; i < helper.length; i++) {
				helper[i] = -1;
			}
			
		}
		/**
		 * 
		 * @param str1 English letters (may have repeats)
		 * @param str2 English letters (may have repeats)
		 * @return true if :
		 *     (1) str2 has the same as str1 length
		 *     (2) str2 comprises of all letters from str1
		 */
		public static boolean isAnagram(String str1, String str2) {
			//TODO

			// additional helper array such that array['a'] is the number of 'a' occurrences in str1
			//str1 = "hello", array['l'] = 2; array['w'] = 0;
			if (str1.length() != str2.length()) {
				return false;
			}
			int [] helper = new int[127];
			fillHelperOccurrences(str1, helper);
			return isAnagram(str2, helper);

		}
		private static boolean isAnagram(String str, int[] helper) {
			char[] strAr = str.toCharArray();
			for(int i = 0; i < strAr.length; i++) {
				int count = helper[strAr[i]]--;
				if (count == 0) {
					return false;
				}
			}
			return true;
		}
		private static void fillHelperOccurrences(String str, int[] helper) {
			char[] strAr = str.toCharArray();
			for(int i = 0; i < strAr.length; i++) {
				helper[strAr[i]]++;
			}

		}
		
		static public String join(String[]array, String delimiter) {
			
			//return stringPluseSolution(array,delimiter);
			
			return stringBuilderSolution(array, delimiter);
			
		}
		private static String stringBuilderSolution(String[] array, String delimiter) {
			StringBuilder strBuilder = new StringBuilder(array[0]);
			for(int i = 1; i < array.length; i++) {
				strBuilder.append(delimiter).append(array[i]);
				
			}
			return strBuilder.toString();
		}
		static private String stringPluseSolution(String[] array, String delimiter) {
			String res = array[0];
			for(int i = 1; i < array.length; i++) {
				res += delimiter + array[i];
			}
			return res;
		}
			/**
			 * 
			 * @param name1 -  first name 
			 * @param name2 - second name
			 * @return either "match" or "no match" in accordance to the comments (see TODO)
			 */
			static public String matches(String name1, String name2) {
				
				String[] partsName1 = name1.split(" ");
				String[] partsName2 = name2.split(" ");
	            int indPartsName2 = 0;
	            String match = "match";
	            String noMatch = "no match";
	            boolean flMatch = false;
	            for(int i = 0; i < partsName1.length; i++) {
	            	flMatch = matchesNames(partsName1[i],partsName2[indPartsName2]);
	            	if(flMatch) {
	            		indPartsName2++;
	            		if(indPartsName2 == partsName2.length) {
	            		return match;
	            	}
	            }
	        }
				return noMatch;
			}
			
			static private boolean matchesNames(String part1, String part2) {
				part1 = part1.toLowerCase();
				part2 = part2.toLowerCase();
				boolean res = false;
				if(part1.compareTo(part2) == 0) {
					res = true;
				}else if(isSameInitial(part1,part2)) {
					res = true;
				}
				return res;
				
			}
			private static boolean isSameInitial(String part1, String part2) {
				String partI = part1.length() == 1 ? part1 : part2;
				String partF = part1 == partI ? part2 : part1;
				return partI.length() == 1 && partF.startsWith(partI);
				
			}
			/**
			 * sorts array of strings
			 * @param strNumbers array of strings containing the positive integer numbers
			 * length of each string can not be more than three symbols
			 * String containing "123" should be greater than string containing "23" as the number 123 greater than
			 * number 23
			 */
			static public void sortStringsAsNumbers(String[] strNumbers) {
				int helper[] = new int[MAX_NUMBER + 1];
				fillHelper(strNumbers, helper);
				sorting(strNumbers, helper);
			}
			private static void sorting(String[] strNumbers, int[] helper) {
				int indAr = 0;
				for (int i = 0; i < helper.length; i++) {
					for(int j = 0; j < helper[i]; j++) {
						strNumbers[indAr++] = Integer.toString(i);
					}
				}

			}
			private static void fillHelper(String[] strNumbers, int[] helper) {
				for (int i = 0; i < strNumbers.length; i++) {
					int index = Integer.valueOf(strNumbers[i]);
					helper[index]++;
				}
			}
			
		}
		
			

