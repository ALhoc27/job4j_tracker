package ru.job4j.oop;

public class Triangle {
    private final double firstDistSecond;
    private final double secondDistThird;
    private final double firstDistThird;

    public Triangle(Point ap, Point bp, Point cp) {
        firstDistSecond = ap.distance(bp);
        firstDistThird = ap.distance(cp);
        secondDistThird = bp.distance(cp);
    }

    public double semiPerimeter(double ab, double bc, double ac) {
        return (ab + ab + ac) / 2;
    }

    public boolean exist(double ab, double ac, double bc) {
        return (ab + bc > ac) && (bc + ac > ac) && (ac + ab > bc);
    }

    public double area() {
        double rsl = -1;

        if (this.exist(firstDistSecond, firstDistThird, secondDistThird)) {
            double p = semiPerimeter(firstDistSecond, firstDistThird, secondDistThird);
            rsl =  Math.sqrt(p * (p - firstDistSecond) * (p - secondDistThird) * (p - firstDistThird));
        }
        return rsl;
    }
}
