package telran.numbers;

public class IntegerPrimitives {

	public static byte getMaxByte() {
		int res = 1;
		while(res > 0 && res < 128) {
			res++;
		}
		return (byte) (res - 1);
	}

	public static byte getMinByte() {
		return (byte) (getMaxByte() + 1);
	}

	public static int getLengthByte() {
		
		byte res = 1;
		int count = 1;
		while(res > 0) {
			res = (byte) (res * 2);
			count++;
		}
		return count / 8;
	}

	public static long getMaxLong() {
		long res = 1;
		while(res > 0) {
			res= res * 2;
		}
		return res - 1;
	}

	public static long getMinLong() {
		 return getMaxLong() + 1;
	}

	public static int getLengthLong() {
		long res = 1;
		int count = 1;
		
		while (res > 0) {
			res =  (res * 2);
			
			count++;

		}
		return count / 8;
		
	}

	public static int getMaxInt() {
		int res = -1;
		while(res < 0) {
			res--;
		}
		return res;
		
	}

	public static int getMinInt() {
		
		return getMaxInt() +1;
	}

	public static int getLengthInt() {
		int res = 1;
		int count = 1;
		while (res > 0) {
			res = (int) (res * 2);
			count++;

		}
		return count / 8;
	  
	}

	public static short getMaxShort() {
		short res = 1;
		while(res > 0) {
			res =(short) ((int)res * 2);
		}
		return (short) (res - 1);
	}

	public static short getMinShort() {
		
		return (short) (getMaxShort() + 1);
	}

	public static int getlengthShort() {
		 
		short res = 1;
		int count = 1;
		while (res > 0) {
			res = (short) (res * 2);
			count++;

		}
		return count / 8;
	}
	public static char getMaxChar() {
		char res = 1;
		while(res > 0) {
			res= (char) ((int)res * 2);
		}
		return (char) (res - 1);
	}

	public static char getMinChar() {
		
		return (char) (getMaxChar() + 1);
	}

	public static int getLengthChar() {
		
		char res = 1;
		int count = 1;
		while (res > 0) {
			res = (char) (res * 2);
			count++;

		}
		return count / 8;
	}
	
	private static int getLength(long x) {
		long value = 1;
		int count = 1;
		while(value < x && value > 0) {
			value*= 2;
			count++;
		}
		return count / 8;
	}

	


}
