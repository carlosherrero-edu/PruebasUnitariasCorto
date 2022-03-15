

public class ComplexNumber {

	private double real;
	private double imaginary;

	public ComplexNumber(double re, double imag) {
		real = re;
		imaginary = imag;
	}

	public double getReal() {
		return real;
	}

	public double getImaginary() {
		return imaginary;
	}

	public ComplexNumber add(ComplexNumber c) {
		return new ComplexNumber(getReal() + c.getReal(),
				getImaginary() + c.getImaginary());
	}

	public ComplexNumber multiply(ComplexNumber c) {
		double re = getReal() * c.getReal() - getImaginary() * c.getImaginary();
		double imag = getImaginary() * c.getReal() + getReal() * c.getImaginary();
		return new ComplexNumber(re, imag);
	}

	@Override
	public boolean equals(Object anObject) {
		if (anObject instanceof ComplexNumber) {
			ComplexNumber c = (ComplexNumber) anObject;
			return ((c.getReal() == getReal()) && (c.getImaginary() == getImaginary()));
		} else
			return false;
	}

}
