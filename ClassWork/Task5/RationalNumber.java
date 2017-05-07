class RationalNumber {

    int numerator;
    int denominator;

    RationalNumber() { 
        numerator = 1;
        denominator = 1;
    }


    RationalNumber(int userNumerator, int userDenominator) {
        numerator = userNumerator;
        denominator = userDenominator;
    }

    double normalize() {
        return (double)numerator / (double)denominator;
    }
}