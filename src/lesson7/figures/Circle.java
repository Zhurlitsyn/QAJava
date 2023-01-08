package lesson7.figures;

public class Circle extends Figures {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public Circle() {
        super();
    }

    public double perimeter() {
        return (double) 2 * 3.14 * radius;
    }

    public double square() {
        return 3.14 * Math.pow(radius, 2);
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

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
