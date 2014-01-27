# Java Quadratic Solver
**QuadraticSolver Java** Class is responsible solving Quadratic Equation with usability purpose containing following **static** methods:

1. **getEquation()**
  * return the quadratic equation for given constant values (**4.0x² + 6.0x + 2.0 = 0**)

2. **getDelta()**
  * return discriminant of quadratic equation by using the formula **delta = (b * b - 4 * a * c)**

3. **getSolution()**
  * return quadratic equation roots considering almost all cases for example
  1. **Case 1:** if discriminant < 0
  2. **Case 2:** if a = 0
  3. **Case 3:** if b = 0
  4. **Case 4:** if a = 0 AND b == 0

## Using Quadratic Solver Class
Following **QuadraticApplication.java** demonstrates usage of **QuadraticSolver.java**

 ```java
 public class QuadraticApplication {

	public static void main(String[] args) {
		double a = 14;
		double b = 6;
		double c = 2;

		String eq = QuadraticSolver.getEuqation(a, b, c);
		System.out.println(eq);

		try {
			double roots[] = QuadraticSolver.getSolution(a, b, c);
			System.out.println("x1: " + roots[0]);
			System.out.println("x2: " + roots[1]);
		} catch (ArithmeticException e) {
			System.err.println(e.getMessage());
		}
	}
 }
 ```
 
[Presentation on Slide Share website](http://www.slideshare.net/oxus20/object-oriented-concept-static-vs-non-static)
 
[Follow us on Facebook](https://www.facebook.com/Oxus20)