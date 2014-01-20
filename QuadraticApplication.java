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