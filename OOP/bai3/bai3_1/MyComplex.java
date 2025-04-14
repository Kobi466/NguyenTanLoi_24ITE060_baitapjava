package bai3.bai3_1;

public class MyComplex {
    public double real;
    public double imag;
    public MyComplex() {
        this.real = 0;
        this.imag = 0;
    }
    public MyComplex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public double getImag() {
        return imag;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }
    public void setValue(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }
    public String toString() {
        return this.real + "+" + this.imag+"i";
    }
    public boolean isReal() {
        return imag == 0;
    }
    public boolean isImaginary() {
        return real == 0;

    }
    public boolean equals(double real, double imag) {
        return (this.real == real) && (this.imag == imag);
    }
    public boolean equals(MyComplex another) {
        return (this.real == another.real) && (this.imag == another.imag);
    }
    public double magnitude() {
        return Math.sqrt(this.real * this.real + this.imag * this.imag);
    }
    public double argument(){
        return Math.atan2(this.imag, this.real);
    }
    public MyComplex addNew(MyComplex right) {
        return new MyComplex(this.real + right.real, this.imag + right.imag);
    }
    public MyComplex addInto(MyComplex right) {
        this.real = this.real + right.real;
        this.imag = this.imag + right.imag;
        return this;
    }
    public MyComplex subtractNew(MyComplex right) {
        return new MyComplex(this.real - right.real, this.imag - right.imag);
    }
    public MyComplex subtract(MyComplex right) {
        this.real = this.real - right.real;
        this.imag = this.imag - right.imag;
        return this;
    }
    public MyComplex multiply(MyComplex right) {
        return new MyComplex(this.real * right.real, this.imag * right.imag);
    }
    public MyComplex divide(MyComplex right) {
        return new MyComplex(this.real / right.real, this.imag / right.imag);
    }
    public MyComplex conjugate() {
        return new MyComplex(-this.real, -this.imag);
    }


}
