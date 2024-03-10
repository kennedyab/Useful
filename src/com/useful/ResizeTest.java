package com.useful;

import org.junit.Test;

public class ResizeTest {

	@Test
	public void test() {
		String knownValue = "h";
		double newSize = 1080;
		double expectedOutput = 1620;
		Resize rs = new Resize();
		
		double result = rs.resize(knownValue, newSize);
		System.out.println(result);
		//assertEquals(result, expectedOutput, expectedOutput);
		assert(result == expectedOutput);
	}

}
