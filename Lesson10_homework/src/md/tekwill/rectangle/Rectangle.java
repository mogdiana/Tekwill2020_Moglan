package md.tekwill.rectangle;

public class Rectangle {
    private double a, b;
    private double S, P;

    public double getA() {
        return a;
    }
    public void setA(double a) {
        this.a = a;
    }
    public double getB() {
        return b;
    }
    public void setB(double b) {
        this.b = b;
    }
    public double getS() {
        calculateArea();
        return S;
    }
    public double getP() {
        calculatePerimeter();
        return P;
    }

    protected void calculateArea() {
        S = a*b;
    }
    private void calculatePerimeter () {
        P = 2*(a+b);
    }
}
