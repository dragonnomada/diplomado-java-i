class Parabola {

	public static void main(String[] args) {
		double[] x = new double[100];
		double[] y = new double[100];

		for (int i = 0; i < 100; i++) {
			x[i] = -10 + i * 0.2;
		}

		for (int j = 0; j < 100; j++) {
			y[j] = x[j] * x[j];
		}

		for (int k = 0; k < 100; k++) {
			System.out.printf("| %04.2f | %04.2f |\n", x[k], y[k]);
		}
	}

}