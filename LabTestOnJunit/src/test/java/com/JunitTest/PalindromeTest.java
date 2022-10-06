package com.JunitTest;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class PalindromeTest {
	
	@DisplayName(value="Checking String palindrome")
	@ParameterizedTest
	@ValueSource(strings  = {"abba","edde","zazazaz","tootootoot"})
	
	

	private static void isPalindromeTest(String str) {
		
		assertTrue(PalindromeTest.isPalindromeTest(str));
		
	}


}
