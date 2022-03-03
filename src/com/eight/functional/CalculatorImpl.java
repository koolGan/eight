package com.eight.functional;


/**
 * @author Ganesh Mahato
 *
 */
public class CalculatorImpl {

	public static void main(String[] args) {

		// Functional interface using on lambda function
		Calculator sum = (x, y) -> x + y;
		System.out.println("Sum = " + sum.calculate(123, 345));

		Calculator sub = (x, y) -> {
			if (x > y)
				return x - y;
			else
				throw new RuntimeException("please enter correct values");
		};
		System.out.println("sub = " + sub.calculate(23, 4));
	}
}
