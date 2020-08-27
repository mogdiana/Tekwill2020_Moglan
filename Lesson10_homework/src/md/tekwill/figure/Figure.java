package md.tekwill.figure;

import md.tekwill.rectangle.Rectangle;
import md.tekwill.square.Square;
import md.tekwill.triangle.Triangle;

public class Figure {
    public static void main (String[] args) {
        Rectangle rect = new Rectangle();
        rect.setA(10);
        rect.setB(5);
        System.out.println("Dreptunghi: Perimetru = "+rect.getP()+" Aria = "+rect.getS());
        Square sq = new Square();
        sq.setA(4);
        sq.calculateS_P();
        Triangle tr = new Triangle();
        tr.a = 5;
        tr.b = 6;
        tr.c = 3;
        System.out.println("Triunghi: Aria = "+tr.calculateArea());

    }
}
