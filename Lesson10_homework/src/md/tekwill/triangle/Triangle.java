package md.tekwill.triangle;

public class Triangle {
    public double a, b, c;
    private double S, P;
    public double calculateArea() {
        double p;
        p = calculatePerimeter()/2;
        S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return S;
    }

    private double calculatePerimeter () {
        return P = a+b+c;
    }

}
