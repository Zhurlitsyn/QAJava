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


    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
