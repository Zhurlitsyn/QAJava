package lesson7.figures;

import static java.lang.Math.sqrt;

public class Rectangle extends Figures {
    private int sideOne;
    private int sideTwo;

    public Rectangle(int sideOne, int sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public Rectangle() {
        super();
    }

    public double perimeter() {
        return (double) 2 * (sideOne + sideTwo);
    }

    public double square() {
        return (double) sideOne * sideTwo;
    }


    public int getSideOne() {
        return sideOne;
    }

    public void setSideOne(int sideOne) {
        this.sideOne = sideOne;
    }

    public int getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(int sideTwo) {
        this.sideTwo = sideTwo;
    }

}
