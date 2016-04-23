package com.jexhuang.tdd;

public class Calculator {

	public static int add1(String arg1, String arg2) {
		return 10;
	}

	public static int add2(String arg1, String arg2) {
		Integer value1 = Integer.valueOf(arg1);
		Integer value2 = Integer.valueOf(arg2);
		return value1 + value2;
	}

}
