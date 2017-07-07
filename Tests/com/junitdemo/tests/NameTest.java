package com.junitdemo.tests;

import static org.junit.Assert.*;

import org.junit.Test;

import com.junitdemo.Name;

public class NameTest {
	Name n = new Name();
	@Test
	public void getNameTest() {
		assertEquals(n.getName(1),"Ro");
	}

}
