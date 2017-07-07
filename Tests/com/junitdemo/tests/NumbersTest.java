package com.junitdemo.tests;

import static org.junit.Assert.*;
import org.junit.Test;

import com.junitdemo.Numbers;

public class NumbersTest {
	Numbers n = new Numbers();

	@Test
	public void isPrimeTest(){
		assertEquals(n.isPrime(6), false);
	}
	@Test
	public void isEvenTest(){
		assertEquals(n.isEven(4), true);
	}
	@Test
	public void isOddTest(){
		assertEquals(n.isOdd(5),true);
	}
	@Test
	public void addTest(){
		assertEquals(n.add(10, 4),14);
	}

}
