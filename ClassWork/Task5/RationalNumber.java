class RationalNumber {
	int numerator;
	int denominator;

	RationalNumber() {
		numerator = 0;
		denominator = 1;
	}

	RationalNumber(int n, int d) {
		numerator = n;
		denominator = d;
	}

	double normilize() {
		return numerator/(denominator * 1.0);
	}
}