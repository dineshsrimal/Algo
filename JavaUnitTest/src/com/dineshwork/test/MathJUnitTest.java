package com.dineshwork.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.dineshwork.code.MathOperation;

class MathJUnitTest {

	@Test
	void testSum() {
		MathOperation tc = new MathOperation();
		assertEquals(3, tc.sum(1, 2));
	}

	@Test
	void testSubstract() {
		MathOperation tc = new MathOperation();
		assertEquals(3, tc.substract(5, 2));
	}

}
