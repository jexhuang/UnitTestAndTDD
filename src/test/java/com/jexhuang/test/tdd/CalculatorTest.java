package com.jexhuang.test.tdd;

import org.junit.Assert;
import org.junit.Test;

import com.jexhuang.tdd.Calculator;

public class CalculatorTest {

	/*
	 * first step: add a test case ,and return the whatever correct result
	 * second step : write some logic code third step : run test and re-factor
	 * third step : repeat first and second step
	 */
	@Test
	public void testAdd1() {
		Assert.assertTrue(10 == Calculator.add1("5", "5"));
	}

	@Test(expected = Exception.class)
	public void testAdd2() {
		Calculator.add2("a", "1");
	}
}
