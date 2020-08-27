package md.tekwill.square;

public class Square {
    public double a;
    private double S, P;

    private void calculateArea() {
        S = a*a;
    }
    private void calculatePerimeter () {
        P = 4*a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void calculateS_P() {
        calculateArea();
        calculatePerimeter();
        System.out.println("Patrat: Aria = "+S+" Perimetru = "+P);
    }

}
