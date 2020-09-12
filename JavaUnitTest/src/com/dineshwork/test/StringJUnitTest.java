package com.dineshwork.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.dineshwork.code.StringOperation;

class StringJUnitTest {

	@Test
	void test() {
		StringOperation so = new StringOperation();
		assertEquals("dineshsrimal", so.strConcat("dinesh", "srimal"));
	}

}
