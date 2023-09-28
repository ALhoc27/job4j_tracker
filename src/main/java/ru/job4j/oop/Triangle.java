package ru.job4j.oop;

public class Triangle {
    /*  private final double firstDistSecond;
      private final double secondDistThird;
      private final double firstDistThird;*/
    private Point first;
    private Point second;
    private Point third;

    public Triangle(Point ap, Point bp, Point cp) {
    /*  firstDistSecond = ap.distance(bp);
        firstDistThird = ap.distance(cp);
        secondDistThird = bp.distance(cp);*/
        this.first = ap;
        this.second = bp;
        this.third = cp;
    }

    public double semiPerimeter(double ab, double bc, double ac) {
        return (ab + ab + ac) / 2;
    }

    public boolean exist(double ab, double ac, double bc) {
        return (ab + bc > ac) && (bc + ac > ac) && (ac + ab > bc);
    }

    public double area() {
        double rsl = -1;
        double ab = first.distance(second);
        double ac = first.distance(third);
        double bc = second.distance(third);

        if (this.exist(ab, ac, bc)) {
            double p = semiPerimeter(ab, ac, bc);
            rsl = Math.sqrt(p * (p - ab) * (p - ac) * (p - bc));
        }
        return rsl;

/*        if (this.exist(firstDistSecond, firstDistThird, secondDistThird)) {
            double p = semiPerimeter(firstDistSecond, firstDistThird, secondDistThird);
            rsl = Math.sqrt(p * (p - firstDistSecond) * (p - secondDistThird) * (p - firstDistThird));
        }
        return rsl;*/

    }
}
