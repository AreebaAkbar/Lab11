package lab11;

public class Lab11 {

    public static void main(String[] args) {
        // Rectangle test
        double width = 5, length = 7;
        Shape rectangle = new Rectangle(width, length);
        System.out.println("Rectangle width: " + width + " and length: " + length
                + "\nArea: " + rectangle.area()
                + "\nPerimeter: " + rectangle.perimeter() + "\n");

        // Circle test
        double radius = 5;
        Shape circle = new Circle(radius);
        System.out.println("Circle radius: " + radius
            + "\nArea: " + circle.area()
            + "\nPerimeter: " + circle.perimeter() + "\n");

        // Triangle test
        double a = 5, b = 3, c = 4;
        Shape triangle = new Triangle(a,b,c);
        System.out.println("Triangle sides lengths: " + a + ", " + b + ", " + c
                + "\nArea: " + triangle.area()
                + "\nPerimeter: " + triangle.perimeter() + "\n");
    }
    
}
