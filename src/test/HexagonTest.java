package test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zadanie3.GeometricFigure;
import zadanie3.Hexagon;

public class HexagonTest {

    GeometricFigure testObject = new Hexagon(4);

    @Test
    public void calculateArea() {
        Assertions.assertEquals(41.52, testObject.calculateArea());
    }
}
