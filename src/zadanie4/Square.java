package zadanie4;

import zadanie3.Rectangle;

public class Square extends Rectangle {

    public Square(int side) {
        super(side, side);
    }

    public int calculateDiameter() {
        return 4 * this.width;
    }
}
