package telran.numbers;

import static org.junit.jupiter.api.Assertions.*;

import telran.numbers.IntegerPrimitives;

import org.junit.jupiter.api.Test;

class IntegerPrimitivesTest {

	@Test
	void getMaxByte() {
		assertEquals(Byte.MAX_VALUE, IntegerPrimitives.getMaxByte());
	}
	@Test
	void getMinByte() {
		assertEquals(Byte.MIN_VALUE, IntegerPrimitives.getMinByte());
	}
	@Test
	void getlengthByte() {
		assertEquals(2, IntegerPrimitives.getLengthByte());
	}
	
	@Test
	void getMaxShort() {
		assertEquals(Short.MAX_VALUE, IntegerPrimitives.getMaxShort());
	}
	@Test
	void getMinShort() {
		assertEquals(Short.MIN_VALUE, IntegerPrimitives.getMinShort());
	}
	@Test
	void getlengthShort() {
		assertEquals(2, IntegerPrimitives.getlengthShort());
	}
	@Test
	void getMinInt() {
		assertEquals(Integer.MAX_VALUE, IntegerPrimitives.getMaxInt());
	}
	@Test
	void getMaxInt() {
		assertEquals(Integer.MIN_VALUE, IntegerPrimitives.getMinInt());
	}
	@Test
	void getLengthInt() {
		assertEquals(4, IntegerPrimitives.getLengthInt());
	}
	
	@Test
	void getMaxLong() {
		assertEquals(Long.MAX_VALUE, IntegerPrimitives.getMaxLong());
	}
	@Test
	void getMinLong() {
		assertEquals(Long.MIN_VALUE, IntegerPrimitives.getMinLong());
	}
	@Test
	void getLengthLong() {
		assertEquals(6, IntegerPrimitives.getLengthLong());
	}
	@Test
	void getMaxChar() {
		assertEquals(Character.MAX_VALUE, IntegerPrimitives.getMaxChar());
	}
	@Test
	void getMinChar() {
		assertEquals(Character.MIN_VALUE, IntegerPrimitives.getMinChar());
	}
	@Test
	void getLengthChar() {
		assertEquals(2, IntegerPrimitives.getLengthChar());
	}
}
