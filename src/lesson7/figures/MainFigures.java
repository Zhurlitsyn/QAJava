package lesson7.figures;

public class MainFigures {
    public static void main(String[] args) {
        Figures[] figures = new Figures[5];
        Triangle triangle1 = new Triangle(3, 4, 7);
        Triangle triangle2 = new Triangle(9, 16, 34);
        Rectangle rectangle1 = new Rectangle(7, 13);
        Circle circle1 = new Circle(5);
        Circle circle2 = new Circle(21);
        triangle1.setPerimeter(triangle1.perimeter());
        triangle1.setSquare(triangle1.square());
        figures[0] = triangle1;
        triangle2.setPerimeter(triangle2.perimeter());
        triangle2.setSquare(triangle2.square());
        figures[1] = triangle2;
        rectangle1.setPerimeter(rectangle1.perimeter());
        rectangle1.setSquare(rectangle1.square());
        figures[2] = rectangle1;
        circle1.setPerimeter(circle1.perimeter());
        circle2.setPerimeter(circle2.perimeter());
        circle1.setSquare(circle1.square());
        circle2.setSquare(circle2.square());
        figures[3] = circle1;
        figures[4] = circle2;

        double perimeterFigures = 0;
        for (Figures i : figures) {
            perimeterFigures += i.getPerimeter();
            System.out.print("| " + i.getPerimeter() + " | ");
        }
        System.out.println("\n Perimeter of all Figures in figures array is ");
        System.out.printf("%.2f", perimeterFigures);

    }
}
