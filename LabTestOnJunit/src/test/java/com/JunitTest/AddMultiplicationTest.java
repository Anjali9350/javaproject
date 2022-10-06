package com.JunitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.Junit.AddMultiplication;

public class AddMultiplicationTest {
	
	 @Test   //annotation
		public void AddMulTest() {
			
	    	 //here we recall adition method
	    	 assertEquals(14,AddMultiplication.Addition(2,12));
	    	 
	    	 //here we recall multiplication method
	    	 assertEquals(24, AddMultiplication.Multiplication(2,12));
	 }
}
