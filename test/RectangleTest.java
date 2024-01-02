import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import zadanie3.GeometricFigure;
import zadanie3.Rectangle;

public class RectangleTest {

    GeometricFigure testObject = new Rectangle(2, 5);

    @Test
    public void calculationOfArea() {
        Assertions.assertEquals(10, testObject.calculateArea());
    }

}
