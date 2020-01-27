public class ShapeTester {
    public static void main(String[] args) {
        ShapeCalculator scalc = new ShapeCalculator();

        Square square = new Square(2.0);
        Circle circle = new Circle(3.0);
        Triangle triangle = new Triangle(3.0,4.0,5.0);
        Rectangle rectangle = new Rectangle(2.0, 4.0);

        double squareArea1 = scalc.squareArea(square);
        double circleArea1 = scalc.circleArea(circle);
        double trianglePerimeter1 = scalc.trianglePerimeter(triangle);
        double rectanglePerimeter1 = scalc.rectPerimeter(rectangle);

        System.out.println("Pole kwadratu o boku " + square.a + " wynosi: " + squareArea1);
        System.out.println("Pole koła o promieniu " + circle.r + " wynosi: " + circleArea1);
        System.out.println("Obwód trójkąta o bokach: " + triangle.a + ", " + triangle.b + ", " + triangle.c + " wynosi: " + trianglePerimeter1);
        System.out.println("Obwód prostokąta o bokach: " + rectangle.a + ", " + rectangle.b + " wynosi: " + rectanglePerimeter1);

    }
}
