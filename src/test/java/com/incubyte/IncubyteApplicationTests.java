package com.incubyte;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class IncubyteApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void testEmptyString() {
		assertEquals(0, StringCalculator.add(""));
	}

}
