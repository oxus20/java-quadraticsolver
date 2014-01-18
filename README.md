# Java Quadratic Solver
QuadraticSolver Java Class is responsible solving Quadratic Equation with usability purpose containing following methods:

1. getEquation() // return the quadratic equation for given constant values (4.0x² + 6.0x + 2.0 = 0)

2. getDelta()    // return discriminant of quadratic equation by using the formula discriminant = (b * b - 4 * a * c)

3. getSolution() // return quadratic equation roots considering almost all cases for example

* **Case 1:** if discriminant < 0
* **Case 2:** if a = 0
* **Case 3:** if b = 0
* **Case 4:** if a = 0 AND b == 0

## Using Quadratic Solver Class
Following QuadraticApplication.java demonstrates usage of QuadraticSolver.java
 ```java
 public class QuadraticApplication {

	public static void main(String[] args) {
		double a = 4;
		double b = 6;
		double c = 2;

		String eq = QuadraticSolver.getEuqation(a, b, c);
		System.out.println(eq);

		double delta = QuadraticSolver.getDelta(a, b, c);
		System.out.println("Delta: " + delta);

		String roots = QuadraticSolver.getSolution(a, b, c);
		System.out.println(roots);
	}
 }
 ```
 
[Follow us on Facebook](https://www.facebook.com/Oxus20)