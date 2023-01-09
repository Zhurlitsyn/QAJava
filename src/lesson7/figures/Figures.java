package lesson7.figures;

public abstract class Figures {
    private double perimeter;
    private double square;

    public Figures() {
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getSquare() {
        return square;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public abstract double perimeter();

    public abstract double square();


}
