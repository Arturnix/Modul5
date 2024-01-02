package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zadanie3.GeometricFigure;
import zadanie3.Triangle;

public class TriangleTest {

    GeometricFigure testObject = new Triangle(2,5);


    @Test
    public void calculateArea() {

        Assertions.assertEquals(5, testObject.calculateArea());
    }
}
