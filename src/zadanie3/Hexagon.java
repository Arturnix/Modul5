package zadanie3;

public class Hexagon implements GeometricFigure{

    private double sideLength;

    public Hexagon(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (3 * ((1.73 * 100)/100) * Math.pow(sideLength, 2));
    }
}
