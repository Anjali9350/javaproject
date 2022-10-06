package com.JunitTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.Junit.MyArrayList;

public class MyArrayListTest {
	@Test
	public void isEmpty()
	{
		assertEquals(false,MyArrayList.myArrayListMain().isEmpty());
	}
	//method-2 to check the size of the 
	@Test
	public void sizeArrayListTest()
	{
		assertEquals(5,MyArrayList.myArrayListMain().size());
	}

}
