package lesson7.figures;

import static java.lang.Math.sqrt;

public class Triangle extends Figures {
    private int sideOne;
    private int sideTwo;
    private int sideThree;

    public Triangle(int sideOne, int sideTwo, int sideThree) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
        this.sideThree = sideThree;
    }

    public Triangle() {
        super();
    }

    public double perimeter() {
        return (double) sideOne + sideTwo + sideThree;
    }

    public double square() {
        double pt = perimeter();
        double square = sqrt((pt * (pt - sideOne) * (pt - sideTwo) * (pt - sideThree)));
        return square;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }

    @Override
    public void setPerimeter(double perimeter) {
        super.setPerimeter(perimeter);
    }

    @Override
    public double getSquare() {
        return super.getSquare();
    }

    @Override
    public void setSquare(double square) {
        super.setSquare(square);
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

    public int getSideThree() {
        return sideThree;
    }

    public void setSideThree(int sideThree) {
        this.sideThree = sideThree;
    }
}
