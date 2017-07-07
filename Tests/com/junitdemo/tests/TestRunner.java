package com.junitdemo.tests;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
	public static void main(String[] args) {
		Result result =JUnitCore.runClasses(NumbersTest.class,NameTest.class);
		
		for(Failure r: result.getFailures()){
			System.out.println(r.getMessage());
		}	
		
		System.out.println(result.wasSuccessful());
	}
}
