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