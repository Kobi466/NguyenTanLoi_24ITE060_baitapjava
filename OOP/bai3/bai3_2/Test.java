package bai3.bai3_2;

public class Test {
    public static void main(String[] args) {
        MyPolynomial mp = new MyPolynomial();
        MyPolynomial mp1 = new MyPolynomial(1.1, 2.2, 3.3);
        mp1 = new MyPolynomial(1.1, 2.2, 3.3, 4.4, 5.5);
        System.out.println(mp1);
        double[] coeffs = new double[]{1.2, 3.4, 5.6, 7.8};
        MyPolynomial mp2 = new MyPolynomial(coeffs);
        System.out.println(mp2);
        System.out.println(mp2.getDegree());
        System.out.println(mp2.evaluate(3.4));

    }
}
