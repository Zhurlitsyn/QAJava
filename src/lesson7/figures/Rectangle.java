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

}
