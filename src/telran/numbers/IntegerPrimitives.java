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

	public static byte getLengthByte() {
		
		return -1;
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
		// TODO Auto-generated method stub
		return -1;
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
		// TODO Auto-generated method stub
		return -1;
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

	public static short getlengthShort() {
		// TODO Auto-generated method stub
		return -1;
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
		// TODO Auto-generated method stub
		return -1;
	}
	
	private static int getLength(long x) {
		//TODO
		return -1;
	}

	


}
