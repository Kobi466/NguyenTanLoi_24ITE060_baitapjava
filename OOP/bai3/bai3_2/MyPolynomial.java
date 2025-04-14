package bai3.bai3_2;

import java.util.Arrays;

public class MyPolynomial {
    private double[] coeffs;


    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }

    // Trả về bậc của đa thức
    public int getDegree() {
        return coeffs.length - 1; // Bậc là số mũ cao nhất
    }

    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = coeffs.length - 1; i >= 0; i--) {
            if (i < coeffs.length - 1 && coeffs[i] >= 0) {
                result.append("+"); // Thêm "+" cho các hệ số dương
            }
            result.append(coeffs[i]);
            if (i > 0) {
                result.append("x^").append(i); // Thêm x^n
            }
        }
        return result.toString();
    }

    // Đánh giá đa thức tại một giá trị x cho trước
    public double evaluate(double x) {
        double result = 0.0;
        for (int i = 0; i < coeffs.length; i++) {
            result += coeffs[i] * Math.pow(x, coeffs.length - 1 - i);
        }
        return result;
    }
}
