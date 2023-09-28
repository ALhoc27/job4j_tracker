package ru.job4j.oop;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

public class TriangleTest {

    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.area();
        double expected = 8;
        assertThat(rsl).isCloseTo(expected, offset(0.001));
    }

    @Test
    public void when006and403and044Then10Dot769() {
        Point a = new Point(0, 0, 6);
        Point b = new Point(4, 0, 3);
        Point c = new Point(0, 4, 4);
        Triangle triangle = new Triangle(a, b, c);
        double rsl = triangle.areaz();
        double expected = 10.769D;
        assertThat(rsl).isCloseTo(expected, offset(0.002));
    }
}