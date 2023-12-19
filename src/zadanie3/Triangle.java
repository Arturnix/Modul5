package zadanie3;

public class Triangle implements GeometricFigure{

    private int height;
    private int base;

    public Triangle(int height, int base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return 0.5 * (this.base * this.height);
    }
}
