package zadanie4;

import zadanie3.Rectangle;

public class Square extends Rectangle {

    public Square(int width, int length) {
        super(width, length);
    }

    public int calculateDiameter() {
        return 2 * (this.width + this.length);
    }
}
