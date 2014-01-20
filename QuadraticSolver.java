/*
 * Copyright (c) 2013, OXUS20 and its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 */

import java.text.DecimalFormat;

/**
 * QuadraticSolver is responsible solving Quadratic Equation with usability
 * 
 * @author <a href="mailto:absherzad@gmail.com">Abdul Rahman Sherzad</a>
 * @version 1.0
 */

public class QuadraticSolver {

	/**
	 * 
	 * @param a
	 *            constant value for a
	 * @param b
	 *            constant value for b
	 * @param c
	 *            constant value for c
	 * @return the quadratic equation for given constant values (4.0x� + 6.0x +
	 *         2.0 = 0)
	 */
	public static String getEuqation(double a, double b, double c) {
		return a + "x\u00b2 " + ((b > 0) ? "+ " : "- ") + Math.abs(b) + "x "
				+ ((c > 0) ? "+ " : "- ") + Math.abs(c) + " = 0";
	}

	/**
	 * 
	 * @param a
	 *            constant value for a
	 * @param b
	 *            constant value for b
	 * @param c
	 *            constant value for c
	 * @return discriminant of quadratic equation by using following formula
	 *         discriminant = (b * b - 4 * a * c)
	 */
	public static double getDelta(double a, double b, double c) {
		return Math.pow(b, 2.0) - (4.0 * a * c);
	}

	/**
	 * 
	 * @param a
	 * @param b
	 * @param c
	 * @return quadratic equation roots considering almost all cases for example
	 *         Case 1: if discriminant < 0 
	 *         Case 2: if a = 0 
	 *         Case 3: if b = 0
	 *         Case 4: if a = 0 AND b == 0
	 */
	public static double[] getSolution(double a, double b, double c)
			throws ArithmeticException {
		double root1 = 0;
		double root2 = 0;
		double delta = getDelta(a, b, c);
		DecimalFormat df = new DecimalFormat("#.##");

		if (a == 0 && b != 0) {
			root1 = root2 = (-1.0 * c / b);
			if (c == 0) {
				root1 = root2 = 0;
			} else {
				throw new ArithmeticException(
						"\nNo possible solution for the following equation:\n"
								+ getEuqation(a, b, c));
			}
		} else if (a != 0 && b != 0) {
			double squareRoot = Math.sqrt(getDelta(a, b, c));
			if (delta >= 0) {
				root1 = (-1.0 * b + squareRoot) / (2.0 * a);
				root1 = Double.parseDouble(df.format(root1));
				root2 = (-1.0 * b - squareRoot) / (2.0 * a);
				root2 = Double.parseDouble(df.format(root2));
			} else {
				throw new ArithmeticException(
						"\nDiscriminant = " + delta + "\nTherefore, no real solution for the following equation:\n"
								+ getEuqation(a, b, c));
			}
		} else {
			if (a == 0) {
				throw new ArithmeticException(
						"\nDiscriminant = " + delta + "\nTherefore, no real solution for the following equation:\n"
								+ getEuqation(a, b, c));
			} else {
				root1 = root2 = Math.sqrt(-1.0 * c / a);
			}
		}
		return new double[] { root1, root2 };
	}
}