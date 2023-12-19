package zadanie3;

public class Rectangle implements GeometricFigure {

    protected int width;
    protected int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double calculateArea() {
        return this.length * this.width;
    }
}
